// 16. Exception Propagation in Constructors
import java.io.*;

class FileHandler {
    public FileHandler(String filename) throws IOException {
        File f = new File(filename);
        if (!f.exists())
            throw new IOException("File not found: " + filename);
        System.out.println("File opened successfully!");
    }
}

public class FileConstructorDemo {
    public static void main(String[] args) {
        try {
            new FileHandler("missing.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
