package com.example.p.myapplication.model;

public class Geo {
    private String lat;
    private String lng;

    public String createMessage() {
        String s = "";

        s = "\n\tlat : " + lat
                + "\n\tlng : " + lng;

        return s;
    }
}
