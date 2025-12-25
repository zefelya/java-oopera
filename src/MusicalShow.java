import java.util.ArrayList;

public class MusicalShow extends Show{

    String musicAuthor;
    String librettoText;
    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        super(title, duration, director, listOfActors);
    }
public  void PrintLibretto(){
        System.out.println(librettoText);
    }
}
