import java.util.ArrayList;

public class Show{
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public void printDirectorInfo(){
        System.out.println(director.getName() + " " + director.getSurname());
    }
    public void printActorList(){
        for (Actor actor : listOfActors){
            System.out.println(actor.getName() + " " + actor.getSurname()
                    + "(" + actor.getHeight() + ")");
        }
    }

    public void addNewActor(Actor actor){
        if(listOfActors.contains(actor)){
            listOfActors.add(actor);
        } else System.out.println("Такой актер уже есть");
    }

    public void changeActor(Actor actorChanger, String surname){
        for (Actor actor : listOfActors){
            if(actor.getSurname().equals(surname)){
                listOfActors.remove(actor);
                listOfActors.add(actorChanger);
                return;
            }
        }
        System.out.printl("Актер с такой фамилей отсуствует");
    }
}
