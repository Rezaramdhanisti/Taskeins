package com.rezarizki.rezarr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class Kaolin extends AppCompatActivity {
    TextView tv_respond, tv_result_api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaolin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv_respond = (TextView) findViewById(R.id.tv_respond);
        tv_result_api = (TextView) findViewById(R.id.tv_result_api);

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://private-142c32-datausers.apiary-mock.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        UserApi user_api = retrofit.create(UserApi.class);

        Call<Users> call = user_api.getUsers();

        call.enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Response<Users> response, Retrofit retrofit) {
                int status = response.code();
                tv_respond.setText(String.valueOf(status));
                for (Users.UserItem user : response.body().getUsers()) {
                    tv_result_api.append("Id = " + String.valueOf(user.getId()) +
                                    System.getProperty("line.separator") +
                                    "Email = " + user.getEmail() +
                                    System.getProperty("line.separator") +
                                    "Password = " + user.getPassword() +
                                    System.getProperty("line.separator") +
                                    "Token Auth = " + user.getToken_auth() +
                                    System.getProperty("line.separator") +
                                    "Created at = " + user.getCreated_at() +
                                    System.getProperty("line.separator") +
                                    "Updated at = " + user.getUpdated_at() +
                                    System.getProperty("line.separator")

                    );
                }
            }


            @Override
            public void onFailure(Throwable t) {
                tv_respond.setText(String.valueOf(t));
            }
        });
    }

}



