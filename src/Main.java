import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<RH> funcionarios = new ArrayList<>();
        Scanner ismael = new Scanner(System.in);

        String continuar = "s";

        while(continuar.equals("s")){
            System.out.println("insira o nome");
            String nome = ismael.next();
            System.out.println("insira o CPF");
            String cpf = ismael.next();
            System.out.println("insira telefone");
            String telefone = ismael.next();
            System.out.println("insira periodo");
            String periodo = ismael.next();

            RH funcionario = new RH(nome, cpf, telefone, new Date(), new Date(), periodo);
            funcionarios.add(funcionario);
            System.out.println("deseja continuar? s/n");
            String continu = ismael.next();
            continuar = continu;
        }


        System.out.println(funcionarios.toString());
    }
}
