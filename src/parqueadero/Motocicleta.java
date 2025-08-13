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
public class Motocicleta extends Vehiculo {
    
    private Integer cilindraje;

    public Motocicleta(Integer cilindraje, String marca, String placa, LocalDateTime horaEntrada, String modelo) {
        super(marca, placa, horaEntrada, modelo);
        this.cilindraje = cilindraje;
    }
    

    public Integer getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("cilindraje: "+getCilindraje());
    }
    
    @Override
    public double calcularTarifaEstadia(long horasEstadia){
       return horasEstadia*1000;
    }
    
}
