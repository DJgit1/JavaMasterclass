package com.dj.first;

public class Item {

    private String type;

    public Item (String type){
        this.type =type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                '}';
    }
}
