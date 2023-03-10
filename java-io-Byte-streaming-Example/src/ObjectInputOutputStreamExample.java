import java.io.*;

/**
 * Working of ObjectInputStream and ObjectOutputStream
 * 1. The ObjectInputStream is mainly used to read data/object written by the ObjectOutputStream.
 * 2. Basically, the ObjectOutputStream converts/writes Java objects into corresponding streams.
 *    Those converted streams can be stored in files or transferred through networks.
 *    This is known as Serialization.
 * 3. Now, if we need to read those objects, we will use the ObjectInputStream that will
 *    convert the streams back to corresponding objects. This is known as Deserialization.
 */

class Student implements Serializable{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Integer id = 100;
        String msg = "Hello Input/Output Stream";
        Student student = new Student("Rutuja",100);

        OutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\output.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(id);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        InputStream fileInputStream = new FileInputStream("C:\\Users\\Rutuja\\IdeaProjects\\java-io-concepts\\java-io-byte-streaming\\src\\input.txt");

        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream1.readObject());
        System.out.println(objectInputStream1.readObject());
        System.out.println(objectInputStream1.readObject());
    }
}