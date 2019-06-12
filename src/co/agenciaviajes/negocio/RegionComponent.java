package co.agenciaviajes.negocio;

import java.util.ArrayList;

/**
 * Representa una region del planeta, como continente o pais
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class RegionComponent extends PaqueteComponent {

    public ArrayList<PaqueteComponent> regionContenido = new ArrayList();

    public RegionComponent(String nombre) {
        super(nombre);
    }

    // Complete constructor
    
    @Override
    public long getComponentPrecio() {
        long precioOfAllHojas = 0;

        for (Object component : regionContenido) {
            precioOfAllHojas = precioOfAllHojas + (((PaqueteComponent) component).getComponentPrecio());
        }
        return precioOfAllHojas;
    }
    
    
    // Complete demas  metodos
    public void RegionComponent(String nombre){
        
    }
    @Override
    public void addComponent(PaqueteComponent fc)throws Exception{
        try{
            this.regionContenido.add(fc);
        }catch(Exception e){
            
        }
        
    }
    @Override
    public PaqueteComponent getComponent(int location){
        return this.regionContenido.get(location);
    }

    @Override
    public void impInfo() {
        System.out.println(" Región = "
                + this.getNombre() + " " + this.getComponentPrecio() + " Pesos" );
        for (PaqueteComponent paqueteComponent : regionContenido) {
            paqueteComponent.impInfo();
        }
    }
    
}
