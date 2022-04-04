package com.example.Komorebi.services;

import com.example.Komorebi.models.Video;
import com.example.Komorebi.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    VideoRepository videoRepository;

    public Video changeCategory(Video video, String newCategoryName) {
        video.setCategory(newCategoryName);
        return video;
    }

    public Video changeTag(Video video, String newTagName) {
        video.setTag(newTagName);
        return video;
    }

    public List<Video> getAllVideos() { return videoRepository.findAll(); }
}
