package JavaCore.OOP.VD34;

public class equals {
    private String fullName;
    private String firstName;
    private String lastName;

    public equals(String fullName, String firstName, String lastName) {
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void xuat() {
        System.out.println("Full Name:" + this.firstName + this.fullName + this.lastName);
    }
}
