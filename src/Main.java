import Classes.Author;
import Classes.Book;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author turgenev = new Author("Иван", "Тургенев");
        Author turgenev2 = new Author("Иван", "Тургенв");
        Book onegin = new Book("Евгений Онегин", pushkin, 1833);
        Book otciIDeti = new Book("Отцы и Дети", turgenev, 1960);
        Book otciIDeti2 = new Book("Отцы и Дети", turgenev, 1960);

        System.out.println(turgenev.equals(turgenev2));
    }
}