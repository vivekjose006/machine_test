package com.fiver.machinetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.fiver.machinetest.adpter.ProductItemAdapter;
import com.fiver.machinetest.model.ProductModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private List<ProductModel.Product>mDataList;
    private RecyclerView recycler_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDataList=new ArrayList<>();

        getProducts();
       recycler_view= (RecyclerView)findViewById(R.id.recyclerView);
      recycler_view.setHasFixedSize(true);
      recycler_view.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getProducts() {
        Call<ProductModel> call = new ProductData().getProducts();//RetrofitClient.getInstance().getMyApi().getsuperHeroes();
        call.enqueue(new Callback<ProductModel>() {
            @Override
            public void onResponse(Call<ProductModel> call, Response<ProductModel> response) {


              Log.println(Log.ASSERT, "hii", String.valueOf(response.body().getProducts().size()));
                Log.println(Log.ASSERT, "hello", response.body().getProducts().get(0).imageUrl.toString());

                for(int i=0;i<response.body().getProducts().size();i++){

                    mDataList.add( response.body().getProducts().get(i));
                    Log.println(Log.ASSERT, "hii", mDataList.get(i).imageUrl);
                }
                ProductItemAdapter adapter=new ProductItemAdapter(MainActivity.this,mDataList);
                recycler_view.setAdapter(adapter);


                // superListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, oneHeroes));
            }

            @Override
            public void onFailure(Call<ProductModel> call, Throwable t) {
                Log.println(Log.ASSERT, "hello", t.toString());
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }

        });
    }
}