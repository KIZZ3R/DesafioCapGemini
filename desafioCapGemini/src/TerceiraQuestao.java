import java.util.*;

public class TerceiraQuestao {
    public static void main(String[] args) {

        String string, substring;
        int length, inputInt;

        Scanner in = new Scanner(System.in);
        System.out.println("DIGITE A QUANTIDADE DE PALAVRAS QUE GOSTARIA DE DIGITAR");
        inputInt = Integer.parseInt(in.nextLine());

        while (inputInt > 0) {

            inputInt--;
            ArrayList<String> array = new ArrayList<>();

            string = in.nextLine();
            length = string.length();

            for (int c = 0; c < length; c++) {
                for (int i = 1; i <= length - c; i++) {
                    substring = string.substring(c, c + i);

                    char[] chars = substring.toCharArray();
                    Arrays.sort(chars);

                    substring = new String(chars);
                    array.add(substring);
                }
            }
            Collections.sort(array);
            int finalLength = 0;

            System.out.println(array);

            /*
            O primeiro for será o que irá comparar o próximo index após o
            segundo for entrar no else.
             */
            for (int j = 0; j < array.size() - 1; j++) {
                for(int i=j;i<array.size() - 1;i++) {
                    if(array.get(i).equals(array.get(i+1))) {
                        finalLength++;
                    } else {
                        i=array.size();
                    }
                }}
                System.out.println("" + finalLength);
            }

            in.close();
        }
    }
