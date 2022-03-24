package br.com.projetocrud.crud.repository;

import br.com.projetocrud.crud.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Long> {



}
