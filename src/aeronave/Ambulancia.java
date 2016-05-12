
package aeronave;

public class Ambulancia extends Aeronave {
    private int capacidade_pacientes;
    private int capacidade_equipe_medica;

    public Ambulancia(int capacidade_pacientes, int capacidade_equipe_medica, String modelo, int autonomia, int horas_voadas) {
        super(modelo, autonomia, horas_voadas);
        this.capacidade_pacientes = capacidade_pacientes;
        this.capacidade_equipe_medica = capacidade_equipe_medica;
    }

    public int getCapacidade_pacientes() {
        return capacidade_pacientes;
    }

    public void setCapacidade_pacientes(int capacidade_pacientes) {
        this.capacidade_pacientes = capacidade_pacientes;
    }

    public int getCapacidade_equipe_medica() {
        return capacidade_equipe_medica;
    }

    public void setCapacidade_equipe_medica(int capacidade_equipe_medica) {
        this.capacidade_equipe_medica = capacidade_equipe_medica;
    }
}
