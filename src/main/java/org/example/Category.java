package org.example;

public class Category {
    String name;
    String comment;
    String image;

    public Category(String name) {
        this.name = name.toUpperCase();
    }

    public void SetName() {
        this.name = name.toUpperCase();
    }

    public void SetComment() {
        this.comment = comment;
    }

    public void SetImg() {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getImg() {
        return image;
    }

}