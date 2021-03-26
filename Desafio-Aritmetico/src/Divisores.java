import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //declare suas variaveis
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        br.close();

        //declare suas variaveis com o valor correto
        int n = -1;
        int aux = 0;

        //continue o codigo
        if (c % a == 0) {
            int sqrt = (int) Math.sqrt(c);

            for (int i = 1; i <= sqrt; i++) {

                if (c % i == 0) {
                    aux = c / i;
                    if ((i % a == 0) && (i % b != 0) && (d % i != 0)) {
                        n = i;
                        break;
                    } else if ((aux % a == 0) && (aux % b != 0) && (d % aux != 0)) {
                        n = aux;
                    }
                }
            }
        }

        System.out.println(n);

    }
}
