package com.mamithi.delivery.Model;

/**
 * Created by mamithi on 1/31/18.
 */

public class Food {
    private String Name, Description, Image, Price, MenuId, Discount;

    public Food() {
    }

    public Food(String name, String description, String image, String price, String menuId, String discount) {
        Name = name;
        Description = description;
        Image = image;
        Price = price;
        MenuId = menuId;
        Discount = discount;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
