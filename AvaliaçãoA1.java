import java.util.Scanner;

public class AvaliaçãoA1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o nome do profissional? ");
        String nome = sc.next();

        System.out.println("qual o cargo ocupado? (Cientista, Engenheiro, Zelador, Administrativo)");
        String cargo = sc.next();

        System.out.println("qual o nível de acesso? 1-10");
        int acesso = sc.nextInt();
        
        System.out.println("qual o nível de sigilo da área? 1-10");
        int sigilo = sc.nextInt();
        if(acesso <= 10 && acesso >= 1 && sigilo <= 10 && sigilo >= 1){

        
        System.out.println("-----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);

        if(acesso >= sigilo){
            System.out.println("ACESSO PERMITIDO");

            int autoridade = acesso - sigilo;

         System.out.println("Saldo de autoridade: " + autoridade);
        }else{
            System.out.println("ACESSO NEGADO");
            if(sigilo > 7 && acesso < 3){
                System.out.println("ALERTA DE SEGURANÇA!!!");
            }
        }
       
        }else{
            System.out.println("Erro: Nível de acesso ou sigilo inválido");
        }
        



     sc.close();


    }
}