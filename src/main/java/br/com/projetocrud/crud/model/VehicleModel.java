package br.com.projetocrud.crud.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity

@Table(name = "vehicle")

public class VehicleModel implements Serializable{

    private String brand; /*marca*/
    private String model; /*modelo*/
    private String color; /*cor*/

    public VehicleModel() {
    }

    public VehicleModel(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
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
