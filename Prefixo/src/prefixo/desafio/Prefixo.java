package prefixo.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prefixo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int countEntrada = Integer.parseInt(br.readLine());
        boolean bom = true;

        while (countEntrada != 0) {
            List<String> palavras = new ArrayList<>();

            for (int i = 0; i < countEntrada; i++) {
                palavras.add(br.readLine());
            }

            for (String p : palavras) {
                List<String> listaPrefixo = new ArrayList<>();

                for (String pp : palavras) {
                    if (pp.length() >= p.length()) {
                        listaPrefixo.add(pp.substring(0, p.length()));
                    }
                }
                listaPrefixo.remove(p);
                if (listaPrefixo.contains(p)) {
                    bom = false;
                }
            }
            if (bom) {
                System.out.println("Conjunto Bom");
            } else {
                System.out.println("Conjunto Ruim");
                bom = true;
            }

            countEntrada = Integer.valueOf(br.readLine());

        }
    }
}