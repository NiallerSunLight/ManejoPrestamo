/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

/**
 * 
 * @author Edwin Adrada Ruiz cod: 104617020514
 */
public class ManejoPrestamo {
    
    private State estado;

    public ManejoPrestamo() {
        this.estado = new Pagando(this);
    }
    
    public void changeState(State estado){
        this.estado = estado;
    }

}
