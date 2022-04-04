package com.example.Komorebi.models;

import java.sql.Timestamp;

public class Video {
    Timestamp timestamp;
    boolean successfulOutcome;
    String idAgente, tag, category;

    public String getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(String idAgente) {
        this.idAgente = idAgente;
    }

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

    public boolean isSuccessfulOutcome() {
        return successfulOutcome;
    }

    public void setSuccessfulOutcome(boolean successfulOutcome) {
        this.successfulOutcome = successfulOutcome;
    }
}
