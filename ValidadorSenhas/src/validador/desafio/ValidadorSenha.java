package validador.desafio;

import java.util.Scanner;

//utilizando Regex

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String disponivel = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        String contem = "[a-zA-Z0-9]+";

        while (entrada.hasNextLine()) {
            String senha = entrada.nextLine();

            if (senha.length() >= 6 && senha.length() <= 32 && senha.matches(contem) && senha.matches(disponivel)) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}
