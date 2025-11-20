import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quickShort {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    
    public static void quickSort(int[] arreglo, int bajo, int alto) {
        if (bajo < alto) {
            
            int indicePivote = particion(arreglo, bajo, alto);

            quickSort(arreglo, bajo, indicePivote - 1);

            quickSort(arreglo, indicePivote + 1, alto);
        }
    }

   
    private static int particion(int[] arreglo, int bajo, int alto) {
        int pivote = arreglo[alto]; 
        
       
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] <= pivote) {
                i++;

              
                int aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }

        int aux = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = aux;

        return i + 1;
    }
    
   
    public static void imprimir(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    
    public static void main(String[] args) throws IOException { 
        
        
        int[] arreglo = {8, 4, 5, 6, 1};
        
        System.out.println("\n Arreglo antes del Quick Sort: " + Arrays.toString(arreglo));

        
        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("\n Arreglo después de Quick Sort");
        imprimir(arreglo);
        
       
    }
}