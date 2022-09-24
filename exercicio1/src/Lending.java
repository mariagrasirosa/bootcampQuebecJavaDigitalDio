import java.util.Scanner;

public class Lending {
    
    public static void hire(){

    int option = 0;
    Scanner read = new Scanner(System.in);

        //list options of lending to users
    while(option < 5){

        System.out.println("--------------- Opções de empréstimo ----------------\n");
        System.out.println("-----------------------------------------------------\n");
        System.out.println("------ Opção 1 : R$ 10.000,00 - 12 X R$ 272,38 ------\n");
        System.out.println("------ Opção 2 : R$ 13.000,00 - 12 X R$ 396,10 ------\n");
        System.out.println("------ Opção 3 : R$ 15.000,00 - 12 X R$ 430,04 ------\n");
        System.out.println("------ Opção 4 : R$ 17.000,00 - 12 X R$ 456,19 ------\n");
        System.out.println("------ Opção 5 : R$ 20.000,00 - 12 X R$ 544,14 ------\n");
        System.out.println("-----------------------------------------------------\n");
        System.out.println("----------------- Opção 6 : Sair --------------------\n");

        System.out.println("Informe a opção desejada\n");
        option = read.nextInt();
        System.out.println("\n");


        if (option <= 5){
            System.out.println("Ótima escolha, entraremos em contato para dar andamento em seu empréstimo!\n");
            System.out.println("\n");
            break;
        } 
    }
  
    }


}
