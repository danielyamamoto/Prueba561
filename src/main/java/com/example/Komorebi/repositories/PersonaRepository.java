package com.example.Komorebi.repositories;

import com.example.Komorebi.models.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepository {
    public List<Person> findAll() {
        Person p1 = new Person();
        p1.setName("Juan");
        p1.setAge(33);

        Person p2 = new Person();
        p2.setName("Tote");
        p2.setAge(32);

        List<Person> res = new ArrayList<>();
        res.add(p1);
        res.add(p2);

        return res;
    }

    public Person findById(int id) {
        Person p1 = new Person();
        p1.setName("Juan");
        p1.setAge(33);
        return p1;
    }
}
