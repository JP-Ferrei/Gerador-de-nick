import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeNick {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/Animais.txt"));
        List<String> animais = new ArrayList<>();
        Scanner scan = new Scanner(new File("src/Adjetivo.txt"));
        List<String> adjetivos = new ArrayList<>();


        while (scanner.hasNextLine()){
            String animal = scanner.nextLine();
            animais.add(animal);
        }
        while (scan.hasNextLine()){
            String adjetivo = scan.nextLine();
            adjetivos.add(adjetivo);
        }
        for (int i = 0; i < 50; i++) {

            String nickAleatorio = geraPalavra(animais) + geraPalavra(adjetivos);
            System.out.println("Nick Aletório:" + nickAleatorio +"\n");
        }
    }

    public static String geraPalavra(List<String> lista){
        String palavra = lista.get(new Random().nextInt(lista.size()));
        String palavra2 = palavra.substring(0,1).toUpperCase() + palavra.substring(1);
        return palavra2 ;

    }


}
