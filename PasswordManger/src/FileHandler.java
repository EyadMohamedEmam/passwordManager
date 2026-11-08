import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java .io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FileHandler {
    public void saveToFile(String fileName, String content) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))){
            writer.write(content);
            writer.newLine();

        }catch (Exception e){
            System.out.println("Error writing to file"+e.getMessage());
        }
    }

    public ArrayList<PasswordEntry> loadFromFile(String fileName) {
        ArrayList<PasswordEntry> entries = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 7) {
                    String platform = parts[1];
                    String username = parts[2];
                    String password = parts[3];
                    String notes = parts[4];

                    PasswordEntry entry = new PasswordEntry(platform, username, password, notes);
                    entry.setId(Integer.parseInt(parts[0]));
                    entry.setDateCreated(LocalDateTime.parse(parts[5]));
                    entry.setDateModified(LocalDateTime.parse(parts[6]));

                    entries.add(entry);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return entries;
    }

    public boolean fileExists(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }


}
