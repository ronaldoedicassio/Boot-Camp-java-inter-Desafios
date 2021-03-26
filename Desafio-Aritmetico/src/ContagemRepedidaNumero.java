import java.util.*;


public class ContagemRepedidaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        //declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        Map<Integer, Integer> numerosQtd = new HashMap<>();

        int qtd = sc.nextInt();
        while (qtd > 0) {
            listaNumeros.add(sc.nextInt());
            qtd--;
        }

        for (int e : listaNumeros) {
            if (numerosQtd.containsKey(e)) {
                int aux = numerosQtd.get(e);
                numerosQtd.put(e, aux + 1);
            } else {
                numerosQtd.put(e, 1);
            }

        }

        numerosQtd.entrySet().stream()
                .sorted(Map.Entry.<Integer,Integer> comparingByKey()).forEach(entry -> {
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}


