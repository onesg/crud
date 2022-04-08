package br.com.projetocrud.crud.repository;

import br.com.projetocrud.crud.model.PersonModelV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* TRANSFORMANDO A CLASSE EM UM REPOSITÓRIO */
@Repository

public interface PersonRepositoryV2 extends JpaRepository<PersonModelV2, Long> {

    /* POR TRÁS DOS PANOS IRÁ IMPLEMENTAR TODAS AS OPERAÇÕES BÁSICAS DO BANCO DE DADOS */

}
