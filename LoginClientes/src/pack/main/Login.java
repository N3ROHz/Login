package pack.main;
import java.util.Scanner;


public class Login {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("login> ");
        String login = in.nextLine();
        
        System.out.println("senha> ");
        String senha = in.nextLine();
        
        if(login.equals("Yan") && senha.equals("1000")){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}