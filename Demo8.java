import java.util.Scanner;

public class Demo8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "";
        String password = "";
        String reply;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited this site earlier? (yes/no)");
            reply = sc.nextLine();

            if (reply.equals("no")) {
                System.out.println("Login here");
                System.out.println("Enter your login id and password");
                loginid = sc.nextLine();
                password = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }
        } while (!(loginid.equals("pavan") && password.equals("1234")));
        
        sc.close();
    }
}
