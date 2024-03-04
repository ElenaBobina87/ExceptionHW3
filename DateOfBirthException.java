public class DateOfBirthException extends NumberFormatException{
    public DateOfBirthException() {
        super("Неверный формат даты! Необходимо ввести дату рождения в формате dd.mm.yyyy");
    }
}
