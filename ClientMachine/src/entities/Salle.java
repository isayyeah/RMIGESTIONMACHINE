/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author macbookmimid
 */
public class Salle implements Serializable{
    private int idS;
    private String code;
    
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
    public void setIdS(int idS) {
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
        return "Salle{" + "idS=" + idS + ", code=" + code + '}';
    }
}
