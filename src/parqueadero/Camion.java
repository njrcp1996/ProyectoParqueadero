/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero;

import java.time.LocalDateTime;

/**
 *
 * @author ncp19
 */

public class Camion extends Vehiculo{
   
     private double capacidadCarga;

    public Camion(double capacidadCarga, String marca, String placa, LocalDateTime horaEntrada, String modelo) {
        super(marca, placa, horaEntrada, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
     @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("capacidad de carga: "+getCapacidadCarga());
    }
    @Override
    public double calcularTarifaEstadia(long horasEstadia){
       return horasEstadia*5000;
    }
}
