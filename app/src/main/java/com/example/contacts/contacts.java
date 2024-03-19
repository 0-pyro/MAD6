package com.example.contacts;

public class contacts {
    public String name;
    public String number;
    public int image;
    public contacts(String name, String number, int image) {
        this.name = name;
        this.number = number;
        this.image = image;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
