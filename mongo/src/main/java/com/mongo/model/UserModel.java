package com.mongo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserModel implements Serializable {
    private Long id;
    private String userName;
    private String password;
}
