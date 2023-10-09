package homework;

public class UserReport {
    private User user;

    public UserReport(User user) {
        this.user = user;
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
