package com.example.myapplication222;

public class Character {
    private String name;
    private int imageResource;
    private int ImageResource2;

    public Character(String name, int imageResource, int ImageResource2) {
        this.name = name;
        this.imageResource = imageResource;
        this.ImageResource2 = ImageResource2;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getImageResource2() {
        return ImageResource2;
    }
}