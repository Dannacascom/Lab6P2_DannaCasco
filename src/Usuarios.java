
public class Usuarios {
    protected String username,password,tipo;
    protected int edad;

    public Usuarios() {
    }

    public Usuarios(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuarios(String username, String password, int edad) {
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "username=" + username + ", password=" + password + ", edad=" + edad + '}';
    }
    
    
}
