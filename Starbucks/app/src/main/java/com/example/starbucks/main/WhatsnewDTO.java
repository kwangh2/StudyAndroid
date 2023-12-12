package com.example.starbucks.main;

public class WhatsnewDTO {
    private int img_new;
    private String title, subtitle;

    public WhatsnewDTO(int img_new, String title, String subtitle) {
        this.img_new = img_new;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImg_new() {
        return img_new;
    }

    public void setImg_new(int img_new) {
        this.img_new = img_new;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
