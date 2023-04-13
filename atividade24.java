import java.util.Scanner;

public class atividade24{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticoes;
        System.out.print("Digite a quantidade de repetições desejadas: ");
        repeticoes = scan.nextInt();
        for(int i = 1; i <= repeticoes; i++){
            System.out.print("Digite um numero: ");
            int numero = scan.nextInt();
            if(numero == 0){
                System.out.println("Zero");
            }else if(numero > 0){
                System.out.println("Número positivo");
            }else{
                System.out.println("Número negativo");
            }
        }
    }
}
