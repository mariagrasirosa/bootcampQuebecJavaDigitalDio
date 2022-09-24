import java.util.Scanner;


public class Calculator {

    public static void calculate(){

    int option = 0;
    Scanner read = new Scanner(System.in);

    System.out.println("Informe o número 1\n");
    int num1 = read.nextInt();

    System.out.println("Informe o número 2\n");
    int num2 = read.nextInt();

        //list options of calculate to users
    while(option < 5){

        System.out.println("------------ Calculator -----------\n");
        System.out.println("-----------------------------------\n");
        System.out.println("------ Opção 1 : Subtrair    ------\n");
        System.out.println("------ Opção 2 : Somar       ------\n");
        System.out.println("------ Opção 3 : Multiplicar ------\n");
        System.out.println("------ Opção 4 : Dividir     ------\n");
        System.out.println("-----------------------------------\n");
        System.out.println("--------- Opção 5 : Sair ----------\n");

        System.out.println("Informe a opção desejada\n");
        option = read.nextInt();
        System.out.println("\n");

        switch(option){

            case 1:

             subtract(num1, num2);
             break; 

            case 2:

              add(num1, num2);
              break; 


            case 3:

              multiply(num1, num2);
              break; 


            case 4:

              divide(num1, num2);
              break; 

            default:
              break;
        }
    }

    }

    public static void add (int num1, int num2){

        int soma = num1 + num2;

        System.out.printf("O resultado da soma:"  + soma + "\n");
        System.out.println("\n");


     }


    public static void multiply (int num1, int num2){

        int mult = 0;

        mult = num1 * num2;

        System.out.printf("O resultado da multiplicação:" + mult + "\n");
        System.out.println("\n");



    }

    public static void divide (int num1, int num2){

        int divi = 0;

        divi = num1 / num2;

        System.out.printf("O resultado da divisão:" + divi + "\n");
        System.out.println("\n");

    }

    public static void subtract (int num1, int num2){

        int subt = 0;

        subt = num1 - num2;

        System.out.printf("O resultado da subtração:" + subt + "\n");
        System.out.println("\n");

    }
}
