
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner entrada = new Scanner(System.in);

      
        
        int numero;
        int digito1, digito2, digito3, digito4, digito5;
        int sumaDigitos;
        
        for(int i = 0; i < 3; i++){
        System.out.println("Por favor ingrese un numero de Cinco digitos: ");
        numero = entrada.nextInt();
        
        digito1 = numero / 10000;
        numero = numero % 10000;
        digito2 = numero / 1000;
        numero = numero % 1000;
        digito3 = numero / 100;
        numero = numero % 100;
        digito4 = numero / 10;
        numero = numero % 10;
        digito5 = numero;
        
        System.out.printf("El numero %s    %d  %d  %d  %d "
                + "%d",("" + digito1 + digito2 + digito3 + digito4 + digito5),
                digito1, digito2, digito3, digito4, digito5);
        System.out.println("");
        
        sumaDigitos =digito1 + digito2 + digito3 + digito4 + digito5;
        
        
        System.out.println("La suma de los digitos es: " + sumaDigitos);
        System.out.println("");
        
        }  
        entrada.close();
            
    }
   
}
