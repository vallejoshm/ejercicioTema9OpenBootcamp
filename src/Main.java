public class Main {
    public static void main (String[] args){
        Cliente miCliente = new Cliente(33, "Hernan", "1122334455",200);
        System.out.println("Nombre cliente: " + miCliente.getNombre());
        System.out.println("Edad cliente: " + miCliente.getEdad());
        System.out.println("Teléfono cliente: " + miCliente.getTelefono());
        System.out.println("Crédito cliente: " + miCliente.getCredito());

        Trabajador miTrabajador = new Trabajador(33, "Hernan", "1122334455",2000);
        System.out.println("Nombre trabajador: " + miTrabajador.getNombre());
        System.out.println("Edad trabajador: " + miTrabajador.getEdad());
        System.out.println("Teléfono trabajador: " + miTrabajador.getTelefono());
        System.out.println("Salario trabajador: " + miTrabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
