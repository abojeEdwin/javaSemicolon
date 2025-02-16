package diaryapp;
import java.time.LocalDate;

public class Entry {

    private  int id ;
    private String title;
    private String body;
    private final LocalDate date;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = LocalDate.now();
    }

    public int getId(int id) {
        return this.id;
    }

    public String getTitle(String title) {
        return title;
    }

    public String getBody(String body) {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("\nId: %d\nTitle: %s\nBody: %s\nDate: %s\n", id, title, body, date);
    }
}
