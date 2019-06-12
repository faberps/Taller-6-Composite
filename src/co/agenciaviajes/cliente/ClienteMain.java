package co.agenciaviajes.cliente;

import co.agenciaviajes.negocio.CiudadComponent;
import co.agenciaviajes.negocio.RegionComponent;
import co.agenciaviajes.negocio.PaqueteComponent;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class ClienteMain {

    public static void main(String[] args) throws Exception{
        // Ejemplo de un paquete a Europa, que visitará tres paises: Italia, España y Francia
        PaqueteComponent principal = new RegionComponent("Europa");
        PaqueteComponent TSanta = new RegionComponent("Tierra Santa");
        PaqueteComponent pais1 = new RegionComponent("Italia");
        PaqueteComponent pais2 = new RegionComponent("Francia");
        PaqueteComponent pais3 = new RegionComponent("España");
        PaqueteComponent Pais4 = new RegionComponent("Palestina");
        PaqueteComponent Pais5= new RegionComponent("Israel");
        PaqueteComponent Pais6= new RegionComponent("Egipto");

        PaqueteComponent ciudad1 = new CiudadComponent("Roma", 1000000);
        PaqueteComponent ciudad2 = new CiudadComponent("Paris", 2000000);
        PaqueteComponent ciudad3 = new CiudadComponent("Madrid", 3000000);
        PaqueteComponent ciudad4 = new CiudadComponent("Valencia", 2000000);
        PaqueteComponent ciudad5 = new CiudadComponent("Jerusalen",6000000);
        PaqueteComponent ciudad6 = new CiudadComponent("Nazaret",15000000);
        PaqueteComponent ciudad7 = new CiudadComponent("Cairo",9000000);
        
        
        principal.addComponent(pais1);
        principal.addComponent(pais2);
        principal.addComponent(pais3);
        TSanta.addComponent(Pais4);
        TSanta.addComponent(Pais5);
        TSanta.addComponent(Pais6);
        
        
        pais1.addComponent(ciudad1);
        pais2.addComponent(ciudad2);
        pais3.addComponent(ciudad3);
        pais3.addComponent(ciudad4);
        Pais4.addComponent(ciudad5);
        Pais5.addComponent(ciudad6);
        Pais6.addComponent(ciudad7);
        // El cliente se refiere tanto a los componentes compuestos, como a los individuales, de manera uniforme
        
        System.out.println(" Región = "
                + principal.getNombre() + " " + principal.getComponentPrecio() + " Pesos" );
        System.out.println(" Pais 1 = "
                + pais1.getNombre() + " " + pais1.getComponentPrecio() + " Pesos"+ " Ciudad: "+pais1.getComponent(0).getNombre());
        System.out.println(" Pais 2 = "
                + pais2.getNombre() + " " + pais2.getComponentPrecio() + " Pesos"+ " Ciudad: "+pais2.getComponent(0).getNombre());
        System.out.println(" Pais 3 = "
                + pais3.getNombre() + " " + pais3.getComponentPrecio() + " Pesos"+ " Ciudad: "+pais3.getComponent(0).getNombre());
        System.out.println(" Pais 4 = "
                + pais3.getNombre() + " " + Pais4.getComponentPrecio() + " Pesos"+ " Ciudad: "+Pais4.getComponent(0).getNombre());
        System.out.println(" Pais 5 = "
                + pais3.getNombre() + " " + Pais5.getComponentPrecio() + " Pesos"+ " Ciudad: "+Pais5.getComponent(0).getNombre());
        System.out.println(" Pais 6 = "
                + pais3.getNombre() + " " + Pais6.getComponentPrecio() + " Pesos"+ " Ciudad: "+Pais6.getComponent(0).getNombre());
                
        
      
       // principal.impInfo();
        // Si se requiere, personalizar los datos:
//        ((CiudadComponent) ciudad1).setHotel(new Hotel("Hotel Italia"));
//        String tours[] = {"Coliseo de Roma", "Basilica San Pedro", "Panteon de Roma"};
//        ((CiudadComponent) ciudad1).setCityTour(new CityTour(tours));
//
//        String alimentacion[] = {"Desayuno ejecutivo", "Almuerzo a la carta", "No incluye cena"};
//        ((CiudadComponent) ciudad1).setPlanAlimentacion(new PlanAlimentacion(alimentacion));
//
//        try {
//            ((CiudadComponent) ciudad1).setVuelo(new Vuelo("Avianca", new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("05/06/2019 10:30"), new SimpleDateFormat("dd/MM/yyyy hh:mm").parse("07/06/2019 13:30")));
//        } catch (ParseException ex) {
//            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        CiudadComponent ciu = (CiudadComponent) ciudad1;
//        System.out.println("Ciudad: " + ciu.getNombre() + ", " 
//                + ciu.getHotel().getNombre() + ", " 
//                + Arrays.toString(ciu.getPlanAlimentacion().getAlimentacion()) + "' "
//                + Arrays.toString(ciu.getCityTour().getTours()) + ", " 
//                + ciu.getVuelo().getAerolinea() + ", "
//                + ciu.getVuelo().getFechaHoraLlegada().toString() + ", "
//                + ciu.getVuelo().getFechaHoraSalida().toString() + ", "
//        );
    }
}
