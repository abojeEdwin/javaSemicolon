package diaryapp;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private int id;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries;

    public Diary(String userName, String password,int id) {
        this.userName = userName;
        isLocked = false;
        this.entries = new ArrayList<>();
        this.id = 0;
    }
     public void setId(int id) {
        this.id = id;
     }

     public int getId() {
        return id;
     }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName == null){
            throw new NullPointerException("User name cannot be null");
        }
        if(userName.isEmpty()){
           throw new NullPointerException("User name cannot be empty");
        }
        this.userName = userName;
    }

    public void setPassword(String password) {
        if(password == null || password.equals("")) {
            throw new NullPointerException("Password cannot be null");
        }
        if(password.isEmpty()){
           throw new IllegalArgumentException("Password cannot be empty");
        }
        this.password = password;
    }

    public void lock() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlock(String Password) {
        validatePassword(Password);
          isLocked = false;

    }

    public void validatePassword(String passWord) {
        if (passWord.isEmpty()) {
         throw new IllegalArgumentException("Passwords cannot be empty");
        }
        if(passWord == null || passWord.equals("")) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        //if(!passWord.equals(this.password)) throw new IllegalArgumentException("Passwords do not match");
    }

    public void validateEntry(String title, String body) {
        if(isLocked){
            throw new IllegalArgumentException("Diary is locked ,Entry not saved.");
        }
        if(title == null || title.equals(" ") || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if(body == null || body.equals(" ")|| body.isEmpty()) {
            throw new IllegalArgumentException("Body cannot be null or empty");
        }

    }

    public void createEntry(String title, String body,int id) {
        validateEntry(title, body);
        Entry entry = new Entry(id,title,body);
        entries.add(entry);
    }

    public int getSize() {
        return entries.size();
    }

    public void deleteById(int id) {
        if(isLocked) {
            throw new IllegalArgumentException("Diary is locked");
        }
        if(this.id < 0){
            throw new IllegalArgumentException("Diary id cannot be negative, Try positive inputs from 0");
        }
        Entry entry = findEntryId(id);
        entries.remove(entry);
        this.id = -1;
        this.password = null;
    }

    public Entry findEntryId(int id) {
        if(entries.isEmpty()){
           throw new IllegalArgumentException("Diary is empty");
        }
        if(isLocked){
            throw new IllegalArgumentException("Diary is locked");
        }
        for(Entry entry : entries){
            if(entry.getId(id)==id){
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(String title, String body, int id) {
        validateEntry(title, body);
        Entry entry = findEntryId(id);
        entry.setTitle(title);
        entry.setBody(body);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Diary for: ").append(userName).append("\n");
        sb.append("Diary ID: ").append(id).append("\n");
        sb.append("Entries:\n").append(entries).append("\n");
        for(Entry entry : entries){
            sb.append(entry.toString()).append("\n");
        }
        return sb.toString();
    }
}
