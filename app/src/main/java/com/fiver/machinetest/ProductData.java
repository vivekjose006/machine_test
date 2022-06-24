package com.fiver.machinetest;

import com.fiver.machinetest.model.ProductModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vivek Jose on 24-06-2022.
 * <p>
 * project-MachineTest
 * <p>
 * vivekjoseofficial@gmail.com
 */
public class ProductData {
    public  String baseUrl="https://run.mocky.io/";
    public Call<ProductModel> getProducts() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);



        return retrofitAPI.getProduct();
    }

}
