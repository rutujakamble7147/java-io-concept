import java.io.*;

public class BufferReaderWriterExample {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-character-io-streaming\\src\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        char[] charFRomInputFile = new char[25];
        bufferedReader.read(charFRomInputFile);
        System.out.println(charFRomInputFile);

        Writer fileWriter = new FileWriter("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-character-io-streaming\\src\\output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(charFRomInputFile);
    }
}
