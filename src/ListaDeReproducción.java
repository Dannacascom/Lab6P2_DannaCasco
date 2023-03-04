
import java.util.ArrayList;


public class ListaDeReproducción {
   private  String nombre,creador ;
   private int likes;
   private ArrayList<Canciones> cancion  = new ArrayList();

    public ListaDeReproducción() {
    }

    public ListaDeReproducción(String nombre, int likes) {
        this.nombre = nombre;
        this.likes = likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Canciones> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "ListaDeReproducci\u00f3n{" + "nombre=" + nombre + ", likes=" + likes + ", cancion=" + cancion + '}';
    }
   
    
}
