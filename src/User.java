public class User {
    private String userName;
    private String password;


    boolean checkPassword(String password) {
        char[] pass = password.toCharArray();
        if (pass.length >= 8) {
            return true;
        } else return false;
    }

    void changePassword(String old, String neww) {
        old = "null";
        System.out.println(this.password = neww);
    }


    void mustChange(String permission, String newPassword) {
        if (permission.equals("admin")) {
            System.out.println(this.password = newPassword);
        } else System.out.println("noooooooo");
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
