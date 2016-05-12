package aeronave;

public class Paraquedismo extends Aeronave {
    private int num_passageiros;

    public Paraquedismo(int num_passageiros, String modelo, int autonomia, int horas_voadas) {
        super(modelo, autonomia, horas_voadas);
        this.num_passageiros = num_passageiros;
    }

    public int getNum_passageiros() {
        return num_passageiros;
    }

    public void setNum_passageiros(int num_passageiros) {
        this.num_passageiros = num_passageiros;
    }
}
