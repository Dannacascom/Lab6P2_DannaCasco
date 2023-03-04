
import java.util.ArrayList;


public class Artistas extends Usuarios{
    private String nombre;
    private ArrayList<Canciones> cancion = new ArrayList();
    private ArrayList<Albumes> songs = new ArrayList();
    

    public Artistas() {
        super();
    }

    public Artistas(String nombre, String username, String password, int edad) {
        super(username, password, edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canciones> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Canciones> cancion) {
        this.cancion = cancion;
    }

    public ArrayList<Albumes> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Albumes> songs) {
        this.songs = songs;
    }

    public int getEdad() {
        return edad;
    }
    

    @Override
    public String toString() {
        return "Artistas{" + "nombre=" + nombre + ", cancion=" + cancion + ", songs=" + songs + '}';
    }

    
    
    
}
