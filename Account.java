import java.util.Random;

public class Account {

    private int accNumber;
    private String name;
    private String phoneNumber;
    private String email;

    public Account(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

        this.accNumber = getAccNumber();
        System.out.println("New user " + this.name + " with phone number " + this.phoneNumber + " and e-mail " + this.email + ". Your account number is: " + this.accNumber + ".");
    }

    public int getAccNumber() {

        Random rand = new Random();
        int randomNumber = rand.nextInt(90000000) + 10000000;

        return randomNumber;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
