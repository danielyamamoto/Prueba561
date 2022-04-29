package com.example.Komorebi.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;

public class UserKey {
    private static final long serialVersionUID = 1L;

    @DynamoDBHashKey
    private String userId;

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
