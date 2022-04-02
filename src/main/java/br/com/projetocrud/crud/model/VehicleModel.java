package br.com.projetocrud.crud.model;

import javax.persistence.*;
import java.io.Serializable;

/* TRANSFORMA A MODEL NUMA ENTIDADE DE BANCO DE DADOS */
@Entity

/* TABELA NA QUAL FAZ REFERENCIA */
@Table(name = "vehicle")

public class VehicleModel implements Serializable{

    /* O CAMPO SERA A CHAVE PRIMARIA */
    @Id
    /* O VALOR DA CHAVE SERA GERADO AUTOMATICAMENTE PELO IDENTADOR */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /* CAMPO ID */
    private long id;

    /* CAMPO MARCA */
    @Column(nullable = false, length = 32)
    private String brand;

    /* CAMPO MODELO */
    @Column(nullable = false, length = 32)
    private String model;

    /* CAMPO COR */
    @Column(nullable = false, length = 32)
    private String color;

    /* CONSTRUTOR VAZIO */
    public VehicleModel() {
    }

    /* CONSTRUTOR COM ATRIBUTOS */
    public VehicleModel(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    /* MÉTODOS GETTERS */

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    /* MÉTODOS SETTERS */

    public void setId(long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
