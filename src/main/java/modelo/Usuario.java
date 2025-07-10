package modelo;

public class Usuario {

    // Agregamos Atributos (la informacion del usuario)
    private int idUsuario; 
    private String nombre;
    private String dni;
    private String pin;
    private double saldo;
    
    // Constructor (sirve para crear un usuario con datos)
    public Usuario(int idUsuario, String nombre, String dni, String pin, double saldo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
    }
    
    // Aplicamos los getters and setters
    // GET: obtener y leer un dato
    // SET: cambiar un dato
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}




