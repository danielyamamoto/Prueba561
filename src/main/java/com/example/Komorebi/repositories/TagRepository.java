package com.example.Komorebi.repositories;

import com.example.Komorebi.models.Tag;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TagRepository {
    public List<Tag> findAll() {
        Tag t1 = new Tag();
        t1.setName("Ropa");
        t1.setCategory("Ventas");

        Tag t2 = new Tag();
        t2.setName("Devoluciones");
        t2.setCategory("Servicio al cliente");

        List<Tag> tgs = new ArrayList<>();
        tgs.add(t1);
        tgs.add(t2);

        return tgs;
    }
}
