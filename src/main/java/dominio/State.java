/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

/**
 * 
 * @author Jesus Edwin Adrada Ruiz cod: 104617020514
 */
abstract public class State {
    
    protected ManejoPrestamo prestamo;

    public State(ManejoPrestamo prestamo) {
        this.prestamo = prestamo;
    }
    
    

}
