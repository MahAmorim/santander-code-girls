import java.util.*;
public class Produtos
    {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
             int desconto = input.nextInt();
             int precoAntigo = input.nextInt();
             int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
    
             System.out.println(precoNovo);
             input.close();
      }
    }
    
