package App;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Clase para gestionar vehículos, específicamente taxis, incluyendo operaciones como iniciar y detener los motores,
 * imprimir la lista de taxis y ordenarlos
 *
 * @author Piero Zavala Chira
 * @version 1
 */
public class ManageVehiculo {
    public static void main(String[] args) {

        //Crear una lista enlazada de taxis
        LinkedList<Taxi> taxiLinkedList = getLinkedListTaxi();

        //Iniciar y detener los motores de cada taxi en la lista
        startAndStop(taxiLinkedList);

        System.out.println("\n");

        //Imprimir lista de taxis
        imprimirListaTaxi(taxiLinkedList);

        System.out.println("\n");

        //Ordena la lista de taxis utilizando el método sort por
        // número de licencia, matrícula y potencia cv
        Collections.sort(taxiLinkedList);

        //Imprimir lista de taxis
        imprimirListaTaxi(taxiLinkedList);

        System.out.println("\n");
        //Ordena los conductores de cada taxi utilizando el método ordenarDrivers del objeto Taxi
        ordernarDrives(taxiLinkedList);

        //Imprimir lista de taxis
        imprimirListaTaxi(taxiLinkedList);

    }

    /**
     * Crea y retorna una lista enlazada de objetos Taxi, inicializados con datos de ejemplo.
     * @return LinkedList<Taxi> una lista enlazada de taxis
     */
    public static LinkedList<Taxi> getLinkedListTaxi(){

        LinkedList<Taxi> taxiLinkedList = new LinkedList<>();

        // Crear taxis y añadirlos a la lista.
        Taxi t1 = new Taxi("FFG456","Mercedes AMG GLA",310,2);
        Taxi t2 = new Taxi("FHG123","Mercedes AMG CLA",310,2);
        Taxi t3 = new Taxi("OFV456","Mercedes AMG GLE",450,6);
        Taxi t4 = new Taxi("HEV156","Mercedes AMG GLS",450,1);

        taxiLinkedList.add(t1);
        taxiLinkedList.add(t2);
        taxiLinkedList.add(t3);
        taxiLinkedList.add(t4);

        // Asignar conductores a cada taxi.
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
    /**
     *Inicia y detiene el motor de cada taxi en la lista.
     *
     * @param taxiLinkedList Lista de taxis a procesar.
     */
    public static void startAndStop(LinkedList<Taxi> taxiLinkedList){
        for (Taxi taxi:
             taxiLinkedList)
        {
            taxi.startEngine();

            taxi.stopEngine();
        }
    }
    /**
     * Imprime la lista de taxis.
     * @param taxiLinkedList Lista de taxis a imprimir
     */
    public static void imprimirListaTaxi(LinkedList<Taxi> taxiLinkedList){
        for(Taxi taxi:
            taxiLinkedList)
        {
            System.out.println(taxi);
        }
    }
    /**
     *Ordena los conducotores de cada taxis en la lista
     *
     * @param taxiLinkedList Lista de taxis a ordenar por conductores
     */
    public static void ordernarDrives(LinkedList<Taxi> taxiLinkedList){
        for(Taxi taxi:
            taxiLinkedList)
        {
            taxi.sortDriver();
        }
    }
}
