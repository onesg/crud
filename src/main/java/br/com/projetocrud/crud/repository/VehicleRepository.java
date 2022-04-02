package br.com.projetocrud.crud.repository;

import br.com.projetocrud.crud.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* TRANSFORMANDO A CLASSE EM UM REPOSITÓRIO */
@Repository

public interface VehicleRepository extends JpaRepository<VehicleModel, Long> {

    /* TODAS AS OPERAÇÕES BÁSICAS DO BANCO DE DADOS SERÃO IMPLEMENTADAS */

}
