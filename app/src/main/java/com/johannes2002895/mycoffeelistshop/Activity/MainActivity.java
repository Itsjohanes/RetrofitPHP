package com.johannes2002895.mycoffeelistshop.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.johannes2002895.mycoffeelistshop.Adapter.ListCoffeeDrinkAdapter;
import com.johannes2002895.mycoffeelistshop.Model.CoffeeDrink;
import com.johannes2002895.mycoffeelistshop.Model.GetCoffee;
import com.johannes2002895.mycoffeelistshop.R;
import com.johannes2002895.mycoffeelistshop.Rest.ApiClient;
import com.johannes2002895.mycoffeelistshop.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_coffee);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);

        data();
    }

    public void data() {
        Call<GetCoffee> CoffeeCall = mApiInterface.getCoffee("get_coffee");
        CoffeeCall.enqueue(new Callback<GetCoffee>() {
            @Override
            public void onResponse(Call<GetCoffee> call, Response<GetCoffee>
                    response) {
                List<CoffeeDrink> CoffeeList = response.body().getListDataCoffeeDrink();
                Log.d("Retrofit Get", "Jumlah data Coffee: " +
                        String.valueOf(CoffeeList.size()));
                ListCoffeeDrinkAdapter listCoffeeDrinkAdapter = new ListCoffeeDrinkAdapter(CoffeeList);
                mRecyclerView.setAdapter(listCoffeeDrinkAdapter);

                //Onclick
                listCoffeeDrinkAdapter.setOnItemClickCallback(new ListCoffeeDrinkAdapter.OnItemClickCallback() {
                    @Override
                    public void onItemClicked(CoffeeDrink data) {
                        showSelectedCoffeeDrink(data);
                    }
                });
            }

            @Override
            public void onFailure(Call<GetCoffee> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

    //Onclick method
    private void showSelectedCoffeeDrink(CoffeeDrink coffeeDrink){
        Intent kirimData = new Intent(MainActivity.this, DetailActivity.class);
        kirimData.putExtra(DetailActivity.EXTRA_NAMA, coffeeDrink.getName());
        kirimData.putExtra(DetailActivity.EXTRA_DETAIL, coffeeDrink.getDetail());
        kirimData.putExtra(DetailActivity.EXTRA_IMGPOSTER, coffeeDrink.getPhotoPoster());
        startActivity(kirimData);
    }

}