package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/cep")

public class CepController {

    @Autowired
    private CepRepository cepRepository;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Cep getCep(@PathVariable("id") long id) {

         Cep ceps = this.cepRepository.FindById(id);
         return ceps;
    }

}