package com.johannes2002895.mycoffeelistshop.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetCoffee {
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    List<CoffeeDrink> listDataCoffeeDrink;
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<CoffeeDrink> getListDataCoffeeDrink() {
        return listDataCoffeeDrink;
    }
    public void setListDataCoffeeDrink(List<CoffeeDrink> listDataCoffeeDrink) {
        this.listDataCoffeeDrink = listDataCoffeeDrink;
    }
}
