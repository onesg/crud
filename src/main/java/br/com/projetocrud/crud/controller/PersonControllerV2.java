package br.com.projetocrud.crud.controller;

import br.com.projetocrud.crud.model.PersonModelV2;
import br.com.projetocrud.crud.service.PersonServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* SERÁ UM CONTROLADOR REST (MESMA LÓGICA DAS SERVLETS) */
@RestController

/* PONTO DE ENTRADA DO CONTROLADOR */
@RequestMapping("/person/v2")

public class PersonControllerV2 {

    /* Autowired IRÁ INJETAR AS DEPENDêNCIAS */
    @Autowired

    /* DECLARANDO O SERVIÇO service */
    private PersonServiceV2 service;

    /* QUALQUER REQUISIÇÃO VIA GET PARA /person/<ID> SERÁ DIRECIONADO PARA ESSE MÉTODO */
    @GetMapping("/{id}")
    public PersonModelV2 findbyId(@PathVariable("id") long id) throws Exception{
        return service.findbyId(id);
    }

    /* CASO NÃO TENHA NADA DEPOIS DE /<ID> OS DADOS SERÃO LISTADOS NESTE MÉTODO */
    @GetMapping
    public List<PersonModelV2> findAll(){
        return service.findAll();
    }

    /* METODO SALVAR */
    @PostMapping
    public PersonModelV2 save(@RequestBody PersonModelV2 personModel){
        return service.save(personModel);
    }

    /* MÉTODO UPDATE */
    @PutMapping
    public PersonModelV2 update(@RequestBody PersonModelV2 personModel) throws Exception{
        return service.update(personModel);
    }

    /* MÉTODO DELETE */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) throws Exception{
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
