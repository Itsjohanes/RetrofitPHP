package com.johannes2002895.mycoffeelistshop.Model;


import com.google.gson.annotations.SerializedName;

public class CoffeeDrink {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("detail")
    private String detail;
    @SerializedName("photoThumbnail")
    private String photoThumbnail;
    @SerializedName("photoPoster")
    private String photoPoster;

    public CoffeeDrink(){}

    public CoffeeDrink(String id, String name, String description, String photoThumbnail, String photoPoster) {
        this.id = id;
        this.name = name;
        this.detail = description;
        this.photoThumbnail = photoThumbnail;
        this.photoPoster = photoPoster;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhotoThumbnail() {
        return photoThumbnail;
    }

    public void setPhotoThumbnail(String photoThumbnail) {
        this.photoThumbnail = photoThumbnail;
    }

    public String getPhotoPoster() {
        return photoPoster;
    }

    public void setPhotoPoster(String photoPoster) {
        this.photoPoster = photoPoster;
    }
}
