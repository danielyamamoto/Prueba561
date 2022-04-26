package com.example.Komorebi.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

import java.io.Serializable;


public class RecordingKey implements Serializable {
    private static final long serialVersionUID = 1L;

    @DynamoDBHashKey
    private String agentId;

    @DynamoDBRangeKey
    private Long timestamp;

    public String getAgentId() { return agentId; }
    public void setAgentId(String agentId) { this.agentId = agentId; }

    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long timestamp) { this.timestamp = timestamp; }
}
