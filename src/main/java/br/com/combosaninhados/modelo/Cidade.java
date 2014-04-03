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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author altitdb
 */
@Entity
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CID_ID;
    private String CID_NOME;
    @ManyToOne
    @JoinColumn(name = "EST_ID")
    private Estado estado;

    public Cidade() {
    }

    public Long getCID_ID() {
        return CID_ID;
    }

    public void setCID_ID(Long CID_ID) {
        this.CID_ID = CID_ID;
    }

    public String getCID_NOME() {
        return CID_NOME;
    }

    public void setCID_NOME(String CID_NOME) {
        this.CID_NOME = CID_NOME;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.CID_ID != null ? this.CID_ID.hashCode() : 0);
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
        final Cidade other = (Cidade) obj;
        if (this.CID_ID != other.CID_ID && (this.CID_ID == null || !this.CID_ID.equals(other.CID_ID))) {
            return false;
        }
        return true;
    }
    
    

  
    
    
}
