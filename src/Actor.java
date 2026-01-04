import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, int height) {
        super(name, surname);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Actor actor = (Actor) object;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
