/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 * 
 * @author David Massana
 */
public class Resultado {

    private int idResultado;
    private Usuario currentUser;
    private double promedio;
    private Ronda rondaUser;

    public Resultado(){}
    
    public Resultado(int idResultado, Usuario currentUser, double promedio, Ronda rondaUser) {
        this.idResultado = idResultado;
        this.currentUser = currentUser;
        this.promedio = promedio;
        this.rondaUser = rondaUser;
    }

    public int getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(int idResultado) {
        this.idResultado = idResultado;
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Usuario currentUser) {
        this.currentUser = currentUser;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Ronda getRondaUser() {
        return rondaUser;
    }

    public void setRondaUser(Ronda rondaUser) {
        this.rondaUser = rondaUser;
    }
    
    
    
}
