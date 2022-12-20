import Classes.Author;
import Classes.Book;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author turgenev = new Author("Иван", "Тургенев");
        Book onegin = new Book("Евгений Онегин", pushkin, 1833);
        Book otciIDeti = new Book("Отцы и Дети", turgenev, 1960);


        System.out.println(otciIDeti.toString()); // для проверки
        otciIDeti.setYearOfPublication(1860);
        System.out.println(otciIDeti.toString()); // для проверки


    }
}