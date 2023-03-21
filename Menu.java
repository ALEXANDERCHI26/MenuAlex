import java.util.Scanner;

public class Menu {
    
   
    public static void main(String[] args) {
    int op=0;
    String ALMUERZO="";
    String POSTRE=""; 
    String BEBIDA="";
    
    Scanner e = new Scanner(System.in);
    
    do{System.out.println(" PORFAVOR SELECCIONA UN ALIMENTO POR CATEGORIA");

    System.out.println(" 1- ALMUERZO");
    System.out.println(" 2- POSTRE");
    System.out.println(" 3- BEBIDA ");
    System.out.println(" 4- SALIR");
    op = e.nextInt();

    switch(op){
        case 1:
    System.out.println("SELECCIONE UN ALMUERZO");
    System.out.println(" 1- MOLE");
    System.out.println(" 2- POLLO ASADO");
    System.out.println(" 3- CHILAQUILES ");
    
    op = e.nextInt();

    switch(op){
        case 1:
        ALMUERZO = "MOLE";
        break;
        case 2:
        ALMUERZO = "POLLO ASADO";
        break;
        case 3:
        ALMUERZO = "CHILAQUILES";
        break;
        default: System.out.println("NO DISPONIBLE");

    }  
    break;




    case 2:
    System.out.println("SELECCIONE UN DESAYUNO");
    System.out.println(" 1- FLAN");
    System.out.println(" 2- PASTEL");
    System.out.println(" 3- COKTEL DE FRUTAS  ");

    op = e.nextInt();

    switch(op){
        case 1:
        POSTRE = "FLAN";
        break;
        case 2:
        POSTRE = "PASTEL ";
        break;
        case 3:
        POSTRE = "COKTEL DE FRUTAS";
        break;
        default: System.out.println("NO DISPONIBLE");

    }
    break;







    case 3:
    System.out.println("SELECCIONE UNA BEBIDA");
    System.out.println(" 1- LICUADO");
    System.out.println(" 2- REFRESCO");
    System.out.println(" 3- CAFE ");

    op = e.nextInt();

    switch(op){
        case 1:
        BEBIDA = "LICUADO";
        break;
        case 2:
        BEBIDA = "REFRESCO";
        break;
        case 3:
        BEBIDA = "CAFE";
        break;
        default: System.out.println("NO DISPONIBLE");

    }

    break;

    case 4:
    System.out.println("SALIR");
    default:
    System.out.println(" ALIMENTO NO DISPONIBLE");
 }

 }while(op !=4);
    System.out.println("USTED ORDENO:" + ALMUERZO);
    System.out.println("USTED ORDENO:" + BEBIDA);
    System.out.println("USTED ORDENO:" + POSTRE);















        
}   
}