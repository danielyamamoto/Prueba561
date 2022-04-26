package com.example.Komorebi.services;

import com.example.Komorebi.models.Recording;
import com.example.Komorebi.repositories.RecordingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordingService {
    @Autowired
    RecordingRepository recordingRepository;

    public List<Recording> findAll() {
        return recordingRepository.findAll();
    }

    // Post
    public Recording saveRecording(Recording R) { return recordingRepository.save(R); }
}