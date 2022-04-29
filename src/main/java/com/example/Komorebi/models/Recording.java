package com.example.Komorebi.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import org.springframework.data.annotation.Id;

import java.util.Set;

@DynamoDBTable(tableName = "Recording")
public class Recording {
    @Id
    private RecordingKey recordingKey;

    private Integer duration, videoId, noteId, customerId;
    private String category, agentName, agentLastname, noteText, customerName, customerLastname, resolution;
    private Boolean successfulOutcome, allowSharing;
    private Set<String> tag;

    // RecordingKey ID
    //public RecordingKey getRecordingKey() { return recordingKey; }

    // Partition key
    @DynamoDBHashKey(attributeName = "agentId")
    public String getAgentId() {
        if (recordingKey != null) return recordingKey.getAgentId();
        return null;
    }

    public void setAgentId(String agentId) {
        if (recordingKey == null) recordingKey = new RecordingKey();
        recordingKey.setAgentId(agentId);
    }

    // Sort key
    @DynamoDBRangeKey(attributeName = "timestamp")
    public Long getTimestamp() {
        if (recordingKey != null) return recordingKey.getTimestamp();
        return null;
    }

    public void setTimestamp(Long timestamp) {
        if (recordingKey == null) recordingKey = new RecordingKey();
        recordingKey.setTimestamp(timestamp);
    }

    @DynamoDBAttribute(attributeName = "videoId")
    public Integer getVideoId() { return videoId; }
    public void setVideoId(Integer videoId) { this.videoId = videoId; }

    @DynamoDBAttribute(attributeName = "duration")
    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    @DynamoDBAttribute(attributeName = "tag")
    public Set<String> getTag() { return tag; }
    public void setTag(Set<String> tag) { this.tag = tag; }

    @DynamoDBAttribute(attributeName = "category")
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @DynamoDBAttribute(attributeName = "successfulOutcome")
    public Boolean getSuccessfulOutcome() { return successfulOutcome; }
    public void setSuccessfulOutcome(Boolean successfulOutcome) { this.successfulOutcome = successfulOutcome; }

    @DynamoDBAttribute(attributeName = "agentName")
    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }

    @DynamoDBAttribute(attributeName = "agentLastname")
    public String getAgentLastname() { return agentLastname; }
    public void setAgentLastname(String agentLastname) { this.agentLastname = agentLastname; }

    @DynamoDBAttribute(attributeName = "noteId")
    public Integer getNoteId() { return noteId; }
    public void setNoteId(Integer noteId) { this.noteId = noteId; }

    @DynamoDBAttribute(attributeName = "noteText")
    public String getNoteText() { return noteText; }
    public void setNoteText(String noteText) { this.noteText = noteText; }

    @DynamoDBAttribute(attributeName = "customerId")
    public Integer getCustomerId() { return customerId; }
    public void setCustomerId(Integer customerId) { this.customerId = customerId; }

    @DynamoDBAttribute(attributeName = "customerName")
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    @DynamoDBAttribute(attributeName = "customerLastname")
    public String getCustomerLastname() { return customerLastname; }
    public void setCustomerLastname(String customerLastname) { this.customerLastname = customerLastname; }

    @DynamoDBAttribute(attributeName = "resolution")
    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    @DynamoDBAttribute(attributeName = "allowSharing")
    public Boolean getAllowSharing() { return allowSharing; }
    public void setAllowSharing(Boolean allowSharing) { this.allowSharing = allowSharing; }
}
