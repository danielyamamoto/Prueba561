package com.example.Komorebi.services;

import com.example.Komorebi.models.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public Person cumplirAnios(Person p) {
        p.setAge(p.getAge() + 1);
        return p;
    }
}
