
package aeronave;

import cadastroPilotos.Cadastro;

public class Aeronave {
    private String modelo;
    private int autonomia;
    private int horas_voadas;

    public Aeronave(String modelo, int autonomia, int horas_voadas) {
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.horas_voadas = horas_voadas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getHoras_voadas() {
        return horas_voadas;
    }

    public void setHoras_voadas(int horas_voadas) {
        this.horas_voadas = horas_voadas;
    }
}
