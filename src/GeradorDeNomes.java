import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GeradorDeNomes {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(new File("src/nomes.txt"));
        List<String> listaDeNomes = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            listaDeNomes.add(linha);
        }

        for (int i = 0; i <10; i++) {

            String nomeAleatorio = geraNomeAleatório(listaDeNomes);
            System.out.printf("     Nome: %s%n  ",nomeAleatorio );
        }

    }

    public static String geraNomeAleatório (List<String> listaDeNomes){
        int numeroAleatorio = new Random().nextInt(200) ;
        String nomeAleatorio = listaDeNomes.get(numeroAleatorio);

        return nomeAleatorio;
    }
}
