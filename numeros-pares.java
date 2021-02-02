
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
    
      
      Scanner entrada = new Scanner(System.in);
      int i = entrada.nextInt();

      
      for (int contador=1; contador <= i; contador++) {
        if (contador%2==0) {
          System.out.println(contador);          
        }
      }
    }
}
