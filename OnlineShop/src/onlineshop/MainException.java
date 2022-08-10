package onlineshop;

import java.util.Scanner;

public class MainException {

    private String Name;
    private String HomeAddress;
    private String City;
    private String PhoneNumber;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(String HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void input() throws Location, PhoneNumber {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name :");
        this.Name = sc.nextLine();
        System.out.println("Home Address :");
        this.HomeAddress = sc.nextLine();
        System.out.println("City :");
        String u = sc.nextLine();
        if (u.equals("Dhaka") || u.equals("Chittagong")) {
            this.City = u;
        } else {
            throw new Location("Invalid Location");
        }
        System.out.println("Phone Number : ");
        String v = sc.nextLine();
        if (v.startsWith("01")) {
            this.PhoneNumber = v;
        } else {
            throw new PhoneNumber("Invalid Phone Number");
        }

    }
}
