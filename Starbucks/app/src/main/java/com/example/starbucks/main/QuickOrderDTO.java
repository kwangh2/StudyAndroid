package com.example.starbucks.main;

public class QuickOrderDTO {
    private String menu , option,shop;

    public QuickOrderDTO(String menu, String option, String shop) {
        this.menu = menu;
        this.option = option;
        this.shop = shop;
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
