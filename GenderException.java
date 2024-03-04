public class GenderException extends RuntimeException {
    public GenderException() {
        super("Неверный формат пола! Введите f или m");
    }
}
