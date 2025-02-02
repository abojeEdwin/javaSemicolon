package diaryapp;

import java.util.ArrayList;

public class Diaries {

    private final ArrayList<Diary> diaries = new ArrayList<Diary>();


    public Diaries(String userName, String password) {
        ArrayList<Diaries> diaries;

    }

    public void addDiaries(String userName, String password) {
        diaries.add(new Diary(userName,password,0));
    }

    public Diary findByUserName(String userName) {
        validateDiarySearch(userName);
        for (Diary diary1 : diaries) {
            if(diary1.getUserName().equals(userName)){
                return diary1;
            }
        }
        return null;
    }

    public void deleteDiaries(String userName, String password) {
        validateDiarySearch(userName);
        validateDiarySearch(password);
        diaries.removeIf(diary -> diary.getUserName().equals(userName) || diary.getUserName().equals(password));
    }


    private static void display(String text){
        System.out.println(text);
    }

    public void validateDiarySearch(String userName) {
        if (diaries.isEmpty()) {
           throw new IllegalArgumentException("No diaries found");
        }
        if(userName.isEmpty()) {
           throw new IllegalArgumentException("No user name found");
        }
        if(userName == null) {
            throw new NullPointerException("No user name found");
        }

    }


}

