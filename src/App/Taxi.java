package App;

import App.Driver;
import App.Vehiculo;

import java.util.ArrayList;

public class Taxi extends Vehiculo {
    private ArrayList<Driver> driverArrayList = null;
    private String numeroLicencia;

    public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
        driverArrayList = new ArrayList<>();
    }

    public Taxi() {
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    public void addDriver(Driver Driver) {
        driverArrayList.add(Driver);

    }

    @Override
    public String toString() {
        return "Taxi{" +
                "driverArrayList=" + driverArrayList +
                ", numeroLicencia='" + numeroLicencia + '\'' +
                ", matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potenciaCV=" + potenciaCV +
                '}';
    }

    @Override
    public void stopEngine() {
        System.out.println(getModelo()+" Stop App.Taxi");
    }

    @Override
    public void startEngine() {
        System.out.println(getModelo()+" Start App.Taxi");
    }



}
