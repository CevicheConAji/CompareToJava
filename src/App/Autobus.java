package App;

public class Autobus extends Vehiculo {
    private String numeroPlazas;

    public Autobus(String numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public Autobus() {
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Bus"+ getModelo());
    }

    @Override
    public void startEngine() {
        System.out.println("Start Bus"+getModelo());
    }

    public void setNumeroPlazas(String numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getNumeroPlazas() {
        return numeroPlazas;
    }
}
