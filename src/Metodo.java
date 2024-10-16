import java.util.Arrays;

public class Metodo {
    
    public Persona[] ordenar(Persona[] arreglo){
        for (int i = 1; i < arreglo.length-1; i++) {
            Persona key = arreglo[i];
            int j = i-1;

            while(j>-1 && arreglo[i].getEdad()>key.getEdad()){
                arreglo[i+1]=arreglo[i];
                i--;
            }
            arreglo[i+1]=key;
        }
        System.out.println(Arrays.toString(arreglo));
        return arreglo;
    }
    public int busqueda(Persona[] arreglo, int valor){
        int inicio = 0;
        int fin = arreglo.length -1;

        while(inicio<=fin){
            int medio = inicio +(fin-inicio)/2;

            if(arreglo[medio].getEdad()==valor){
                return medio;
            }

            if(arreglo[medio].getEdad()<valor){
                inicio = medio+1;
            }else{
                fin = medio-1;
            }
        }
        return -1;

        
    }
    public void mostrar(Persona[] arreglo){
        for(Persona per : arreglo){
        System.out.println(per+", ");
        }
    }
}
