import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("O nome digitado foi: "+ nome);
    }
}
