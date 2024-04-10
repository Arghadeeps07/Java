import java.io.FileNotFoundException;

public class ThrowsExample {
    static void readFile() throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }
    public static void main(String[] args) {
        try{
            readFile();
        }
        catch(FileNotFoundException e){
            System.out.println("Exection Caught:"+ e.getMessage());
        }
    }
}
