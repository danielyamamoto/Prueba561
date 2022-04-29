package com.example.Komorebi.repositories;

import com.example.Komorebi.models.Recording;
import com.example.Komorebi.models.RecordingKey;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableScan
public interface RecordingRepository extends CrudRepository<Recording, RecordingKey> {
    List<Recording> findAll();
    Recording save(Recording R);
    //void deleteById(RecordingKey recordingKey);
}