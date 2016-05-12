/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voo;

import aeronave.Aeronave;
import cadastroPilotos.piloto.Piloto;

/**
 *
 * @author Jorismar
 */
public class Voo {
    private Piloto piloto;
    private Aeronave aeronave;
    
    public Voo(Piloto piloto, Aeronave aeronave) {
        this.piloto = piloto;
        this.aeronave = aeronave;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
}
