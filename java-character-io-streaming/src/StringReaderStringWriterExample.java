import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderStringWriterExample {

        public static void main(String[] args) throws IOException {
            String s = "hello from string";
            StringReader stringReader = new StringReader(s);
            char [] charactersFromString = new char[50];

            stringReader.read(charactersFromString);
            System.out.println(charactersFromString);

            StringWriter stringWriter=new StringWriter();

            String writtenString = "" ;

            stringWriter.write(writtenString);
            System.out.println(writtenString);
        }
}