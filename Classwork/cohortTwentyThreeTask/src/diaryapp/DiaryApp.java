package diaryapp;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class DiaryApp {

    static Diaries diaries = new Diaries("userName", "Password");
    static Diary diary = new Diary("userName","Password", 0);
    static private Entry entry ;
    String Name;

    public static void main(String[] args) {
        displayDiary();

    }

    private static void displayDiary() {
        String prompt = """
                1-> Add
                2-> Find Diary
                3-> Delete
               """;

        display("Enter a number : ");
        char inputChar = input(prompt).charAt(0);
        switch (inputChar) {
            case '1': addDiaries(); break;
            case '2': findDiaries(); break;
            case '3': deleteDiaries(); break;
            default:displayDiary();
        }
    }

    private static void deleteDiaries() {
        String userName = input("Enter user name : ");
        String password = input("Enter password : ");
        try{
            diaries.deleteDiaries(userName, password);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayDiary();
        }
        finally{
            display("Diary deleted successfully");
            displayMenu();
        }
    }

    private static void findDiaries() {
        String name = input("Enter user name : ");
        try{
            diary = diaries.findByUserName(name);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayDiary();
        }
        finally {
            display("Diary found : "+ diary);
            displayMenu();
        }
    }

    private static void addDiaries() {
        String Name = input("Enter user name : ");
        String Password = input("Enter password : ");
        try{
            diaries.addDiaries(Name,Password);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayDiary();
        }
        finally{
            display("Diary created successfully"+"\n");
            displayMenu();
        }
    }

    public static void displayMenu() {
        String menu = """
                Welcome To Silencio Diary App.
                1 -> Lock
                2 -> Unlock
                3 -> Create Entry
                4 -> Delete Entry
                5 -> Find Entry
                6 -> Update Entry
                7 -> Exit               \s
               
                """;
        display("Enter a number :");
        char prompt = input(menu).charAt(0);
        switch (prompt) {
            case '1': lockDiary(); break;
            case '2': unlockDiary(); break;
            case '3': createEntry(); break;
            case '4': deleteEntry(); break;
            case '5': findEntry(); break;
            case '6': updateEntry(); break;
            case '7': exit(); break;
            default:displayMenu();
        }
    }

    private static void exit() {
        display("Exiting ...");
        displayDiary();
    }

    private static void updateEntry() {
        String tiTIle = input("Enter title : ");
        String bODy = input("Enter body : ");
        int Id = Integer.parseInt(input("Enter your id :"));
        try{
            diary.updateEntry(tiTIle, bODy, Id);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayMenu();
        }
        finally {
            display("Diary updated successfully"+ entry);
            displayMenu();
        }
    }

    private static void findEntry() {
       String id = input("Enter your id : ");
        try{
            entry = diary.findEntryId(Integer.parseInt(id));
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayMenu();
        }
        finally {
            display("Entry found : "+entry);
            displayMenu();
        }
    }

    private static void deleteEntry() {
        int iD = Integer.parseInt(input("Enter your id: "));
        try{
            diary.deleteById(iD);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayMenu();
        }
        finally {
            display("Diary deleted successfully");
            displayMenu();
        }
    }

    private static void createEntry() {
        String tiTle = input("Enter title : ");
        String bodY = input("Enter body : ");
        int Id = Integer.parseInt(input("Enter your id :"));
        try{
            diary.createEntry(tiTle, bodY, Id);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayMenu();
        }
        finally {
            display("Entry saved successfully");
            displayMenu();
        }
    }

    private static void unlockDiary() {
        String pass = input("Enter password : ");
        try{
            diary.unlock(pass);
        }
        catch(Exception e){
            display("Error : "+e.getMessage());
            displayMenu();
        }
        finally {
            display("Diary unlocked successfully");
            displayMenu();
        }
    }

    private static void lockDiary() {
        display("Diary locked successfully");
        diary.lock();
        displayMenu();
    }

    private static void display(String text) {
        System.out.println(text);
    }

    public static String input(String prompt) {
        display(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine().trim();
    }

}