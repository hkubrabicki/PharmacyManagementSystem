package labproject;

public class CustomerInformation extends Person {

    private String surname;
    private String identityNumber;

    public CustomerInformation(String name, String surname, String identityNumber) {
        super(name);  
        this.surname = surname;
        this.identityNumber = identityNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
