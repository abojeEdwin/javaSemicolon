import java.util.ArrayList;

public class DiaryProperties {

    private boolean isLocked;
    private ArrayList<DiaryEntry> entries;

    public void Diary(){
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public void LockDiary(){
        isLocked=true;
        System.out.println("Your dairy is locked");
    }

    public void createDiary(){
        System.out.println("Your dairy has been created");
    }

    public void addNewEntry(DiaryEntry entry){
        if(!isLocked){
            this.entries.add(entry);
            System.out.println("Your dairy entry was successfully added.");
        }else{
            System.out.println("Your diary is locked.");
        }

    }

    public void UnlockDiary(){
       isLocked=false;
       System.out.println("Your diary has been unlocked.");
    }

    public DiaryEntry findEntryById(String diaryId){
        for(DiaryEntry entry : entries){
            if(entry.getDiary().equals(diaryId)){
                return entry;
            }
        }
        return null;
    }

    public void UpdateDiary(DiaryEntry newEntry){
        if(!isLocked){
            DiaryEntry entry = findEntryById(newEntry.getDiary());
            if (entry != null){
                entry.setContent(newEntry.getContent());
            }else {
                System.out.println("Your diary entry not found. ");
            }
        }
    }public void DeleteEntry(DiaryEntry entry){
        if(!isLocked){
            DiaryEntry entryToDelete = findEntryById(entry.getDiary());
            entries.remove(entryToDelete);
            System.out.println("Your entry has been deleted.");
        } else {
            System.out.println("Diary is locked.");
        }

    }
    public void ViewEntry(String diaryId){
        DiaryEntry entry = findEntryById(diaryId);
        if(!isLocked){
            System.out.printf("Entry %s: %s ",entry.getDiary(),entry.getContent());
        }else{
            System.out.println("Your diary is locked.");
        }
    }

    }





