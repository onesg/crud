package br.com.projetocrud.crud.service;

import br.com.projetocrud.crud.model.PersonModel;
import br.com.projetocrud.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* DECLARANDO QUE ESSA CLASSE É UM SEVIÇO, ENTÃO É POSSÍVEL FAZER A INJEÇÃO DE DEPENDÊNCIAS */
@Service

public class PersonService {

    /* Autowired IRÁ INJETAR AS DEPENDêNCIAS */
    @Autowired

    /* REPOSITÓRIO CRIADO */
    private PersonRepository repository;

    /* MÉTODO CARREGAR - OBS: CASO NÃO FOR ENCONTRADO UM VALOR, UMA EXCESSÃO SERÁ DISPARADA */
    public PersonModel findbyId(long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("Não encontrado"));
    }

    /* MÉTODO LISTAR */
    public List<PersonModel> findAll(){
        return repository.findAll();
    }

    /* MÉTODO SALVAR */
    public PersonModel save(PersonModel person){
        return repository.save(person);
    }

    /* MÉTODO UPDATE */
    public PersonModel update(PersonModel person) throws Exception{
        PersonModel p = findbyId(person.getId());
        p.setFirstName(person.getFirstName());
        p.setLastName(person.getLastName());
        p.setEmail(person.getEmail());
        return repository.save(p);
    }

    /* MÉTODO DELETAR */
    public void delete(long id) throws Exception{
        PersonModel p = findbyId(id);
        repository.delete(p);
    }

}
