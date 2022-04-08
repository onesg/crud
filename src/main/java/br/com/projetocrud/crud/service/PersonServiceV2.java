package br.com.projetocrud.crud.service;

import br.com.projetocrud.crud.model.PersonModelV2;
import br.com.projetocrud.crud.repository.PersonRepositoryV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* DECLARANDO QUE ESSA CLASSE É UM SEVIÇO, ENTÃO É POSSÍVEL FAZER A INJEÇÃO DE DEPENDÊNCIAS */
@Service

public class PersonServiceV2 {

    /* Autowired IRÁ INJETAR AS DEPENDêNCIAS */
    @Autowired

    /* REPOSITÓRIO CRIADO */
    private PersonRepositoryV2 repository;

    /* MÉTODO CARREGAR - OBS: CASO NÃO FOR ENCONTRADO UM VALOR, UMA EXCESSÃO SERÁ DISPARADA */
    public PersonModelV2 findbyId(long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("Não encontrado"));
    }

    /* MÉTODO LISTAR */
    public List<PersonModelV2> findAll(){
        return repository.findAll();
    }

    /* MÉTODO SALVAR */
    public PersonModelV2 save(PersonModelV2 person){
        return repository.save(person);
    }

    /* MÉTODO UPDATE */
    public PersonModelV2 update(PersonModelV2 person) throws Exception{
        PersonModelV2 p = findbyId(person.getId());
        p.setFirstName(person.getFirstName());
        p.setLastName(person.getLastName());
        p.setEmail(person.getEmail());
        p.setProfession(person.getProfession());
        return repository.save(p);
    }

    /* MÉTODO DELETAR */
    public void delete(long id) throws Exception{
        PersonModelV2 p = findbyId(id);
        repository.delete(p);
    }

}
