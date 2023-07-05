package com.theconceitstudio.techintalkandroid.activitydatapass;

import java.io.Serializable;

public class UserModel implements Serializable {
    public int UserId;
    public String UserName;

    public UserModel(int id, String name){
        UserId = id;
        UserName = name;
    }
}
