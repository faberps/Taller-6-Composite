package co.agenciaviajes.negocio;

/**
 * Ciudades a visitar
 * @author Libardo Pantoja, Ricardo Zambrano, Julio Hurtado
 */
public class CiudadComponent extends PaqueteComponent {

    private int precio;

    private Vuelo vuelo;
    private Hotel hotel;
    private CityTour cityTour;
    private PlanAlimentacion planAlimentacion;

    public CiudadComponent(String nombre,int precio) {
        super(nombre);
        this.precio = precio;
    }
    
    // Completar constructor, getters and setters

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public CityTour getCityTour() {
        return cityTour;
    }

    public void setCityTour(CityTour cityTour) {
        this.cityTour = cityTour;
    }

    public PlanAlimentacion getPlanAlimentacion() {
        return planAlimentacion;
    }

    public void setPlanAlimentacion(PlanAlimentacion planAlimentacion) {
        this.planAlimentacion = planAlimentacion;
    }

    @Override
    public long getComponentPrecio() {
        return this.precio;
    }

    @Override
    public void impInfo() {
        System.out.println("Nombre: "+this.getNombre()+"  "+this.precio+" Pesos");
    }
    

}
