import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quickShort {

    

    public static int[] prueba (int[] arreglo) throws IOException{
        int aux;
        int cambios;
        cambios = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if ( arreglo[i] > arreglo[i+1]) {
                aux = arreglo[i];
                arreglo[i] = arreglo[i+1];
                arreglo[i+1] = aux;
                cambios = cambios + 1;
            }
        }

        return arreglo;
    }

    public static void imprimir(int[] arreglo) throws IOException{
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    
    public static void main(String[] args) {
        int x;
        x = 1;

        int resp;

        public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        public static String entrada;

        int[] arreglo = new int[5];
        

        arreglo[0] = 8;
        arreglo[1] = 4;
        arreglo[2] = 5;
        arreglo[3] = 6;
        arreglo[4] = 1;


        while (x = 1) {
            arreglo = prueba(arreglo);

            System.out.print("Imprimir arreglo? si: (1) no: (0) ");
            entrada = bufer.readLine();
            resp = Integer.parseInt(entrada);
        
            if (resp = 1) {
                imprimir(arreglo);
            }

            System.out.print("Dar otra vuelta? si: (1) no: (0) ");
            entrada = bufer.readLine();
            resp = Integer.parseInt(entrada);

        }
    }
}