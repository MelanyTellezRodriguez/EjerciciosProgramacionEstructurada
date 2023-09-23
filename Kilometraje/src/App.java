
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int cantReabastecimiento;
        int kilometrosConducidos = 0,cantViajes = 0,litrosUsados;
        double resulKilomPorLitro;
        
        for(int i = 0; i<3; i++){
        System.out.println("Ingrese la cantidad de reabastecimientos que ha realizado");
        cantReabastecimiento = entrada.nextInt();
        
        System.out.println("Ingrese la cantidad de viajes que ha realizado: ");
        cantViajes = entrada.nextInt();
        
        System.out.println("Ingrese los kilometros conducidos por cada viaje: ");
        kilometrosConducidos = entrada.nextInt();
        
        System.out.println("Ingrese los litros de gasolina que ha usado por cada viaje: ");
        litrosUsados = entrada.nextInt();
        
         resulKilomPorLitro = kilometrosConducidos / litrosUsados;
         
         System.out.println("la kilometros por litro fueron: " + resulKilomPorLitro +   "K/L");
  
        }  
        entrada.close();  
    }

    
    }

