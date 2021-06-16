import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GeradorDeNickHashSet {
    public static void main(String[] args) throws FileNotFoundException {



        Scanner scanner = new Scanner(new File("src/Animais.txt"));
        Set<String> animais = new HashSet<>();
        Scanner scan = new Scanner(new File("src/Adjetivo.txt"));
        Set<String> adjetivos = new HashSet<>();

        while (scanner.hasNextLine()){
            String animal = scanner.nextLine();
            animais.add(animal);
        }
        while (scan.hasNextLine()){
            String adjetivo = scan.nextLine();
            adjetivos.add(adjetivo);
        }

        System.out.println(animais.iterator().next());
    }
}
