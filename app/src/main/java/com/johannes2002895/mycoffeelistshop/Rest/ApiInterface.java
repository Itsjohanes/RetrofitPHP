package com.johannes2002895.mycoffeelistshop.Rest;


import com.johannes2002895.mycoffeelistshop.Model.GetCoffee;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("restapi.php")
    Call<GetCoffee> getCoffee(@Query("function") String function);
}

