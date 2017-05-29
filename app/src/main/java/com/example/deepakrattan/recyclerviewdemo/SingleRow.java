package com.example.deepakrattan.recyclerviewdemo;

/**
 * Created by Deepak Rattan on 29-May-17.
 */

public class SingleRow {
    private int image;
    private String title, desc;

    public SingleRow(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
