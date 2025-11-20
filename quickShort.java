import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quickShort {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    
    private static int particion(int[] arreglo, int bajo, int alto) {
         
        int pivote = arreglo[alto]; 
        
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (arreglo[j] <= pivote) {
                i++;

               
                int aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        
        int aux = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temp;

        return i + 1;
    }
    
   
    
    


    
}