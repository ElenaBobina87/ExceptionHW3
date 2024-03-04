
import java.util.Scanner;

public class Data {
    String name;
    String dateOfBirth;
    long numberPhone;
    String gender;
    String str;
    int sizeStr = 6;
 
    public int checkQuantity(String[] array) {
        if (array.length == sizeStr) {
            return 1;
        } else if (array.length > sizeStr) {
            System.out.println("Введено больше данных, чем нужно");
            return -1;
        } else {
            System.out.println("Введено меньше данных, чем нужно");
            return -2;
        }
    }

    public boolean checkName(String s) {
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if (i == 0) {
                if (!Character.isUpperCase(charArr[i])) {
                    throw new NameException();
                }   
            } else {
                if (!Character.isLowerCase(charArr[i])) {
                    throw new NameException();
                }

            }
            if(!Character.isLetter(charArr[i])) {
                throw new NameException();
            } 
        }
        return true;
    }

    public String checkDateOfBirth(String s) {
        String[] charArr = s.split("");
        if (charArr.length != 10) {
            throw new DateOfBirthException();
        }
        for(int i = 0; i < charArr.length; i++){
            
            if (i != 2 && i != 5) {
                try {
                    Integer.parseInt(charArr[i]);
                } catch(NumberFormatException e) {
                    
                    throw new DateOfBirthException();
                }
            }
            if (i == 2 || i == 5) {
                if (!charArr[i].equals(".")) {
                    System.out.println("1");
                    throw new DateOfBirthException();
                }
            }
        }
        return s;
    }

    public long checkNumberPhone(String s) {
        long res;
        if (s.length() != 10) {
            throw new LengthException();
        }
        try {
            res = Long.parseLong(s); 
        } catch(NumberFormatException e) {
            throw new PhoneException();
        }
        return res;
    }

    public String chechGender(String s) {
        if (!s.equals("f") && !s.equals("m")) {
            throw new GenderException();
        }
        return s;
    }

    
    
    public String[] getData() {
        System.out.println("Введите ФИО, дату рождения, номер телефона и пол (m - если мужской, f - если женский) через пробел");
        Scanner iScanner = new Scanner(System.in);
        this.str = iScanner.nextLine();
        //iScanner.close();
        String[] array = str.split(" ");
        while (checkQuantity(array) != 1) {
            System.out.println("Введите ФИО, дату рождения, номер телефона и пол (m - если мужской, f - если женский) через пробел");
            iScanner = new Scanner(System.in);
            this.str = iScanner.nextLine();
            array = str.split(" ");
        }
        return array;
    }

    public String getName(String[] array) {
        
        if (checkName(array[0]) && checkName(array[1]) && checkName(array[2])) {
            name = array[0] + " " + array[1] + " " + array[2];
        }
        return name;
    }

    public String getDateOfBirth(String[] array) {
        dateOfBirth = checkDateOfBirth(array[3]);
        return dateOfBirth;
    }

    public long getNumberPhone(String[] array) {
        numberPhone = checkNumberPhone(array[4]);
        return numberPhone;
    }

    public String getGender(String[] array) {
        gender = chechGender(array[5]);
        return gender;
    }

        

        
        
        
        
       

        
    

}
