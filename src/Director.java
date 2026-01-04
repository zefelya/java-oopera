public class Director extends Person {

    private int numberOfShows;

    public Director(String name, String surname, int numberOfShows) {
        super(name, surname);
        this.numberOfShows = numberOfShows;
    }
}
