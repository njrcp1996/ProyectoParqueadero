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
public class Vehiculo {
     private  String marca ;
     private String placa ;
     private LocalDateTime horaEntrada;
     private String modelo ;

    public Vehiculo(String marca, String placa, LocalDateTime horaEntrada, String modelo) {
        this.marca = marca;
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.modelo = modelo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarDatos(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Hora de entrada: "+getHoraEntrada());
        System.out.println("Modelo: "+getModelo());
    }
    
    public double calcularTarifaEstadia(long horasEstadia){
        return 0;
    }
    
     
}
