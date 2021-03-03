package entrevista.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner scanner = new Scanner(System.in);


        //while (st.hasMoreTokens()) {
        while (scanner.hasNext()) {
            //String palavra = st.nextToken();
            String palavra = scanner.nextLine().trim().toLowerCase();
            // Contador delimitando min e max para formar as subStrings
            int min = palavra.length() - 1;
            int count = 1;
            int max = palavra.length();

            if (max == 1) {
                System.out.println(palavra);
            } else {
                boolean continua = true;
                while (min - count >= 0 && continua) {
                    if (palavra.substring(min - count, min).equals(palavra.substring(min, max))) {
                        System.out.println(palavra.substring(0, min));
                        continua = false;
                    }
                    count++;
                    min--;
                }
                if (continua) {
                    System.out.println(palavra);
                }
            }
            //st = new StringTokenizer(br.readLine());
        }scanner.close();
    }
}
