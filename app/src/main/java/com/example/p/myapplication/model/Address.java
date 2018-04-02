package com.example.p.myapplication.model;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public String createMessage() {
        String s = "";

        s = "\n\tstreet : " + street
                + "\n\tsuite : " + suite
                + "\n\tcity : " + city
                + "\n\tzipcode : " + zipcode
                + "\n\tgeo : {" + geo.createMessage() + "\n\t}";

        return  s;
    }
}
