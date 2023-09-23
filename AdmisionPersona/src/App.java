
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int edad;
        char genero;
        char portaArmas;
        
        for(int i = 0; i<3; i++){
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese su genero m= masculino y f= femenino");
        genero = entrada.next().charAt(0);
        
        if(edad < 18 && genero == 'f'){
            System.out.println("puede entrar a la disco pero no puede consumir bebidas alcoholicas");
        }else if(edad > 20 && genero == 'f'){
            
            System.out.println("Puede entrar a la disco y puede consumir bebidas alcoholicas ");
        }else if(edad > 18 && genero == 'm'){
            
        }else{
            System.out.println("No cumple con las condiciones para determinar si puede o no entrar a la discoteca");
            
        System.out.println("¿Porta armas? s= si y n= no" );
        portaArmas = entrada.next().charAt(0);
        
            if( portaArmas == 's' && genero == 'm'){
                System.out.println("Usted no puede ingresar a la discoteca ");
                
            }else if( edad > 20 && portaArmas == 'n' && genero == 'm'){
                System.out.println("Usted si puede entrar a la discoteca pero no puede consumir bebidas alcoholicas");
            }else{
                
            }   System.out.println("No cumple con las condiciones para determinar si puede o no entrar a la discoteca");  
           
        }
    
       
        } 
    }
}
