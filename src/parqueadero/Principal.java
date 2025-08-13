/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueadero;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author ncp19
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner (System.in);
        LocalDateTime horaEntrada = LocalDateTime.now();
        String marca, placa, modelo,tipoCombustible;
        Integer cilindraje,opcionRecorrido=0;
        double capacidadCarga;
        Parqueadero parqueadero= new Parqueadero();
        System.out.println("Bienvenido al Programa de Gestion de parqueaderos EAN");
        
        
        while (opcionRecorrido !=4){
            System.out.println("Ingrese la opcion que desea realizar: 1.Registrar un vehiculo "
                + "2.Registrar salida de un vehiculo 3. Consultar estado de vehiculos 4.Salir");
            opcionRecorrido= entradaDatos.nextInt();
            entradaDatos.nextLine();// salto de linea para que limpie el bufer
            switch (opcionRecorrido){
            case 1:
                System.out.println("Ingrese la marca de su vehiculo: ");
                marca= entradaDatos.nextLine();
                System.out.println("marca: "+marca);
                System.out.println("Ingrese la placa de su vehiculo: ");
                placa= entradaDatos.nextLine();
                System.out.println("Ingrese el modelo de su vehiculo: ");
                modelo= entradaDatos.nextLine();
                System.out.println("Ingrese la letra que corresponda a su tipo de vehiculo: "
                + "A.Carro B.Motocicleta C.Camion ");
                String opcionVehiculo= entradaDatos.nextLine();
                System.out.println("Su opcion fue "+opcionVehiculo);
                switch (opcionVehiculo.toUpperCase()){
                    case "A": 
                        System.out.println("Ha digitado Carro");
                        System.out.println("Ingrese el tipo de combustible que utiliza su vehiculo acorde "
                        + "a los siguientes: Gasolina, disiel o electrico");
                        tipoCombustible= entradaDatos.nextLine();
                        Carro objCarro= new Carro(tipoCombustible,marca,placa,horaEntrada,modelo);
                        parqueadero.registrarEntradaVehiculo(objCarro);
                        parqueadero.mostrarDatos();
                
                    break;
                    case "B": 
                        System.out.println("Ha digitado Motocicleta");
                        System.out.println("Ingrese el cilidraje de su vehiculo ");
                        cilindraje=entradaDatos.nextInt();
                        Motocicleta objMoto= new Motocicleta(cilindraje,marca,placa,horaEntrada,modelo);
                        parqueadero.registrarEntradaVehiculo(objMoto);
                        parqueadero.mostrarDatos();
                    break;
                    case "C": 
                        System.out.println("Ha digitado Camion");
                        System.out.println("Ingrese la capacidad de carga de su vehiculo ");
                        capacidadCarga=entradaDatos.nextDouble();
                        Camion objCamion= new Camion(capacidadCarga,marca,placa,horaEntrada,modelo);
                        parqueadero.registrarEntradaVehiculo(objCamion);
                        parqueadero.mostrarDatos();
                    break;
                    default: 
                        System.out.println("Opcion No valida");
                }
            break;
            case 2:
                System.out.println("Registrar Salida de un vehiculo");
                parqueadero.registrarSalida();
            break;
            case 3:
                System.out.println("Consultar Vehiculos que hay en el parqueadero");
            case 4:
                System.out.println("Fin del programa");
                System.exit(0);
                
            default:
                System.out.println("Opcion No valida");
             
            
        }
        }
        
    entradaDatos.close();
    }
    
    
    
}
