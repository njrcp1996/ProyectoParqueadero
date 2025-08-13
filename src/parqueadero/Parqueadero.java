/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueadero;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ncp19
 */
public class Parqueadero {
    
    
    private ArrayList<Vehiculo> listaVehiculos;

    public Parqueadero() {
        listaVehiculos = new ArrayList<>(); //Inicializando el arreglo de Vehiculos vacia para que no tenga basura del sistema
    }


    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    public void registrarEntradaVehiculo(Vehiculo v){
        listaVehiculos.add(v);
    }
    public Vehiculo buscarVehiculoPorPlaca(String placa){
        for (int i=0; i<listaVehiculos.size();i++) {
            Vehiculo v= listaVehiculos.get(i); // al instancia un objeto vehiculo el va a buscar si el objeto es un carro, moto o camion lo cual es el poliformismo
            if(v.getPlaca().equalsIgnoreCase(placa)){ //equalsIgnoreCase funcion para evitar comparacion entre mayusculas y minusculas 
                return listaVehiculos.get(i);
            }
        }
        return null;
    }
    
    public void registrarSalida(){
        String placa;
        Double horaSalida;
        Scanner entradaDatos = new Scanner (System.in);
        System.out.println("Ingrese la placa del vehiculo el cual va a registrar la salida: ");
        placa=entradaDatos.nextLine();
        Vehiculo v=buscarVehiculoPorPlaca(placa);
        if (v==null){
            System.out.println("Placa invalida o no existe");
        }
        else {
            System.out.println("Ingrese la hora de salida: ");
            horaSalida=entradaDatos.nextDouble();
            LocalDateTime horaRealSalida = conversionHoraAFecha(horaSalida);
            long horasEstadia=calcularHorasEstadia(v.getHoraEntrada(),horaRealSalida);
            double tarifaEstadia= v.calcularTarifaEstadia(horasEstadia);
            System.out.println("Horas de estadia: "+ horasEstadia+"\n"+ "Su tarifa de estadia es: "+tarifaEstadia);
            listaVehiculos.remove(v);
        }
    }
    public long calcularHorasEstadia(LocalDateTime horaEntrada,LocalDateTime horaSalida)
    {
       Duration tiempoEstadia= Duration.between(horaEntrada, horaSalida);
       long horas =(tiempoEstadia.toMinutes()+59)/60; //se suman 59 minutos y se divide en 60 para que quede en horas
        return horas;
    }
        
    public LocalDateTime conversionHoraAFecha(Double hora){
        int horas= (int) Math.floor(hora);// Devuelve el valor menor al valor evaluado para obtener las horas
        int minutos= (int) Math.floor((hora-horas)*60);
        if (minutos==60){ // se evalua para que no se envie 60 en minutos ya que solo es valido hasta 59 
            horas +=1; // si es 60 se vuelve 1 hora
            minutos=0; // se deja en 0 ya que reinicia los minutos
        }    
        return LocalDateTime.of(LocalDate.now(),LocalTime.of(horas, minutos)); //Devuelve la fecha, hora y minutos
    }
    public void consultarEstado(){
        
    }
    
    public void mostrarDatos(){
        for (int i=0; i<listaVehiculos.size();i++) {
            Vehiculo v= listaVehiculos.get(i);
            v.mostrarDatos();
        }
    }
    
}
