package br.com.projetocrud.crud.repository;

import br.com.projetocrud.crud.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* TRANSFORMANDO A CLASSE EM UM REPOSITÓRIO */
@Repository

public interface PersonRepository extends JpaRepository<PersonModel, Long> {

    /* POR TRÁS DOS PANOS IRÁ IMPLEMENTAR TODAS AS OPERAÇÕES BÁSICAS DO BANCO DE DADOS */

}
