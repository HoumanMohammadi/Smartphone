package smartphone;

import java.util.Arrays;

public class Smartphone implements GPS, Radio{

    private String modelName;

    private String producerName;

    private Contact[] allContacts;

    public Smartphone() {
    }

    public Smartphone(String modelName, String producerName, Contact[] allContacts) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.allContacts = allContacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started!");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped!");
        return false;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Contact[] getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", allContacts=" + Arrays.toString(allContacts) +
                '}';
    }
}
