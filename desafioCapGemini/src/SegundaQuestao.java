import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SegundaQuestao {
    public static void main(String[]args) {

        System.out.println("----Digite uma senha para verificar-mos se ela é forte o suficiente----");
        /*
        A senha deve conter:
        Possui no mínimo 6 caracteres.
        Contém no mínimo 1 digito.
        Contém no mínimo 1 letra em minúsculo.
        Contém no mínimo 1 letra em maiúsculo.
        Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
         */
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
                scanner.close();
            } else System.out.println("Digite uma senha mais forte");

        }
        }
    }
