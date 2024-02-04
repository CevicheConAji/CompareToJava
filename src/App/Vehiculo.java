package App;

public abstract class Vehiculo {
    String matricula;
    String modelo;
    int potenciaCV;

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

    public int getPotenciaCV() {
        return potenciaCV;
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
