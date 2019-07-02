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
public class Ronda {

    private int idRonda;
    private int puntaje1;
    private int puntaje2;
    private int puntaje3;
    
    public Ronda(){}

    public Ronda(int idRonda, int puntaje1, int puntaje2, int puntaje3) {
        this.idRonda = idRonda;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
        this.puntaje3 = puntaje3;
    }

    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public int getPuntaje3() {
        return puntaje3;
    }

    public void setPuntaje3(int puntaje3) {
        this.puntaje3 = puntaje3;
    }
    
    
}
