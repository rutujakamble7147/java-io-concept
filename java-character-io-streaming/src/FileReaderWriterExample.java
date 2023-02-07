import java.io.*;

public class FileReaderWriterExample {

    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-character-io-streaming\\src\\input.txt");

        System.out.println(fileReader.ready());

        int size = 50;
        char [] charactersFromInputFile = new char[size];

        fileReader.read(charactersFromInputFile);

        System.out.println(charactersFromInputFile);

        FileWriter fileWriter = new FileWriter("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-character-io-streaming\\src\\output.txt");

        System.out.println(charactersFromInputFile);




    }
}
