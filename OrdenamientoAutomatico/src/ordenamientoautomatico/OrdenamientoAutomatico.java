package ordenamientoautomatico;

import java.util.Scanner;

public class OrdenamientoAutomatico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int a;
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+".Ingrese un numero: ");
            numeros[i]=entrada.nextInt();
            
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {           
            if(numeros[j]>numeros[j+1]){
                a=numeros[j];
                numeros [j]=numeros[j+1];
                numeros [j+1]=a;
            }
        }
        
        for ( i = 0; i < 5; i++) {
            System.out.print(numeros[i]+" ");
        }

    }
    
}

}
