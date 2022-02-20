import java.util.*;

public class TerceiraQuestao {
    public static void main(String[] args) {

        String palavraEscolhida;
        String substringsDasPalavras;
        int lengthDaPalavra;
        boolean condicaoWhile = true;

        Scanner in = new Scanner(System.in);
        System.out.println("DIGITE A PALAVRA QUE DESEJA VER O ANAGRAMA DAS SUBSTRINGS");

        while (condicaoWhile) {

            condicaoWhile = false;
            ArrayList<String> arrayComAsPalavras = new ArrayList<>();

            palavraEscolhida = in.nextLine();
            lengthDaPalavra = palavraEscolhida.length();

            for (int c = 0; c < lengthDaPalavra; c++) {
                for (int i = 1; i <= lengthDaPalavra - c; i++) {
                    substringsDasPalavras = palavraEscolhida.substring(c, c + i);

                    char[] chars = substringsDasPalavras.toCharArray();
                    Arrays.sort(chars);

                    substringsDasPalavras = new String(chars);
                    arrayComAsPalavras.add(substringsDasPalavras);
                }
            }
            Collections.sort(arrayComAsPalavras);
            int tamanhoFinalDaSubstrings = 0;

            System.out.println(arrayComAsPalavras);
            /*
            O primeiro for será o que irá comparar o próximo index após o
            segundo for entrar no else.
             */
            for (int j = 0; j < arrayComAsPalavras.size() - 1; j++) {
                for(int i=j;i<arrayComAsPalavras.size() - 1;i++) {
                    if(arrayComAsPalavras.get(i).equals(arrayComAsPalavras.get(i+1))) {
                        tamanhoFinalDaSubstrings++;
                    } else {
                        i=arrayComAsPalavras.size();
                    }
                }}
                System.out.println("" + tamanhoFinalDaSubstrings);
            }

            in.close();
        }
    }
