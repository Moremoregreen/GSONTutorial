package com.moremoregreen.gsonexample;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Employee2 {
    @Expose
    private String firstName;
    @Expose(serialize = false )
    private int age;
    @Expose(deserialize = false)
    private String mail;


    private  String password; //transient可以讓密碼不會顯示在json上

    public Employee2(String firstName, int age, String mail, String password) {
        this.firstName = firstName;
        this.age = age;
        this.mail = mail;
        this.password = password;
    }
}
