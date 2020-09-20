import service.EmailFilter;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try (final InputStream input = System.in; // источник данных
             final PrintStream output = new PrintStream(System.out)) {  //new FileOutputStream("C://email.txt"))) { // приёмник данных

            new EmailFilter(input, output);

        }  catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
