
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double valorA;
        double valorB;
        double valorC;
        double discriminante;
        double solucion1;
        double solucion2;
        double soluUnica;
        double sinSolucion;
        
        for(int i = 0; i < 3; i++){
        
        System.out.println("Por favor ingrese el valor de (a): ");
        valorA = entrada.nextDouble();
        
        if(valorA > 0){
            System.out.println("El valor (a) si un numero aceptable para calcular la raiz");
        }else if(valorA < 0){
            System.out.print("El valor que de (a) ha ingresado es aceptado");
            
        }else{
            System.out.println("por favor ingrese otro valor que sea Distinto de cero");
        }
        
        System.out.println("por favor ingrese el valor de (b): ");
        valorB = entrada.nextDouble();
        
        System.out.println("Por favor ingrese el valor de (c): ");
        valorC = entrada.nextDouble();
        
        //calcular el discriminante: 
        discriminante = valorB * valorB - (4 * valorA * valorC);
        
        if(discriminante > 0){
            //Dos soluciones reales: 
            System.out.println("La ecuacion tiene dos raices reales");
            solucion1 = (-valorB + Math.sqrt (discriminante )) / (2 * valorA);
            solucion2 = (-valorB - Math.sqrt (discriminante )) / (2 * valorA);
            
            System.out.println("Las soluciones son: solucion1 = " + solucion1 + " y solucion2 = " + solucion2);
            System.out.println("");
            
                 
        }else if(discriminante == 0){
          //una unica solucion real:
          System.out.println("La ecuacion tiene una unica solucion");
          soluUnica =  - valorB / (2 * valorA);
          System.out.println("La solucion es: solucion unica = " + soluUnica);
          System.out.println("");
          
          
        }else if (discriminante < 0){
            //Dos raices complejas
            sinSolucion = valorB * valorB - (4 * (valorA) * (valorC));
            
            System.out.println("La ecuacion no tiene solucion: " + sinSolucion);
            System.out.println("");
            
        } 
        }
        entrada.close();
    }
}
