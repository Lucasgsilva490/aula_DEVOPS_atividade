import java.util.ArrayList;
import java.util.Date;

public class ClassTest {
    public static void main(String[] args) {
        ArrayList<RH> funcionarios = new ArrayList<>();
        RH funcionario1 = new RH("Mirella", "48773923869", "40028922", new Date(), new Date(), "noite");
        RH funcionario2 = new RH("Lucas", "48558381869", "22982004", new Date(), new Date(), "Manhã");
        RH funcionario3 = new RH("João","joao victor lista da silva", "123456789", new Date(), new Date(), "Tarde");

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
    }
}
