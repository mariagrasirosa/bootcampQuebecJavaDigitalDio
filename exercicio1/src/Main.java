import java.util.Scanner;

public class Main {

    public static void callsMain(){

        Message.greetings();

        int option = 0;
        Scanner read = new Scanner(System.in);
    
            //list options of calculate to users
        while(option < 3){
    
            System.out.println("--------------- Menu --------------\n");
            System.out.println("-----------------------------------\n");
            System.out.println("-- [1]: Calcular\n");
            System.out.println("-- [2]: Contratar Empréstimo\n");
            System.out.println("-- [3]: Sair\n");
    
            System.out.println("Informe a opção desejada\n");
            option = read.nextInt();
            System.out.println("\n");

    
            switch(option){
    
                case 1:

                Calculator.calculate();
                 break; 
    
                case 2:

                Lending.hire();
                break;

                default:

                break;
            }
        }
    
        }
    public static void main(String[] args) throws Exception {

        callsMain();

    }
}
