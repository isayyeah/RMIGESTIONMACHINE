/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;

public class Machine implements Serializable{

    private int id;
    private String reference;
    private String marque;
    private double prix;
    private Salle salle;

    public Machine() {
    }
    public Machine(String reference, String marque, double prix,Salle salle) {
        this.reference = reference;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }
    public Machine(int id, String reference, String marque, double prix, Salle salle) {
        this.id = id;
        this.reference = reference;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String ref) {
        this.reference = reference;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }
    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ",reference=" + reference + ", marque=" + marque + ", prix=" + prix + '}';
    }

}