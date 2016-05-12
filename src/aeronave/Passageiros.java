package aeronave;

public class Passageiros extends Aeronave {
    private int num_assentos;
    private int num_assentos_classe_A;

    public Passageiros(int num_assentos, int num_assentos_classe_A, String modelo, int autonomia, int horas_voadas) {
        super(modelo, autonomia, horas_voadas);
        this.num_assentos = num_assentos;
        this.num_assentos_classe_A = num_assentos_classe_A;
    }

    public int getNum_assentos() {
        return num_assentos;
    }

    public void setNum_assentos(int num_assentos) {
        this.num_assentos = num_assentos;
    }

    public int getNum_assentos_classe_A() {
        return num_assentos_classe_A;
    }

    public void setNum_assentos_classe_A(int num_assentos_classe_A) {
        this.num_assentos_classe_A = num_assentos_classe_A;
    }
}
