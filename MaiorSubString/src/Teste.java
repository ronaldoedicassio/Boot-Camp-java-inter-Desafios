import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> primeiraLista = new ArrayList<>();
        List<String> segundaLista = new ArrayList<>();

        primeiraLista.add(br.readLine());
        segundaLista.add(br.readLine());

        System.out.println(primeiraLista);
        System.out.println(segundaLista);
    }
}
