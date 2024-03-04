
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void writeData(String name, String dataBirth, long numberPhone, String gender) throws IOException {
        String[] arr = name.split(" ");
        String name1 = arr[0];
        String fileName = name1 + ".txt";
        try(FileWriter writer = new FileWriter(fileName, true)) {
            String text = name + " " + dataBirth + " " + numberPhone + " " + gender;
            writer.write(text);
            writer.append('\n');
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
