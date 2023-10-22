/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author lechgar
 */
@Entity
@NamedQuery(name = "findAllSalle", query = "from Salle")

public class Salle implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idS;
    private String code;
    //@OneToMany (mappedBy = "salle", fetch = FetchType.EAGER)
  //  private List<Machine> machines;

    public Salle() {
    }
    public Salle(String code) {
        this.code = code;
    }
    public Salle(int idS, String code) {
        this.idS = idS;
        this.code = code;
    }
    public int getIdS() {
        return idS;
    }
    public void setIdS(int id) {
        this.idS = idS;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public String toString() {
            return code;
    }
}
