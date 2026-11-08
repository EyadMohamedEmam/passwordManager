import java.util.ArrayList;
import java.util.Scanner;

public class PasswordManger {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
      ArrayList<PasswordEntry> entries = new ArrayList<>();
      PasswordM pm = new PasswordM();
      System.out.print("Welcome to Password Manger!\n ");

      ConsuleInterface face = new ConsuleInterface();
      int choice=6;
     do {
         face.displayMenu();
          choice= face.getUserInput();
         switch (choice) {
             case 1:
                 face.showMessage("enter platform");
                 String platform = sc.nextLine();
                 face.showMessage("enter username");
                 String username = sc.nextLine();
                 face.showMessage("enter password");
                 String password = sc.nextLine();
                 String notes;
                 face.showMessage("do you want to add notes if yes =1 ");
                 int option = face.getUserInput();
                   if(option == 1) {
                        notes = sc.nextLine();
                   }else {
                       notes="no notes";
                   }
                   PasswordEntry entry = new PasswordEntry(platform,username,password,notes);
                   pm.addPassword(entry);
                 break;
             case 2:

                 break;
             case 3:
                 break;
             case 4:
                 break;
             case 5:
                 break;
             case 6:
                 break;
             default:
         }
     }while(choice != 6);
      sc.close();
    }
}
