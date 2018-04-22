package com.androidonlineshop.androidonlineshop.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by ibraa on 17-Apr-18.
 */

@Entity(tableName = "item")
public class ItemEntity{

    @PrimaryKey(autoGenerate = true)
    private long id;

    private String name;
    private double price;
    private String description;
    private int rating;

    private long cartid;
    private long categoryid;


    public ItemEntity() {}

    public ItemEntity(String name, double price, String description, int rating, long cartid, long categoryid)
    {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.cartid = cartid;
        this.categoryid = categoryid;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getRating() { return rating; }

    public void setRating(int rating) { this.rating = rating; }

    public long getCartid() { return cartid; }

    public void setCartid(long cartid) { this.cartid = cartid; }

    public long getCategoryid() { return categoryid; }

    public void setCategoryid(long categoryid) { this.categoryid = categoryid; }

}