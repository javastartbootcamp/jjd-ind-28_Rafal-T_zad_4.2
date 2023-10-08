package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person tomek = new Person("Tomeq", "Tomek", "Nowak", "tomqwdomq@gmail.com");
        Task cleaning = new Task("Sprzątanie chałupy", "wysprzątanie kuchni i łazienki");
        Task cloggedSink = new Task("Odetkanie zlewu", "Nie da się myć naczyń", 1, tomek);
        Task segregateBooks = new Task("Posegregowanie książek do sprzedaży", "Co zostawiamy, co sprzedajemy", -1);

        cleaning.showTaskPriorityDescription();
        cloggedSink.showTaskPriorityDescription();
        segregateBooks.showTaskPriorityDescription();
    }
}
