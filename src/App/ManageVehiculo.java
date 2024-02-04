package App;


import java.util.ArrayList;

public class ManageVehiculo {
    public static void main(String[] args) {
        ArrayList<Taxi> taxiLinkedList = getLinkedList();

        startAndStop(taxiLinkedList);


    }
    public static ArrayList<Taxi> getLinkedList(){

        ArrayList<Taxi> taxiLinkedList = new ArrayList<>();

        Taxi t1 = new Taxi("FFG456","Mercedes AMG GLA",310,"2");
        Taxi t2 = new Taxi("FHG123","Mercedes AMG CLA",310,"4");
        Taxi t3 = new Taxi("OFV456","Mercedes AMG GLE",450,"6");
        Taxi t4 = new Taxi("HEV156","Mercedes AMG GLS",450,"1");

        taxiLinkedList.add(t1);
        taxiLinkedList.add(t2);
        taxiLinkedList.add(t3);
        taxiLinkedList.add(t4);

        Driver d1t1 = new Driver(1,"Piero",23);
        Driver d2t1 = new Driver(2,"Pepe",20);
        Driver d3t1 = new Driver(3,"Jose",25);

        t1.addDriver(d1t1);
        t1.addDriver(d2t1);
        t1.addDriver(d3t1);

        Driver d1t2 = new Driver(1,"Maritere",24);
        Driver d2t2 = new Driver(2,"Fernanda",21);
        Driver d3t2 = new Driver(3,"Julieta",20);

        t2.addDriver(d1t2);
        t2.addDriver(d2t2);
        t2.addDriver(d3t2);

        Driver d1t3 = new Driver(1,"Andy",28);
        Driver d2t3 = new Driver(2,"Feranando",24);
        Driver d3t3 = new Driver(3,"Roberta",26);

        t3.addDriver(d1t3);
        t3.addDriver(d2t3);
        t3.addDriver(d3t3);

        Driver d1t4 = new Driver(1,"Elena",24);
        Driver d2t4 = new Driver(2,"Laura",25);
        Driver d3t4 = new Driver(3,"Valeria",23);

        t4.addDriver(d1t4);
        t4.addDriver(d2t4);
        t4.addDriver(d3t4);

        return taxiLinkedList;

    }
    public static void startAndStop(ArrayList<Taxi> taxiLinkedList){
        for (Taxi taxi:
             taxiLinkedList) {
            taxi.startEngine();
            System.out.println(taxi);
            taxi.stopEngine();
        }
    }
}
