
import java.util.ArrayList;


public class Albumes extends Lanzamientos{
    private ArrayList<Canciones> cancion = new ArrayList();
    private int cantidadDeCanciones;

    public Albumes() {
    }

    public Albumes(int cantidadDeCanciones, String titulo, String fechaLanzamiento, int likes) {
        super(titulo, fechaLanzamiento, likes);
        this.cantidadDeCanciones = cancion.size();
    }

    public ArrayList<Canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Canciones> cancion) {
        this.cancion = cancion;
    }

    public int getCantidadDeCanciones() {
        return cantidadDeCanciones;
    }

    public void setCantidadDeCanciones(int cantidadDeCanciones) {
        this.cantidadDeCanciones = cantidadDeCanciones;
    }

    @Override
    public String toString() {
        return "Albumes{" + "cancion=" + cancion + ", cantidadDeCanciones=" + cantidadDeCanciones + '}';
    }
    
    
}
