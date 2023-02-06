import java.io.*;

public class BufferInputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream FileInputStream = new FileInputStream("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-io-Byte-streaming-Example\\src\\dummyInputFile.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(FileInputStream);
        System.out.println(bufferedInputStream.available());

        byte[] bytes = bufferedInputStream.readAllBytes();
        System.out.println(new String(bytes));

        OutputStream FileOutputStream = new FileOutputStream("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concept\\java-io-Byte-streaming-Example\\src\\dummyOutFile.txt");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(FileOutputStream);

        bufferedOutputStream.write(bytes);


    }
}
