package com.example.Komorebi.controllers;

import com.example.Komorebi.models.Person;
import com.example.Komorebi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/persona")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/perfil")
    public Person getPerfil() {
        Person p = new Person();
        p.setName("Daniel");
        p.setAge(24);
        return p;
    }

    @PostMapping("/registrar")
    public Person registrarPersona(@RequestBody Person person) {
        System.out.println(person.getName());
        System.out.println(person.getAge());
        return person;
    }

    @PostMapping("/cumplir-anios")
    public Person cumplirAnios(@RequestBody Person person) {
        personService.cumplirAnios(person);
        return person;
    }

    @GetMapping("/todos")
    public List<Person> getAll() {
        return personService.getAllPersons();
    }

    @GetMapping("/obtener/{id}")
    public Person findById(@PathVariable("id") int id) {
        return  personService.getById(id);
    }
}
