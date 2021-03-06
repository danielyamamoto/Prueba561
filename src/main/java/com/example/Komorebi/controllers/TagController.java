package com.example.Komorebi.controllers;

import com.example.Komorebi.models.Tag;
import com.example.Komorebi.models.Video;
import com.example.Komorebi.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagService tagService;

    @PostMapping("/change-tag-category/{tagname}")
    public Tag changeCategoryName(@RequestBody Tag tag, @PathVariable("tagname") String tagname) {
        return tagService.changeCategory(tag, tagname);
    }

    @GetMapping("/todos")
    public List<Tag> getAll() {
        return tagService.getTags();
    }

    @GetMapping("/obtener/{id}")
    public Tag getTag(@PathVariable("id") int id) {
        return tagService.getById(id);
    }

    @PostMapping("/create")
    public Tag createTag() {
        return tagService.createTag();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTag(@PathVariable("id") int id) {
        tagService.deleteTag(id);
    }
}
