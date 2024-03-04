public class LengthException extends RuntimeException{
    public LengthException() {
        super("Неверное количество цифр в номере телефона. Введи номер из 10 цифр без 8 или +7");
    }
}
