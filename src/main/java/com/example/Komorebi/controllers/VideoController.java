package com.example.Komorebi.controllers;

import com.example.Komorebi.models.Video;
import com.example.Komorebi.services.VideoService;
import org.springframework  .beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    VideoService videoService;

    @PostMapping("/change-tag/{tagname}")
    public Video changeTagName(@RequestBody Video video, @PathVariable("tagname") String tagname) {
        return videoService.changeTag(video, tagname);
    }

    @PostMapping("/change-category/{tagname}")
    public Video changeCategoryName(@RequestBody Video video, @PathVariable("tagname") String tagname) {
        return videoService.changeCategory(video, tagname);
    }

    @GetMapping("/todos")
    public List<Video> getAll() {
        return videoService.getAllVideos();
    }

    @GetMapping("/obtener/{id}")
    public Video getVideo(@PathVariable("id") int id) {
        return videoService.getById(id);
    }

    @PostMapping("/create")
    public Video createVideo() {
        return videoService.createVideo();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVideo(@PathVariable("id") int id) {
        videoService.deleteVideo(id);
    }
}
