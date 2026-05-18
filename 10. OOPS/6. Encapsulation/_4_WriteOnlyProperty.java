class Example2 {
    private String password;

    // write only propertry, so there is no any getter only setter.
    // a variable that an be modified but not access directly.

    public void setPassword(String password) {
        this.password = password;
    }
}

public class _4_WriteOnlyProperty {
    public static void main(String[] args) {

        Example2 user = new Example2();

        user.setPassword("Dassjii@1234");
        System.out.println("Your password is now set.");
        // there is no getteer method so we can not see password without creating getter
        // method
    }
}
