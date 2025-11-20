import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quickShort {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[] prueba (int[] arreglo) {
        int aux;
        int cambios = 0;

        
        for (int i = 0; i < arreglo.length - 1; i++) {
            if ( arreglo[i] > arreglo[i+1]) {
                aux = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = aux;
                cambios = cambios + 1;
            }
        }
        return arreglo;
    }

    public static void imprimir(int[] arreglo) {
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    
    
    public static void main(String[] args) throws IOException { 
        int x;
        x = 1;

        int resp = 1;

        int[] arreglo = new int[5];
        
        arreglo[0] = 8;
        arreglo[1] = 4;
        arreglo[2] = 5;
        arreglo[3] = 6;
        arreglo[4] = 1;

        
        while (resp == 1) {
            
            arreglo = prueba(arreglo);

            System.out.print("Imprimir arreglo? si: (1) no: (0) ");

            entrada = bufer.readLine();
            resp = Integer.parseInt(entrada.trim()); 
            
           
            if (resp == 1) {
                imprimir(arreglo);
            }

            System.out.print("Dar otra vuelta? si: (1) no: (0) ");
         
            entrada = bufer.readLine();
            resp = Integer.parseInt(entrada.trim()); 
            
        }
        
        System.out.println("Programa finalizado.");
    }
}