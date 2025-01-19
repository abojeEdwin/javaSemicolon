import java.util.Scanner;

public class DiaryUser {
    public static void main(String[] args) {

        DiaryProperties diary = new DiaryProperties();
        Scanner scanner = new Scanner(System.in);
        DiaryEntry entry = new DiaryEntry();
        
        String diaryID = " ";
        String findDiaryId = "";
        String diaryWriteUp;
        String viewEntryId = " ";
        
        int choice = 0;
        
        while(choice != 9){
          System.out.println("\nWelcome To Space Diary\n1.Create Diary\n2.Lock Diary\n3.Unlock\n4.Add Entry\n5.Find Entry By Id\n6.Delete Entry\n7.Update Entry\n8.View Entry\n9.Exit");
          choice = scanner.nextInt();
          
          if(choice == 1){
            System.out.println("Enter your first name: ");
            String firstName = scanner.nextLine();scanner.nextLine();
            System.out.println("Enter your last name: ");
            String name = scanner.nextLine();
            diary.createDiary();
            diary.Diary();
              }
          
          if(choice == 2){
              diary.LockDiary();
              }
              
          if(choice == 3){
              diary.UnlockDiary();
            }
            
          if(choice == 4){
            System.out.println("Enter your diaryId (e.g 5/01/25)");
            diaryID = scanner.nextLine(); scanner.nextLine();
            entry.setDiary(diaryID);
            System.out.println("What would you like to write today?");
            diaryWriteUp = scanner.nextLine();
            entry.setContent(diaryWriteUp);
            entry.Entry(diaryID, diaryWriteUp);
            }
          
          if(choice == 5){
            System.out.println("Enter your diaryId");
            findDiaryId = scanner.nextLine(); scanner.nextLine();
            diary.findEntryById(findDiaryId);
          }
           if(choice == 6){
                diary.DeleteEntry(entry);
                }
          if(choice == 7){
              diary.UpdateDiary(entry);
              }
          if(choice == 8){
              System.out.print("Enter your dairyId :");
              viewEntryId  = scanner.nextLine(); scanner.nextLine();

            if(viewEntryId == diaryID) {
                diary.ViewEntry(viewEntryId);
            }else {System.out.println("Incorrect Id, please try again.");}
              }
          if(choice == 9){
            System.out.println("Exiting>>>");
            }

          
      }
    }
}
