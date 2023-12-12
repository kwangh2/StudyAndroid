package com.example.starbucks.main;

public class MainDTO {
    private String menu, option , shop;
    private int img_menu;

    public MainDTO(String menu, String option, String shop, int img_menu) {
        this.menu = menu;
        this.option = option;
        this.shop = shop;
        this.img_menu = img_menu;
    }

    public int getImg_menu() {
        return img_menu;
    }

    public void setImg_menu(int img_menu) {
        this.img_menu = img_menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
