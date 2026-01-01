import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Евгений", "Иванов", 12.1);
        Actor actor2 = new Actor("Ольга", "Иванова", 11.1);
        Actor actor3 = new Actor("Иван", "Сидоров", 13.1);
        Director director1 = new Director("Павел", "Зайцев", 3);
        Director director2 = new Director("Олег", "Лисов", 30);
        Person musicAuthor = new Person("Мария", "Абрамова");
        Person choreographer = new Person("Евгений", "Буланов");
        Show show = new Show("Щелкунчик",2, director1, new ArrayList<Actor>());
        Opera opera = new Opera(
                "Свет",
                30,director2,
                new ArrayList<Actor>(),
                musicAuthor,
                "Текст",
                5);
        Ballet ballet = new Ballet(
                "Лебединое озеро",
                15,
                director1,
                new ArrayList<Actor>(),
                musicAuthor,
                "текст",
                choreographer);

        show.addNewActor(actor1);
        show.addNewActor(actor2);
        opera.addNewActor(actor3);
        opera.addNewActor(actor1);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor3);
        ballet.addNewActor(actor2);
        show.printActorList();
        opera.printActorList();
        ballet.printActorList();
        show.changeActor(actor3, actor1.getSurname());
        show.printActorList();
        ballet.changeActor(actor1,"фамилия");
        ballet.printLibretto();
        opera.printLibretto();
    }
}
