
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int  numeroDeCuenta;
        char tipoDeCuenta;
        double saldoActual;
        double saldoMinimo;
        double interesAhorro;
        double interesCheque;
        double interesChequeMayor5000;
        double interes;
        double cargoPorServicio;
        double saldoFinal = 0;
        double saldoNuevo;
        
        System.out.println("Por favor ingrese el numero de cuenta: ");
        numeroDeCuenta = entrada.nextInt();
        
        System.out.println("Por favor ingrese el tipo de cuenta A= de ahorros y C= de Cheques: ");
        tipoDeCuenta = entrada.next().charAt(0);
        
        System.out.println("Por favor ingrese el saldo minimo que debe mantener la cuenta: ");
        saldoMinimo = entrada.nextDouble();
        
       
        System.out.println("Por favor ingrese su saldo Actual: ");
        saldoActual = entrada.nextDouble();
        
        
        
        //Definir el saldo minimo y las tasas de interes
        interesAhorro = 4 / 100;
        interesCheque = 3 /100;
        interesChequeMayor5000 = 5 / 100;
        
        
        
        if(tipoDeCuenta == 'A' || tipoDeCuenta == 'C'){
            if(saldoActual < saldoMinimo){
                saldoActual -= 10;
                System.out.println("A usted se le debe imponer un cargo por servicio de U$ 10");
               
                
                
            }else{
                interes = saldoActual * interesAhorro;
                saldoActual += interes;
            }   
                }else if(tipoDeCuenta == 'A' || tipoDeCuenta == 'C' ){
                    if(saldoActual < saldoMinimo){
                        saldoActual -= 25;
               
                }else{
                        interes = saldoActual * interesCheque;
                        saldoActual += interes;
                        int saldoInicial = 0;
                        if(saldoInicial  > 5000){
                            double interesChqueMayor5000 = 0;
                            interes = saldoActual * interesChqueMayor5000;
                            saldoActual += interes;
                            
                            
                }
            }
        
        }
        entrada.close();
        
                
        System.out.println("Su numero de cuenta es : " + numeroDeCuenta);
        System.out.println("Su tipo de cuenta es: " + tipoDeCuenta + "A= cuenta de ahorro y C = cuenta de cheque");
        System.out.println("Su saldo actual es: " + saldoActual);
        System.out.println("Su saldo nuevo despues del interes  es de " + saldoActual);
        
        
        
    }
    
}

