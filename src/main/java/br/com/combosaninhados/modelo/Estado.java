/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.combosaninhados.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author altitdb
 */
@Entity
public class Estado implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EST_ID;
    private String EST_NOME;
    private String EST_UF;

    public Estado() {
    }

    public Long getEST_ID() {
        return EST_ID;
    }

    public void setEST_ID(Long EST_ID) {
        this.EST_ID = EST_ID;
    }

    public String getEST_NOME() {
        return EST_NOME;
    }

    public void setEST_NOME(String EST_NOME) {
        this.EST_NOME = EST_NOME;
    }

    public String getEST_UF() {
        return EST_UF;
    }

    public void setEST_UF(String EST_UF) {
        this.EST_UF = EST_UF;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.EST_ID != null ? this.EST_ID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estado other = (Estado) obj;
        if (this.EST_ID != other.EST_ID && (this.EST_ID == null || !this.EST_ID.equals(other.EST_ID))) {
            return false;
        }
        return true;
    }


    

}
