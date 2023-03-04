
import java.util.ArrayList;


public class Clientes extends Usuarios {
    private ArrayList<Canciones> listaReproduccion = new ArrayList();
    private ArrayList<Canciones> liked  = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(String username, String password, int edad) {
        super(username, password, edad);
    }


    public ArrayList<Canciones> getReproducidas() {
        return listaReproduccion;
    }

    public void setReproducidas(ArrayList<Canciones> reproducidas) {
        this.listaReproduccion = reproducidas;
    }

    public ArrayList<Canciones> getLiked() {
        return liked;
    }

    public void setLiked(ArrayList<Canciones> liked) {
        this.liked = liked;
    }

    @Override
    public String toString() {
        return "Clientes{" +", reproducidas=" + listaReproduccion + ", liked=" + liked + '}';
    }


    
}
