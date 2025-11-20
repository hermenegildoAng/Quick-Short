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
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[alto];
        arreglo[alto] = temp;

        return i + 1;
    }
    
    public static void imprimir(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    
    
    public static void main(String[] args) throws IOException { 
        
        Files files = new Files(); 

        String fileNameInput;
        String fileNameOutput;
        int[] arregloDesordenado;

        System.out.println("----------------------------------------");
        System.out.print("Escribe el nombre del archivo para ordenar: ");
        fileNameInput = bufer.readLine();

        
        arregloDesordenado = files.fileToIntArray(fileNameInput);
        
        

       
        imprimir(arregloDesordenado);
        
       
        System.out.println("ordenar archivo");
        quickSort(arregloDesordenado, 0, arregloDesordenado.length - 1);

        System.out.println(" Arreglo ordenado:");
        imprimir(arregloDesordenado);

        
        System.out.println("----------------------------------------");
        System.out.print("Escribe el nombre del archivo para guardarlo ya ordenado ");
        fileNameOutput = bufer.readLine();
        
        files.writeIntArrayToFile(fileNameOutput, arregloDesordenado);

        
    }
}