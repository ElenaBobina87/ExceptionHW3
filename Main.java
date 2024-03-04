import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Data data = new Data();
        String[] str = data.getData();
        CreateFile cf = new CreateFile();
        cf.writeData(data.getName(str), data.getDateOfBirth(str), data.getNumberPhone(str), data.getGender(str));
    }
}
