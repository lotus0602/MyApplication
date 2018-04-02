package com.example.p.myapplication.model;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String createMessage() {
        String s = "";

        s = "id : " + id
                + "\nname : " + name
                + "\nusername : " + username
                + "\nemail : " + email
                + "\naddress : {" + address.createMessage() + "\n}"
                + "\nphone : " + phone
                + "\nwebsite : " + website
                + "\ncompany : {" + company.createMessage() + "\n}";

        return s;
    }
}
