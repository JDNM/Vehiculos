/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

//import interfaz.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Daniel Noriega
 */
public class Conductor implements Persona{
    private String nombre;
    private boolean isInVehiculo;
    private Vehiculo vehiculo;
    
    public Conductor(String n){
        this.nombre=n;
        this.isInVehiculo=false;
        
    }

    @Override
    public boolean subirAVehiculo(Vehiculo v) {
     //   throw new UnsupportedOperationException("Not supported yet.");
        boolean r=false;
       if(this. isInVehiculo()==false){
        this.isInVehiculo=true;
        this.vehiculo=v;
        r=true;
        return true;
       }
       else
        return r;
       
       
    }

    @Override
    public boolean isConductor() {
      //  throw new UnsupportedOperationException("Not supported yet.");
        return true;
    }

    @Override
    public String getNombre() {
    //    throw new UnsupportedOperationException("Not supported yet.");
        return nombre;
    }

    @Override
    public boolean isInVehiculo() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return this.isInVehiculo;
    }

    @Override
    public boolean bajarDeVehiculo() {
       // throw new UnsupportedOperationException("Not supported yet.");
        this.isInVehiculo=false;
        return true;
    }

    @Override
    public Vehiculo getVehiculo() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return vehiculo;
    }

    
    public void conducir() {
        //throw new UnsupportedOperationException("Not supported yet.");
    String r="No tengo vehiculo que conducir";
        if(this.isInVehiculo()){
            r="Look at me I'm " + this.nombre + ", I'm Driving";
            
        }
            JOptionPane.showMessageDialog(null, r);
            
    }
    
}
