package smartphone;

public abstract class Contact {

    private final String name;

    public Contact(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
