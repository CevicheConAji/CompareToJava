package App;

public class Autobus extends Vehiculo implements Company{
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

    @Override
    public void paySalary() {
        System.out.println(getModelo()+" Pay Salary");
    }

    @Override
    public void hireVehicle() {
        System.out.println(getModelo()+" Hire");
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "numeroPlazas='" + numeroPlazas + '\'' +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potenciaCV=" + potenciaCV +
                '}';
    }
}
