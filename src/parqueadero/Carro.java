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
public class Carro extends Vehiculo{
     private String tipoCombustible;

    public Carro(String tipoCombustible, String marca, String placa, LocalDateTime horaEntrada, String modelo) {
        super(marca, placa, horaEntrada, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tipo de combustible: "+getTipoCombustible());
    }
    @Override
    public double calcularTarifaEstadia(long horasEstadia){
       return horasEstadia*3000;
    }
}
