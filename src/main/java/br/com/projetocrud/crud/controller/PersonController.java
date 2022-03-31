package br.com.projetocrud.crud.controller;

import br.com.projetocrud.crud.model.PersonModel;
import br.com.projetocrud.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* SERÁ UM CONTROLADOR REST (MESMA LÓGICA DAS SERVLETS) */
@RestController

/* PONTO DE ENTRADA DO CONTROLADOR */
@RequestMapping("/person")

public class PersonController {

    /* Autowired IRÁ INJETAR AS DEPENDêNCIAS */
    @Autowired

    /* DECLARANDO O SERVIÇO service */
    private PersonService service;

    /* QUALQUER REQUISIÇÃO VIA GET PARA /person/<ID> SERÁ DIRECIONADO PARA ESSE MÉTODO */
    @GetMapping("/{id}")
    public PersonModel findbyId(@PathVariable("id") long id) throws Exception{
        return service.findbyId(id);
    }

    /* CASO NÃO TENHA NADA DEPOIS DE /<ID> OS DADOS SERÃO LISTADOS NESTE MÉTODO */
    @GetMapping
    public List<PersonModel> findAll(){
        return service.findAll();
    }

    /* METODO SALVAR */
    @PostMapping
    public PersonModel save(@RequestBody PersonModel personModel){
        return service.save(personModel);
    }

    /* MÉTODO UPDATE */
    @PutMapping
    public PersonModel update(@RequestBody PersonModel personModel) throws Exception{
        return service.update(personModel);
    }

    /* MÉTODO DELETE */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) throws Exception{
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
