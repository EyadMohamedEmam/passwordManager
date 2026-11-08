import java.util.ArrayList;
public class PasswordManager {
    private ArrayList<PasswordEntry> entries = new ArrayList();
    private String fileName = "passwords.txt";

    public void addPassword(PasswordEntry entry) {
        entries.add(entry);
    }

    public void getAllPasswords() {
        for(PasswordEntry entry : entries){
            System.out.println(entry);
        }
    }

    public ArrayList<PasswordEntry> getPasswordsByUsername(String username) {
        ArrayList<PasswordEntry> result = new ArrayList<>();
        if (username == null) return result;
        for (PasswordEntry entry : entries) {
            if (entry.getUsername().equalsIgnoreCase(username)) {
                result.add(entry);
            }
        }
        return result;
    }


    public void editPassword(int id, String password  ) {
        for (PasswordEntry entry : entries) {
            if (entry.getId() == id) {
                entry.setPassword(password);

                return;
            }
        }
    }

    public void editUsername(int id, String username) {
        for (PasswordEntry entry : entries) {
            if (entry.getId() == id) {
                entry.setUsername(username);

            }
        }
    }

    public void editPlatform(int id, String platform) {
        for(PasswordEntry entry: entries ){
            if (entry.getId() == id) {
                entry.setPlatform(platform);

            }
        }
    }

    public void editNotes(int id, String notes) {
        for(PasswordEntry entry: entries ){
            if (entry.getId() == id) {
                entry.setNotes(notes);

            }
        }
    }

    public void deletePassword(int id) {
        for (int i  =0; i< entries.size();i++) {
            if (entries.get(i).getId() == id) {
                entries.remove(i);
                return;
            }
        }
    }
}
