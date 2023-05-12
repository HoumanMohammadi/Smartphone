package smartphone;

public abstract class Contact {

    private final String name;

/*    public void addContact(Contact contact){

    }*/

    public Contact(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
