import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(12));


    }

    /*
    Ex1.
    * public - Acesso em qualquer parte do programa
    * static - O método pertence à classe e não às instâncias dela
    * void   - Não têm retorno
    * tabuada- Nome do método
    **/
    public static void tabuada(){

        Scanner s = new Scanner(System.in);
        System.out.println("Escreva um número:");
        int num = s.nextInt();


        for(int i = 1; i < 11; i++){
            System.out.println( num + " x " + i + " = " + (i*num));
        }

    }

    /**
     * Ex. Extra - Feito em aula não esta na ficha.
     * Imprimir as tabuadas todas do 1 ao 10
     */
    public static void tabuadaExtra() {
        for(int j = 1; j < 11; j++) {
            for(int i = 1; i < 11; i++) {
                System.out.println(j + " x " + i + " = " + (i * j));
            }
        }
    }

    /**
     * Ex2
     */
    public static void tabuadaIntervalo(){

        Scanner s = new Scanner(System.in);
        System.out.println("Escreva um número:");
        int num = s.nextInt();

        System.out.println("Escreva o minimo do intervalo:");
        int minimo = s.nextInt();
        System.out.println("Escreva o máximo do intervalo:");
        int maximo = s.nextInt();


        for(int i = minimo; i <= maximo; i++){
            System.out.println( num + " x " + i + " = " + (i*num));
        }

    }

    /**
     *
     * Ex3.
     * Faça um algoritmo que permita ao utilizador informar a idade de quantas pessoas ele
     * desejar até o utilizador insira 0.
     * Após isso o algoritmo deve informar a contagem das pessoas maiores de idade e a
     * média de idade das pessoas maiores de idade.
     *
     */

    public static void idadeMaiores(){
        Scanner s = new Scanner(System.in);

        int contador_maiores = 0;
        int somatorio_idades_maiores = 0;

        for(;;){

            System.out.println("Escreva um idade:");
            int idade = s.nextInt();

            //Para o ciclo for infinito
            if(idade <= 0){
                break;
            }

            if( idade >= 18){
                contador_maiores++;
                somatorio_idades_maiores += idade;
            }

        }
        System.out.println("A média dos maiores é: " + (somatorio_idades_maiores/contador_maiores));
    }

    /**
     *
     * Ex. 5 Fibonnacci
     *
     */
    public static void fibonacci(){
        int ultimo = 1;
        int penultimo = 1;

        Scanner s = new Scanner(System.in);
        System.out.println("Quantos números pretende:");
        int n = s.nextInt();

        System.out.println(penultimo);
        System.out.println(ultimo);

        for(int i = 0; i < n-2;i++){
            System.out.println(ultimo+penultimo);
            int tmp = ultimo;
            ultimo = ultimo+penultimo;
            penultimo = tmp;
        }
    }

    /**
     *
     * Ex. 6 Calculadora
     *
     */
    public static void calculadora(){

        Scanner s = new Scanner(System.in);
        double resultado = s.nextDouble();
        for(;;){
            String opcao = s.next();

            if (opcao.equals("sair")){
                return;
            }else if(opcao.equals("AC")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                resultado = s.nextDouble();
                String path = "C:\\\\users\\joao\\documents\\txt.pdf";
                continue;
            }
            double num = Double.parseDouble(s.next());

            switch (opcao){
                case "+":
                    resultado += num;
                    System.out.println(" = " + resultado);
                    break;
                case "-":
                    resultado -= num;
                    System.out.println(" = " + resultado);
                    break;
                case "/":
                    resultado /= num;
                    System.out.println(" = " + resultado);
                    break;
                case "*":
                    resultado *= num;
                    System.out.println(" = " + resultado);
                    break;
                default:
                    return;
            }

        }
    }

    // Faça um método que recebe um ano e
    // indica true se o mesmo for bissexto
    // ou false caso não seja.

    // todos anos multiplos de 400
    // todos anos multiplos de 4, excepto se for multiplo de 100
    // mas não de 400
    public static boolean bissexto(int ano){
        boolean multiplo400 = ano % 400 == 0;
        boolean multiplo4 = (ano % 4 == 0) && !(ano % 100 == 0 && ano % 400 != 0);

        if( multiplo400 || multiplo4){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Faça um programa que leia um número n e imprima se ele é primo ou não.
     * (um número primo tem apenas 2 divisores: 1 e ele mesmo! O número 1 não é primo!!!)
     */
    public static boolean isPrime(int num){

        // FOR EXCLUSIVAMENTE DIVISIVEL POR 1 E POR SI MESMO APENAS


        if(num != 1){
            for( int i = 2; i < num;i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }else{
            return false;
        }

        return true;

        }

    }