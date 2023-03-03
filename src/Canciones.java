
public class Canciones {
   private String titulo,duracion,refrencia; 

    public Canciones() {
    }

    public Canciones(String titulo, String duracion, String refrencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.refrencia = refrencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getRefrencia() {
        return refrencia;
    }

    public void setRefrencia(String refrencia) {
        this.refrencia = refrencia;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", duracion=" + duracion + ", refrencia=" + refrencia + '}';
    }
   
}
