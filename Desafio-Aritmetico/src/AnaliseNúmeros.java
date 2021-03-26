import java.util.Scanner;

public class AnaliseNúmeros {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int valor = 0;
        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;

        //continue a solução
        for (int i = 0; i < 5; i++) {
            valor = leitor.nextInt();
            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (valor > 0) {
                pos++;
            } else if(valor < 0){
                neg++;
            }

        }
        //insira suas variaveis corretamente
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
        leitor.close();
    }
}

