public class Account {

    private int accNumber;
    private String name;
    private int phoneNumber;
    private String email;

    private int agency;

    public Account(int accNumber, String name, int phoneNumber, String email) {
        this.accNumber = accNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAgency() {
        return agency;
    }
}
