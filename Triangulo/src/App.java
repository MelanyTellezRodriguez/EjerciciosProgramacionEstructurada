import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double longitudC1;
        double longitudC2 = 0;
        double longitudC3;
        double sumaLados;
        
        for(int i = 0; i<3; i++){
            
        System.out.println("Ingrese la longitud de uno de los lados del triangulo: ");
        longitudC1 = entrada.nextDouble();
        
        if(longitudC1 <= 0){
            System.out.println("Ingrese in nuemero que sea mayor y diferente de cero: ");
            System.out.println("Ingrese la longitud de uno de los lados del triangulo: ");
            longitudC1 = entrada.nextDouble();
            
        }if(longitudC1 <= 0){
            System.out.println("Ingrese in nuemero que sea mayor y diferente de cero: ");
            System.out.println("Ingrese la longitud de uno de los lados del triangulo: ");
            longitudC1 = entrada.nextDouble();
            System.out.println("");
        }
        
        System.out.println("Ingrese otra longitud del lado del triangulo: ");
        longitudC2 = entrada.nextDouble();
        
         if(longitudC2 <= 0){
            System.out.println("Ingrese in numero que sea mayor y diferente de cero: ");
            System.out.println("Ingrese otra longitud del lado del triangulo: ");
            longitudC1 = entrada.nextDouble();
            
        }if(longitudC2 <= 0){
            System.out.println("Ingrese in numero que sea mayor y diferente de cero: ");
            System.out.println("Ingrese otra longitud del lado del triangulo: ");
            longitudC2 = entrada.nextDouble();
            System.out.println("");
        }
        
        System.out.println("Ingrese la ultima longitud del lado del triangulo: ");
        longitudC3 = entrada.nextDouble();
        
        if(longitudC3 <= 0){
            System.out.println("Ingrese in numero que sea mayor y diferente de cero: ");
            System.out.println("Ingrese la ultima longitud del lado del triangulo: ");
            longitudC3 = entrada.nextDouble();
            
        }if(longitudC3 <= 0){
            System.out.println("Ingrese in numero que sea mayor y diferente de cero: ");
            System.out.println("Ingrese la ultima longitud del lado del triangulo: ");
            longitudC3 = entrada.nextDouble();
            System.out.println("");
        }
        
        sumaLados = longitudC1 + longitudC2;
        
        if(sumaLados > longitudC3){
            System.out.println("Los datos si cumplen con las condiciones para crear el triangulo");
            
            
        }else if(sumaLados < longitudC3){
            System.out.println("Los datos no cumplen con las condiciones para crear el triangulo");
            
        }
        System.out.println("El tipo de triangulo es: ");
        
        if((longitudC1 == longitudC2) && (longitudC2 == longitudC3)){
            System.out.println("El triangulo es equilatero");
            System.out.println("");
            
        }else if(longitudC3 == (longitudC1 * longitudC1) + (longitudC2 * longitudC2)){
        System.out.println("El triangulo es rectanguo");
        System.out.println("");
        
        }else if(longitudC1 == longitudC2){
            System.out.println("El triangulo es Isoseles");
            System.out.println("");
        }else{
            System.out.println("No podemos encontrar el tipo de triangulo entre las opciones");
            System.out.println("");
            
        }
        
           
            
             
        }
        entrada.close();
    }
}
