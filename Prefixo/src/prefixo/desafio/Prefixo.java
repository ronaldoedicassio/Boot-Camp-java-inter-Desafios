package prefixo.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Prefixo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Scanner entrada = new Scanner(System.in);
        int countEntrada = Integer.parseInt(br.readLine());
        boolean bom = true;

        while (countEntrada > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            List<String> palavras = new ArrayList<>();
            int aux = countEntrada;

            while (st.hasMoreTokens()) {
                palavras.add(st.nextToken().trim().toLowerCase().replaceAll("\t", " "));

            }
            if (palavras.get(0).equals(1)) {
                break;
            } else {
                countEntrada--;
            }

            for (String p : palavras) {
                List<String> listaPrefixo = new ArrayList<>();
                int coutLetras = p.length();

                for (String pp : palavras) {
                    if (pp.length() >= coutLetras) {
                        listaPrefixo.add(pp.substring(0, coutLetras));
                    }
                }
                listaPrefixo.remove(p);

                if (listaPrefixo.contains(p)) {
                    bom = false;
                }
            }
            if (bom == true) {
                System.out.println("Conjunto Bom");
            } else {
                System.out.println("Conjunto Ruim");
            }
            countEntrada = entrada.nextInt();
        }
    }
}
