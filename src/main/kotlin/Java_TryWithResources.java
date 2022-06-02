import java.io.FileWriter;
import java.io.IOException;

public class Java_TryWithResources {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("Hello Java");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
