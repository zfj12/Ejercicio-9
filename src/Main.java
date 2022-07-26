public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Luis";
        cliente.edad = 18;
        cliente.telefono = "987456123";
        cliente.credito = 25.95;
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        System.out.println("*********************************************************");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Ernesto";
        trabajador.edad = 28;
        trabajador.telefono = "698574123";
        trabajador.salario = 75.50;
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;
}
class Cliente extends Persona{
    double credito;
}
class Trabajador extends Persona{
    double salario;
}