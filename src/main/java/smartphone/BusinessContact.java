package smartphone;

public class BusinessContact extends Contact {

    String companyName;
    public BusinessContact(String name) {
        super(name);
        this.companyName="UNKNOWN";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
