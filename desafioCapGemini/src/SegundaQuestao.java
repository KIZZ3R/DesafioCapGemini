import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SegundaQuestao {
    public static void main(String[] args) {

        System.out.println("----Digite uma senha para verificar-mos se ela é forte o suficiente----");

        boolean loop = true;
        while(loop) {

            Scanner scanner = new Scanner(System.in);
            String senhaInput = scanner.nextLine();
            // senha usada no exemplo --> Ya3&ab

            //Uso do regex para filtrar as condições, de modo a ter uma senha forte.
            Pattern verificadorSenha = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*.,?])(?=.{6,}).+$");
            Matcher matcher = verificadorSenha.matcher(senhaInput);

            boolean senhaValida = matcher.find();

            if (senhaValida) {
                System.out.println("Sua senha é forte o suficiente");
                loop = false;
            } else {
                System.out.println("Digite uma senha mais forte");
            }

            scanner.close();
        }
        }
    }
