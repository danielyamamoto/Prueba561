package com.example.Komorebi.models;

import java.sql.Timestamp;

public class Video {
    private Timestamp timestamp;
    private Boolean successfulOutcome, isActive;
    private String idAgente, tag, category;

    public Boolean getSuccessfulOutcome() { return successfulOutcome; }

    public void setSuccessfulOutcome(Boolean successfulOutcome) { this.successfulOutcome = successfulOutcome; }

    public String getIdAgente() {
        return idAgente;
    }

    public Boolean getActive() { return isActive; }

    public void setActive(Boolean active) { isActive = active; }

    public void setIdAgente(String idAgente) { this.idAgente = idAgente; }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean isSuccessfulOutcome() {
        return successfulOutcome;
    }

    public void setSuccessfulOutcome(boolean successfulOutcome) {
        this.successfulOutcome = successfulOutcome;
    }
}
