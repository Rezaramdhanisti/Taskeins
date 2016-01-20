package com.rezarizki.rezarr;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by wgs-lap148 on 1/20/16.
 */
public interface UserApi {
    @GET("/users")
    Call<Users> getUsers();

    @GET("/api/vl/auth{id}")
    Call<com.rezarizki.rezarr.users.User> getUser(@Path("id") String user_id);

    @PUT("/api/vl/auth{id}")
    Call<com.rezarizki.rezarr.users.User> updateUser(@Path("id") int user_id, @Body User user);

    @POST("/api/vl/auth")
    Call<com.rezarizki.rezarr.users.User> saveUser(@Body User user);

    @DELETE("/api/vl/auth/{id}")
    Call<com.rezarizki.rezarr.users.User> deleteUser(@Path("id") String user_id);
}
