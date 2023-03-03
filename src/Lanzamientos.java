
public class Lanzamientos {
    protected String titulo,fechaLanzamiento;
    protected int likes;

    public Lanzamientos() {
    }

    public Lanzamientos(String titulo, String fechaLanzamiento, int likes) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Lanzamientos{" + "titulo=" + titulo + ", fechaLanzamiento=" + fechaLanzamiento + ", likes=" + likes + '}';
    }
    
    
}
