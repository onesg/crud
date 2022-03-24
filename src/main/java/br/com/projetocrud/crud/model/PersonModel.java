package br.com.projetocrud.crud.model;

import javax.persistence.*;
import java.io.Serializable;

/* TRANSFORMA A MODEL NUMA ENTIDADE DE BANCO DE DADOS */
@Entity

/* TABELA NA QUAL FAZ REFERENCIA */
@Table(name = "person")

public class PersonModel implements Serializable {

    /* CAMPO ID */

    /* O CAMPO SERA A CHAVE PRIMARIA */
    @Id

    /* O VALOR DA CHAVE SERA GERADO AUTOMATICAMENTE PELO IDENTADOR */
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    /* CAMPO PRIMEIRO NOME */
    @Column(name = "first_name", nullable = false, length = 40)
    private String firstName;

    /* CAMPO ULTIMO NOME */
    @Column(name = "last_name", nullable = false, length = 40)
    private String lastName;

    /* CAMPO EMAIL */
    @Column(nullable = false, length = 50) /* obs: QUANDO TIVER O MESMO NOME DA TABELA PODEMOS OCULTAR O ATRIBUTO */
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
