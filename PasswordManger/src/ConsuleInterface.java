import java.util.List;
import java.util.Scanner;
public class ConsuleInterface {
    private Scanner sc = new Scanner(System.in);

    public void displayMenu (){
        System.out.println( """
              === Password Manager ===\n
              1. Add new password\n
              2. View all passwords\n
              3. Search password by platform\n
              4. Edit existing password\n
              5. Delete password\n
              6. Exit\n
              Please select an option (1-6):
              
              """);
    }

    public int getUserInput(){
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public void displayPassword(List<PasswordEntry> passwords){
        if(passwords.isEmpty()){
            System.out.println("No password stored ");
        }else {
            for(PasswordEntry entry : passwords){
                System.out.println(entry.toString());
                System.out.println("-------------");
            }
        }

    }
    public void showMessage(String message) {
        System.out.println(message);
    }

}
