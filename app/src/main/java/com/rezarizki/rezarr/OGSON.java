package com.rezarizki.rezarr;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Ogson extends AppCompatActivity {
Button btn_request;
    TextView lbl_http_connection;
    HttpURLConnection connection = null;
    BufferedReader reader = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogson);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_request = (Button) findViewById(R.id.btn_minta);
        lbl_http_connection = (TextView) findViewById(R.id.lbl_http_connection);
        btn_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ApiConnect().execute("http://private-142c32-datausers.apiary-mock.com/users");
            }
        });
    }
    public String get_data(String url_target) {
        String line = "";
        try {
            URL url = new URL(url_target);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(connection != null) connection.disconnect();
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
   return null;
    }
public void process_json(String json_str) throws JSONException {
    try {
        lbl_http_connection.setText("");
        JSONObject api_json = new JSONObject(json_str);
        JSONArray users = api_json.getJSONArray("users");
        Gson gson_user = new Gson();
        for(int i=0; i<users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            User model_user = gson_user.fromJson(String.valueOf(user), User.class);
            lbl_http_connection.append(
                    "Id = " + model_user.getId() +
                            System.getProperty("line.separator") +
                            "Email = " + model_user.getEmail() +
                            System.getProperty("line.separator") +
                            "Password = " + model_user.getPassword() +
                            System.getProperty("line.separator") +
                            "Token Auth = " + model_user.getToken_auth() +
                            System.getProperty("line.separator") +
                                    "Created at = " + model_user.getCreated_at() +
                                    System.getProperty("line.separator") +
                                    "Updated at = " + model_user.getUpdated_at() +
                                    System.getProperty("line.separator") +
                                    System.getProperty("line.separator")
            );
        }
    } catch (JSONException e) {
        e.printStackTrace();
    }
}
    class ApiConnect extends AsyncTask<String, String, String>{
        @Override
                protected String doInBackground(String... params) {
            return get_data(params[0]);
        }
   @Override
           protected void onPostExecute(String s) {
            super.onPostExecute(s);
       try {
           process_json(s);
       } catch (JSONException e) {
           e.printStackTrace();
       }
        }
    }

}
