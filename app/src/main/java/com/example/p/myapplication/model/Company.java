package com.example.p.myapplication.model;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public String createMessage() {
        String s = "";

        s = "\n\tname : " + name
                + "\n\tcatchPhrase : " + catchPhrase
                + "\n\tbs : " + bs;

        return  s;
    }
}
