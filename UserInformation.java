 
package labproject;

public class UserInformation extends Person {
    private String password;
 
    public UserInformation() {}

    public UserInformation(String name, String password) {
        super(name); //from person
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
}