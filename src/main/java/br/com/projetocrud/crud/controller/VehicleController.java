package br.com.projetocrud.crud.controller;

import br.com.projetocrud.crud.model.VehicleModel;
import br.com.projetocrud.crud.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* SERÁ UM CONTROLADOR REST (MESMA LÓGICA DAS SERVLETS) */
@RestController

/* PONTO DE ENTRADA DO CONTROLADOR */
@RequestMapping("/vehicle")

public class VehicleController {

    /* Autowired IRÁ INJETAR AS DEPENDêNCIAS */
    @Autowired

    /* DECLARANDO O SERVIÇO service */
    private VehicleService service;

    /* QUALQUER REQUISIÇÃO VIA GET PARA /vehicle/<ID> SERÁ DIRECIONADO PARA ESSE MÉTODO */
    @GetMapping("/{id}")
    public VehicleModel findbyId(@PathVariable("id") long id) throws Exception{
        return service.findbyId(id);
    }

    /* CASO NÃO TENHA NADA DEPOIS DE /<ID> OS DADOS SERÃO LISTADOS NESTE MÉTODO */
    @GetMapping
    public List<VehicleModel> findAll(){
        return service.findAll();
    }

    /* METODO SALVAR */
    @PostMapping
    public VehicleModel save(@RequestBody VehicleModel vehicleModel){
        return service.save(vehicleModel);
    }

    /* MÉTODO UPDATE */
    @PutMapping
    public VehicleModel update(@RequestBody VehicleModel vehicleModel) throws Exception {
        return service.update(vehicleModel);
    }

    /* MÉTODO DELETE */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) throws Exception {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
