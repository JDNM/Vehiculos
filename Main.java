/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Hackinetico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("Chevy");
        carro.setLlantas(4);
        //carro.setNombre("Corsa");
        carro.setCapacidad(5);
        
        Persona juan=new Conductor("Juan");
      //  juan.conducir();
        juan.subirAVehiculo(carro);
        
        juan.conducir();
        
        
        Vehiculo camioneta = new Vehiculo("Hummer");
        camioneta.setLlantas(4);
        //camioneta.setNombre("Hummer");
        camioneta.setCapacidad(5);
        
        Conductor pepe= new Conductor("Pepe");
        pepe.subirAVehiculo(camioneta);
        pepe.conducir();
        Vehiculo camion = new Vehiculo("Ruta 50");
        camion.setLlantas(6);
        //camion.setNombre("Ruta 50");
        camion.setCapacidad(20);
        
        JOptionPane.showMessageDialog(null, carro.mensaje());
        JOptionPane.showMessageDialog(null, camioneta.mensaje());
        JOptionPane.showMessageDialog(null, camion.mensaje());
        
        carro.setCinturones(true);
        
        if(carro.isCinturones())
        {
            JOptionPane.showMessageDialog(null, carro.abrocharCinturones());
        }
    }
}
