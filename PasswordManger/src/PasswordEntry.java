import java.time.LocalDateTime;
public class PasswordEntry {
  private String platform;
  private String username;
  private String password;
  private String notes;
  private LocalDateTime dateCreated;
  private LocalDateTime dateModified;
  private int id;
  private static int nextId = 1;

  public String getPlatform() { return platform;}
  public String getUsername() { return username;}
  public String getPassword() { return password;}
  public String getNotes() { return notes;}
  public LocalDateTime getDateCreated() { return dateCreated;}
  public LocalDateTime getDateModified() { return dateModified;}
  public int getId() { return id;}

  public PasswordEntry (String platform, String username, String password, String notes) {
    this.platform = platform;
    this.username = username;
    this.password = password;
    this.notes = notes;
    this.dateCreated = LocalDateTime.now();
    this.dateModified = LocalDateTime.now();
    this.id = nextId++;
  }
  public void setPassword(String password) {
    this.password = password;
    this.dateModified = LocalDateTime.now();
  }

  public void setUsername(String Username){
    this.username = Username;
    this.dateModified = LocalDateTime.now();
  }

  public void setNotes(String Notes){
    this.notes= Notes;
    this.dateModified = LocalDateTime.now();
  }

  public void setPlatform(String platform){
    this.platform = platform;
    this.dateModified = LocalDateTime.now();
  }
  public void setId(int id) {
    this.id = id;
  }

  public void setDateCreated(LocalDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public void setDateModified(LocalDateTime dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public String toString(){
    return "Entry #" + id + "\n" +
            "platform: " + platform +"\n"+
            "username: " + username + "\n"+
            "password: ********* (hidden - press 'S' to show) \n"+
            "notes: " + notes
            + "\ndateCreated: " + dateCreated
            + "\ndateModified: " + dateModified;

  }
  public String showPassword(){
    return password;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PasswordEntry passwordEntry = (PasswordEntry) o;
    return platform.equals(passwordEntry.platform)&&
            username.equals(passwordEntry.username)
            && password.equals(passwordEntry.password);

  }

  @Override
  public int hashCode(){
    return java.util.Objects.hash(platform,username,password);
  }

  public String toCSV(){
    return id + "," + platform + "," + username + "," + password + "," +notes + "," + dateCreated + "," + dateModified;
  }

}