import java.util.Scanner;
public class Eleitorado {
    
       public static void main(String[] args) {
    
           Scanner input = new Scanner(System.in);
    
           int habitantes = input.nextInt();
    
           int brancos = input.nextInt();
    
           int nulos = input.nextInt();
    
           int validos = input.nextInt();
    
           int pbrancos = (brancos * 100)  /habitantes;
    
           int pnulos = (nulos * 100)/habitantes;
    
           int pvalidos= ( validos * 100)/habitantes;
    
           System.out.println("Brancos:  " + pbrancos + "%");
    
           System.out.println("Nulos:  " +  pnulos + "%");
    
           System.out.println("Validos:  " + pvalidos + "%");
    
       }
    
    }