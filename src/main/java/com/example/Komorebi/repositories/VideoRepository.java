package com.example.Komorebi.repositories;

import com.example.Komorebi.models.Video;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VideoRepository {
    public List<Video> findAll() {
        Video v1 = new Video();
        v1.setIdAgente("Tote1234");
        v1.setTag("Ropa");
        v1.setCategory("Ventas");
        v1.setTimestamp(new Timestamp(1649035032543l));
        v1.setSuccessfulOutcome(true);

        Video v2 = new Video();
        v2.setIdAgente("Tote1234");
        v2.setTag("Devoluciones");
        v2.setCategory("Servicio al cliente");
        v2.setTimestamp(new Timestamp(1649035032543l));
        v2.setSuccessfulOutcome(false);

        List<Video> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);

        return videos;
    }
}
