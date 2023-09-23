
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        char tipoMarcoLujoso, tipoMarcoRegular, tipoMarco,agregarCorona,ponerColor;
        String colorMarco = "";
        double longitudFoto = 0,anchoFoto = 0,pulgadaMarco = 0,costoPonerCorona = 0;
        double pintarMarco,costoMarcoRegular,costoMarcoLujoso,costoPonerCarton, costoPonerVidrio;
        int cantCoronas = 0;
        double enmarcarFoto;
        
        
        for (int i= 0; i < 3; i++){
            
        System.out.println("Ingrese el tipo de marco que quiere para su fotografia (l = lujoso) y (r = regular)");
        tipoMarco = entrada.next().charAt(0);
        
        if(tipoMarco == 'l'){
            System.out.println("***Bienvenido a nuestra tienda de enmarcado***");
            
            
            System.out.println("¿Quiere ponerle un color al marco de la foto? (S = si) y (N = no)");
            ponerColor = entrada.next().charAt(0);
            
            if(ponerColor == 's'){
             System.out.println("Ingrese el color para el marco de la fotografia: ");
             colorMarco = entrada.nextLine();
             System.out.println("");
             
            }else{
            System.out.println("El color de su marco quedara de color blanco"); 

        }
        System.out.println("Ingrese el color para el marco de la fotografia: ");
        colorMarco = entrada.nextLine();
        System.out.println("");
        
        System.out.println("Ingrese la longitud, en pulgadas de la fotografia: ");
        longitudFoto = entrada.nextDouble();
        
        System.out.println("Ingrese el ancho en pulgadas de la fotografia: ");
        anchoFoto = entrada.nextDouble();
        
        System.out.println("¿Quiere agregar corona? (s = si) y (n = no)");
        agregarCorona = entrada.next().charAt(0);
        
        if(agregarCorona == 's'){
            System.out.println("Ingrese la cantidad de coronas que desea agregar: ");
            cantCoronas = entrada.nextInt();
            costoPonerCorona = (0.35 * cantCoronas);
            System.out.println("El costo por agregarle las coronas sera de: " + costoPonerCorona);
            
        }else if(agregarCorona == 'n'){
            System.out.println("Usted no agrego corona, de tal forma no se le agregara ningun costo");
            
        }else{
            System.out.println("La opcion que ha ingresado es incorrecta");
            
        }
        
        costoMarcoLujoso =  0.25 * (longitudFoto + anchoFoto);
        System.out.println("El costo de su marco sera: " + costoMarcoLujoso +"U$");
        
        pintarMarco = 0.10 * (longitudFoto + anchoFoto);
        System.out.println("El costo por pintar el marco es de: " + pintarMarco + "U$");
             
        
        costoPonerCarton = 0.02 * ((longitudFoto + longitudFoto) * (longitudFoto + longitudFoto));
        System.out.println("El costo por poner un carton detras de la fotografia es de: " + costoPonerCarton +"U$");
        
        costoPonerVidrio = 0.07 * (longitudFoto + longitudFoto) * (longitudFoto + longitudFoto);
        System.out.println("El costro por poner el vidrio sobre la fotografia es de: "+ costoPonerVidrio + "U$");
        
        enmarcarFoto = costoMarcoLujoso + pintarMarco + costoPonerCarton + costoPonerVidrio + costoPonerCorona;
       
        
        System.out.println("El costo total por enmarcar su fotografia con un tipo de marco lujoso es de: " + enmarcarFoto + "U$");
        
        
              
        }else if(tipoMarco == 'r'){
             System.out.println("***Bienvenido a nuestra tienda de enmarcado***");
            
            
            System.out.println("¿Quiere ponerle un color al marco de la foto? (S = si) y (N = no)");
            ponerColor = entrada.next().charAt(0);
            
            if(ponerColor == 's'){
             System.out.println("Ingrese el color para el marco de la fotografia: ");
             colorMarco = entrada.nextLine();
             System.out.println("");
             
            
            }else{
            System.out.println("El color de su marco quedara de color blanco"); 
            
        }
        System.out.println("Ingrese el color para el marco de la fotografia: ");
        colorMarco = entrada.nextLine();
        System.out.println("");
        
        System.out.println("Ingrese la longitud, en pulgadas de la fotografia: ");
        longitudFoto = entrada.nextDouble();
        
        System.out.println("Ingrese el ancho en pulgadas de la fotografia: ");
        anchoFoto = entrada.nextDouble();
        
        System.out.println("¿Quiere agregar corona? (s = si) y (n = no)");
        agregarCorona = entrada.next().charAt(0);
        
        if(agregarCorona == 's'){
            System.out.println("Ingrese la cantidad de coronas que desea agregar: ");
            cantCoronas = entrada.nextInt();
            costoPonerCorona = (0.35 * cantCoronas);
            System.out.println("El costo por agregarle las coronas sera de: " + costoPonerCorona);
            
        }else if(agregarCorona == 'n'){
            System.out.println("Usted no agrego corona, de tal forma no se le agregara ningun costo");
            
        }else{
            System.out.println("La opcion que ha ingresado es incorrecta");
            
        }
        
        pintarMarco = 0.10 * (longitudFoto + anchoFoto);
        System.out.println("El costo por pintar el marco es de: " + pintarMarco + "U$");
             
        costoMarcoRegular = 0.15 * (longitudFoto + anchoFoto);
        System.out.println("El costo de su marco sera: " + costoMarcoRegular);
        
        costoPonerCarton = (0.02 * ((longitudFoto + longitudFoto) * (longitudFoto + longitudFoto)));
        System.out.println("El costo por poner un carton detras de la fotografia es de: " + costoPonerCarton + "U$");
        
        costoPonerVidrio = 0.07 * (longitudFoto + longitudFoto) * (longitudFoto + longitudFoto);
        System.out.println("El costro por poner el vidrio sobre la fotografia es de: "+ costoPonerVidrio + "U$");
        
        enmarcarFoto = costoMarcoRegular + pintarMarco + costoPonerCarton + costoPonerVidrio + costoPonerCorona;
        double costoPorEnmarcaFoto = 0;
       
        
        System.out.println("El costo total por enmarcar su fotografia con un tipo de marco regular es de: " + enmarcarFoto + "US");
        
        
            
        }
    }
    entrada.close();
    }
}
