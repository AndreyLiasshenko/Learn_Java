package WriteObjects;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        Person people = new Person(1, " Tom");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
