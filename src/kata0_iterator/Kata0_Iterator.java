package kata0_iterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/30 03:03 GMT
 *
 */

public class Kata0_Iterator {

    public static void main(String[] args) {
        try {
            String fileName = new String("archive.txt");
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            IteratorReader iteratorReader = new IteratorReader(reader);
            for (String line : iteratorReader) {
                System.out.println(line);
            }
            
            /*while (true) {
                String line = reader.readLine();
                if(line == null) break;
                System.out.println(line);
            }
            */
        } catch (FileNotFoundException exception){
            System.out.println("ERROR Kata0_Iterator::main (File not found) " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR Kata0_Iterator::main (IO) " + exception.getMessage());
        }
    }

}
