import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas: ");
        int cantidad = teclado.nextInt();

        Persona[] personas = new Persona[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la persona "+(i+1)+": ");

            System.out.print("Nombre: ");
            String nombre = teclado.next();

            System.out.print("Edad: ");
            int edad = teclado.nextInt();

            personas[i] = new Persona(nombre,edad);
        }
        
        System.out.println("Ingrese la edad de la persona que quiere buscar: ");
        int dx = teclado.nextInt();
        
        Metodo  mm = new Metodo();
        mm.ordenar(personas);
        mm.busqueda(personas, dx); 

        teclado.close();
    }
}
