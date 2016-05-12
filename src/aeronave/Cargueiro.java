package aeronave;

public class Cargueiro extends Aeronave {
    private int carga_maxima;

    public Cargueiro(int carga_maxima, String modelo, int autonomia, int horas_voadas) {
        super(modelo, autonomia, horas_voadas);
        this.carga_maxima = carga_maxima;
    }

    public int getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(int carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
}
