import java.io.*;

public class InputStreamReaderOutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-character-io-streaming\\src\\input.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        char[] charactersFromInputFile = new char[50];
        inputStreamReader.read(charactersFromInputFile);
        System.out.println(charactersFromInputFile);

        OutputStream outputStream = new FileOutputStream("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-character-io-streaming\\src\\output.txt");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        outputStreamWriter.write(charactersFromInputFile);

    }
}
