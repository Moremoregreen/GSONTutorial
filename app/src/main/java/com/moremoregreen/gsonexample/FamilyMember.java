package com.moremoregreen.gsonexample;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {
    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private int mAge;

    public FamilyMember(String Role, int Age) {
        mRole = Role;
        mAge = Age;
    }
}
