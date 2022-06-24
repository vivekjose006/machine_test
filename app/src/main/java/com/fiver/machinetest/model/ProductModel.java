package com.fiver.machinetest.model;

import java.util.ArrayList;

/**
 * Created by Vivek Jose on 24-06-2022.
 * <p>
 * project-MachineTest
 * <p>
 * vivekjoseofficial@gmail.com
 */
public class ProductModel {
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public boolean status;
    public String msg;

    public ProductModel(boolean status, String msg, ArrayList<Product> products) {
        this.status = status;
        this.msg = msg;
        this.products = products;
    }

    public ArrayList<Product> products;
    public class Product{
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Product(String title, int price, String imageUrl, String description) {
            this.title = title;
            this.price = price;
            this.imageUrl = imageUrl;
            this.description = description;
        }

        public String title;
        public int price;
        public String imageUrl;
        public String description;
    }




}
