import java.util.ArrayList;

public class Show{
    String title;
    int duration;
    Director director;
    ArrayList <Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public void PrintDirectorInfo(){
        System.out.println(director.name + director.surname); //заменить на гетеры
    }
}
