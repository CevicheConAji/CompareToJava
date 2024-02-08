package App;

public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected int potenciaCV;

    public Vehiculo(String matricula, String modelo, int potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    public Vehiculo(){

    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }


    public abstract void stopEngine();
    public abstract void startEngine();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potenciaCV=" + potenciaCV +
                '}';
    }
}
