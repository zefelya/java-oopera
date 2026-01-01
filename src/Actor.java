public class Actor extends Person {

    private double height;

    public double getHeight() {
        return height;
    }
    public Actor(String name, String surname, double height){
        super(name, surname);
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Actor actor = (Actor) object;
        return java.lang.Double.compare(height, actor.height) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), height);
    }
}
