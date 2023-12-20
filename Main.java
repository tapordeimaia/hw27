import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("Maia\n");
            writer.write("Lia\n");
        }

        List<String> texte = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String s;
            while((s= reader.readLine())!=null){
                System.out.println(s);
                texte.add(s);
            }
        }

        List<String> textemodificate = new ArrayList<>();

        for(String text: texte){
            textemodificate.add(text.toUpperCase());
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (String s: textemodificate){
                writer.write(s);
                writer.newLine();
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String s;
            while((s= reader.readLine())!=null){
                System.out.println(s);
                texte.add(s);
            }
        }
    }
}