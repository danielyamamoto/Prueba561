package com.example.Komorebi.controllers;

import com.example.Komorebi.models.Recording;
import com.example.Komorebi.services.RecordingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/recording")
public class RecordingController {
    @Autowired
    RecordingService recordingService;

    @GetMapping("/all")
    public List<Recording> getAllRecordings() {
        return recordingService.findAll();
    }

    @PostMapping("/save")
    public Recording saveRecording(@RequestBody Recording R) {
        System.out.println(R.getAgentId());
        System.out.println(R.getTimestamp());
        return recordingService.saveRecording(R);
    }
}
