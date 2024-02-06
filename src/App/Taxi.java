package App;



import java.util.ArrayList;
import java.util.Collections;

public class Taxi extends Vehiculo implements Company, Comparable<Taxi>{
    private ArrayList<Driver> driverArrayList = null;
    private int numeroLicencia;

    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
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
    public void stopEngine() {
        System.out.println(getModelo()+" Stop App.Taxi");
    }

    @Override
    public void startEngine() {
        System.out.println(getModelo()+" Start App.Taxi");
    }


    @Override
    public void paySalary() {
        System.out.println(getModelo()+" Pay salary");
    }

    @Override
    public void hireVehicle() {
        System.out.println(getModelo()+" Hire ");
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

    public void sortDriver(){
        Collections.sort(driverArrayList);
    }

    @Override
    public int compareTo(Taxi o) {
        // First compare by license number
        int licenseCompare = Integer.compare(this.numeroLicencia,o.numeroLicencia);
        if (licenseCompare != 0) return licenseCompare;

        // Then by registration number (matricula)
        int matriculaCompare = this.matricula.compareTo(o.matricula);
        if (matriculaCompare != 0) return matriculaCompare;

        // Finally by CV power
        return Integer.compare(this.potenciaCV, o.potenciaCV);

    }
}
