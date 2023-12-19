package com.example.starbucks.order;

public class BeverageCategoryDTO {
    private String name , subtitle;
    private int img_menu;

    public BeverageCategoryDTO(String name, String subtitle, int img_menu) {
        this.name = name;
        this.subtitle = subtitle;
        this.img_menu = img_menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getImg_menu() {
        return img_menu;
    }

    public void setImg_menu(int img_menu) {
        this.img_menu = img_menu;
    }
}
