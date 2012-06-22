/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Hackinetico
 */
public class Vehiculo {
    private String nombre;
    private int llantas;
    private int capacidad;
    private boolean cinturones;
    
    public Vehiculo(String n){
    this.nombre=n;
    this.cinturones=false;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String mensaje(){
    return this.getNombre()+" tiene "+ this.getLlantas() +" llantas y caben "+ this.getCapacidad()+" personas";
    }

    /**
     * @return the cinturones
     */
    public boolean isCinturones() {
        return cinturones;
    }

    /**
     * @param cinturones the cinturones to set
     */
    public void setCinturones(boolean cinturones) {
        this.cinturones = cinturones;
    }
    
    public String abrocharCinturones(){
    return "Cinturones ya abrochados";
    }
    
    private int Llantas;
    private int Ocupantes;
    private String Nombre;
    private int CurrentOcupantes;
//    public Vehiculo (String n){
//    
//    }
//    
    /**
     * @return the Llantas
     */
//    public int getLlantas() {
//        return Llantas;
//    }

    /**
     * @param Llantas the Llantas to set
     */
//    public void setLlantas(int Llantas) {
//        this.Llantas = Llantas;
//    }

    /**
     * @return the Ocupantes
     */
    public int getOcupantes() {
        return Ocupantes;
    }

    /**
     * @param Ocupantes the Ocupantes to set
     */
    public void setOcupantes(int Ocupantes) {
        this.Ocupantes = Ocupantes;
    }

    /**
     * @return the nombre
     */
//    public String getNombre() {
//        return Nombre;
//    }

    /**
     * @param nombre the nombre to set
     */
//    public void setNombre(String nombre) {
//        this.Nombre = nombre;
//    }
    
        @Override
public String toString(){
    return this.getNombre() + " puede llevar a " + this.getOcupantes()+" gracias a sus "+this.getLlantas()+" llantas";
}
        public boolean subirPasajero(){
           boolean r=false;
            if(this.CurrentOcupantes<this.Ocupantes){
                this.CurrentOcupantes++;
                r=true;
            }
            return r;
        }
        public boolean baharPasajero(){
            boolean r=false;
            if(this.CurrentOcupantes>0){
                this.CurrentOcupantes--;
                r=true;
            }
            return r;
        }
}
