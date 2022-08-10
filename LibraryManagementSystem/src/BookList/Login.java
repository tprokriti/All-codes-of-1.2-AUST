package BookList;

public class Login implements Security {

    private String user;
    private int pass;

    public Login(String user, int pass) {
        this.user = user;
        this.pass = pass;

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public void Username(String a) {
        System.out.println("Username :" + getUser());

    }

    @Override
    public void Password(int b) {
        System.out.println("Password :" + getPass());
    }
}
