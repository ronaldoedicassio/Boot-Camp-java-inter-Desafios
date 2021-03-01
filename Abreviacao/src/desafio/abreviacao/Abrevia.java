package desafio.abreviacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Comparator;
import java.util.Map;


public class Abrevia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // preenchendo array com as frase das frases
            List<String> frase = new ArrayList<>();

            while (st.hasMoreTokens()) {
                frase.add(st.nextToken().trim().toLowerCase().replaceAll("\t", " "));
            }

            if (frase.size() == 1 && frase.get(0).equals(".")) {
                break;
            }
            if (frase.size() == 0) {
                continue;
            }

            int countAbreviacao = 0;

            // MAP para salvar as frase abreviadas
            Map<String, String> palavrasAbreviadas = new HashMap<>();

            // calculo dos caracteres que vai ser economizados por palavra
            Map<String, Integer> palavraQdtCaracterEconomizados = new HashMap<>();
            frase.forEach(letra -> {
                if (letra.length() > 2) {
                    int qtpPalavras = 0;
                    int qtdLetras;

                    qtdLetras = letra.length() - 2;
                    for (String p : frase) {
                        if (p.equals(letra)) {
                            qtpPalavras++;
                        }
                    }
                    palavraQdtCaracterEconomizados.put(letra, qtpPalavras * qtdLetras);
                }

            });

            // adicionando as frase abreviadas
            for (String p : frase) {
                if (p.length() > 2) {

                    // logica para preencher a palavra abreviada
                    String abrevia = p.charAt(0) + ".";


                    if (!palavrasAbreviadas.containsKey(abrevia)) { // verifica se existe na tabela de abreviação
                        palavrasAbreviadas.put(abrevia, p);
                        frase.set(frase.indexOf(p), abrevia);
                        countAbreviacao++;

                    } else if (palavraQdtCaracterEconomizados.get(p) > palavraQdtCaracterEconomizados.get(palavrasAbreviadas.get(abrevia))) {
                        for (String pp : frase) {
                            if (pp.equals(abrevia)) {
                                // Atualizar a palavra abreviada com nome completo dela antes de atualizar a base de dados
                                frase.set(frase.indexOf(abrevia), palavrasAbreviadas.get(abrevia));
                            }
                        }
                        palavrasAbreviadas.put(abrevia, p);
                        frase.set(frase.indexOf(p), abrevia);
                    }

                    for (String pp : frase) {
                        if (pp.equals(p) && palavrasAbreviadas.containsValue(p)) {
                            frase.set(frase.indexOf(pp), abrevia);
                        }

                    }
                }
            }
            // Mostrando a frase
            for (
                    String p : frase) {
                System.out.print(p + " ");
            }

            // Mostrando quantidade de frase abreviada
            System.out.println("\n" + countAbreviacao);

            // Ordenando MAP
            ComparatorInts compInt = new ComparatorInts(palavrasAbreviadas);

            Map<String, String> mapaOrdenado = new TreeMap(compInt);
            mapaOrdenado.putAll(palavrasAbreviadas);

            // Mostrando legenda das frase abreviada em ordem
            for (String key : mapaOrdenado.keySet()) {
                System.out.println(key + " = " + mapaOrdenado.get(key));
            }
        }

    }


    public static class ComparatorInts implements Comparator<String> {

        Map<String, String> base;

        public ComparatorInts(Map<String, String> base) {
            this.base = base;
        }

        @Override
        public int compare(String o1, String o2) {
            return base.get(o1).compareTo(base.get(o2));
        }
    }
}


