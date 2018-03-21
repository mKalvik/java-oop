package Kodu4.client;

public class JuniorClientParent {

    private String phoneNumber;
    private String email;
    private String firstName;
    private String lastName;


    public JuniorClientParent(String phoneNumber, String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
