import java.util.Scanner;

public class Notas {
public static void main(String[] args) {
    
    Scanner entradaScanner = new Scanner(System.in);

    System.out.println("Digite sua nota: ");
    double nota = entradaScanner.nextDouble();

    if (nota > 10 || nota <0) {
        System.out.println("Nota Invalida");
    }  
    if(nota == 10){
        System.out.println("Parabéns , nota máxima!!!");

    }
    else if ( nota <= 8.1) {
        System.out.println("Conceito A");
        System.out.println("Parabéns");
    }
    else if ( nota <= 6.1) {
    System.out.println("Conceito B");
    }

    else if ( nota <= 4.1) {
     System.out.println("Conceito C");
    }

    else if ( nota <= 2.1) {
     System.out.println("Conceito D");
    }



     System.out.println("Fim");
      entradaScanner.close();




}



}
