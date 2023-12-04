package com.example.and10_fragmentadapter2.melon;

import android.widget.ImageView;

public class MelonDTO {
    private int img_cover;
    private String songName , singerName;

    public MelonDTO(int img_cover, String songName, String singerName) {
        this.img_cover = img_cover;
        this.songName = songName;
        this.singerName = singerName;
    }

    public int getImg_cover() {
        return img_cover;
    }

    public void setImg_cover(int img_cover) {
        this.img_cover = img_cover;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
}
