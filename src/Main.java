import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt();


        try{
               contar(parametroUm,parametroDois);

        }catch (ParametrosInvalidosException exception){
        }


    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }else {

            int contagem = parametroDois - parametroUm;

            for(int i=0; i < contagem ; i++){
                System.out.println("Imprimindo o número: "+i);
            }
        }
    }


}