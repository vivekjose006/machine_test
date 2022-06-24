package com.fiver.machinetest;

import com.fiver.machinetest.model.Login;
import com.fiver.machinetest.model.ProductModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Vivek Jose on 31-01-2022.
 *
 * E-mail - vivekjoseofficial@gmail.com
 */
public interface RetrofitAPI {
    @Headers({"Authorization: Basic cnpwX2xpdmVfSmVjNkdpUmdDOGdWdFA6N1FvNFhjVVVvdHBxdWhNS3dSbmNTc2lT",
    })
    @POST("/Users/UserAuthentication")

    Call<Login> createLogin(@Body Login login);
    @GET("/v3/bd26945d-228e-45b4-94a3-04c74f085e40")
    Call <ProductModel>getProduct();
}
