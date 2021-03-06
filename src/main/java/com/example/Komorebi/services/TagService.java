package com.example.Komorebi.services;

import com.example.Komorebi.models.Tag;
import com.example.Komorebi.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    public Tag changeCategory(Tag tag, String newTagName) {
        tag.setCategory(newTagName);
        return tag;
    }

    public Tag getById(int id) { return tagRepository.findById(id); }

    public List<Tag> getTags() { return tagRepository.findAll(); }

    public void deleteTag(int id) { tagRepository.deleteTag(id); }

    public Tag createTag() { return tagRepository.createTag(); }
}
