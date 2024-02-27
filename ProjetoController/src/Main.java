import Models.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Usuario usuario1 = new Usuario("Sérgio", "32132154", "1654321654", 20202023);
        Evento evento1 = new Evento(12, 2, "Data de Hoje", "3132132132", "3213265465");
        Marca marca1 = new Marca(1, "Descrição da Marca" );
        Veiculo veiculo1 = new Veiculo(1,"2024", ClasseEnum.Toyota);
        Cep cep1 = new Cep(8430860, "Balandia 34", "casa", "Guaianazes", "São Paulo", "SP");


        /*char type = sc.next().charAt(0);
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Renda Anual: ");
        double rendaAnual = sc.nextDouble();*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Nome do Usuario: " );
        usuario1.Username = sc.next();
        System.out.println("Digite o Id do Usuario: ");
        evento1.IdUsuario = sc.nextInt();
        System.out.println("Digite Id DA marca:");
        veiculo1.IdMarca = sc.nextInt();
        System.out.println("Digite o Modelo do Automovel:");
        veiculo1.Modelo = sc.next();
        System.out.println("Digite o CEP DO Cliente: ");
        cep1.CEP = sc.nextFloat();
        System.out.println("Digite a Rua do Cliente: ");
        cep1.RUA= sc.next();










    }
}