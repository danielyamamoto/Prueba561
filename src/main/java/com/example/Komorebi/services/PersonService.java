package com.example.Komorebi.services;

import com.example.Komorebi.models.Person;
import com.example.Komorebi.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonaRepository personaRepository;

    public Person cumplirAnios(Person p) {
        p.setAge(p.getAge() + 1);
        return p;
    }

    public List<Person> getAllPersons() {
        return personaRepository.findAll();
    }

    public Person getById(int id) {
        return personaRepository.findById(id);
    }
}
