package br.com.projetocrud.crud.service;

import br.com.projetocrud.crud.model.VehicleModel;
import br.com.projetocrud.crud.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* DECLARANDO QUE ESSA CLASSE É UM SEVIÇO, ENTÃO É POSSÍVEL FAZER A INJEÇÃO DE DEPENDÊNCIAS */
@Service

public class VehicleService {

    /* Autowired IRÁ INJETAR AS DEPENDêNCIAS */
    @Autowired

    /* REPOSITÓRIO CRIADO */
    private VehicleRepository repository;

    /* MÉTODO CARREGAR - OBS: CASO NÃO FOR ENCONTRADO UM VALOR, UMA EXCESSÃO SERÁ DISPARADA */
    public VehicleModel findbyId(long id) throws Exception {
        return repository.findById(id).orElseThrow(() -> new Exception("Não encontrado"));
    }

    /* MÉTODO LISTAR */
    public List<VehicleModel> findAll(){
        return repository.findAll();
    }

    /* MÉTODO SALVAR */
    public VehicleModel save(VehicleModel vehicle){
        return repository.save(vehicle);
    }

    /* MÉTODO UPDATE */
    public VehicleModel update(VehicleModel vehicle) throws Exception{
        VehicleModel v = findbyId(vehicle.getId());
        v.setBrand(vehicle.getBrand());
        v.setModel(vehicle.getModel());
        v.setColor(vehicle.getColor());
        return repository.save(v);
    }

    /* MÉTODO DELETAR */
    public void delete(long id) throws Exception{
        VehicleModel v = findbyId(id);
        repository.delete(v);
    }

}