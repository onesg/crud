package br.com.projetocrud.crud.model;

import java.io.Serializable;

public class PersonModel implements Serializable {

    /* CAMPO ID */
    private long id;

    /* CAMPO PRIMEIRO NOME */
    private String firstName;

    /* CAMPO ULTIMO NOME */
    private String lastName;

    /* CAMPO EMAIL */
    private String email;

    /* CONSTRUTOR VAZIO */
    public PersonModel() {
    }

    /* CONSTRUTOR COM ATRIBUTOS */
    public PersonModel(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    /* METODOS GETTERS */

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    /* METODOS SETTERS */

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
