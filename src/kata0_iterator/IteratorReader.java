
package kata0_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author FernandoSanfielReyes
 * @version 1.0 2020/11/30 03:11 GMT
 *
 */

public class IteratorReader implements Iterable<String> {

    private final BufferedReader reader;

    public IteratorReader(BufferedReader reader) {
        this.reader = reader;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            String currentLine = readLine();
            
            @Override
            public boolean hasNext() {
                return currentLine != null;
            }

            @Override
            public String next() {
                String resultLine = currentLine;
                currentLine = readLine();
                return resultLine;
            }
            
            private String readLine() {
                try {
                    return reader.readLine();
                } catch (IOException ex) {
                    return null;
                }
            }
        };
    }
    
}
