package diaryapp;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {
    Diary diary = new Diary("Edwin","12345",1);
    @BeforeEach
        public void startWith(){
        Diary diary = new Diary("Edwin","12345",1);
        Diaries diaries = new Diaries("Edwin","12345");
        }


        @Test
        public void testThatDiaryCanBeUnlocked(){
           Diaries diaries = new Diaries("Edwin","12345");
            diary.unlock("12345");
        assertFalse(diary.isLocked());


        }

        @Test
        public void testThatDiaryIsLocked(){
        diary.lock();
        assertTrue(diary.isLocked());
    }
        @Test
        public void testThatDiaryHandelsUnlockedException(){
        assertThrows(NullPointerException.class, ()->diary.unlock(null));
        }

        @Test
        public void testThatDiaryCanCreateEntry(){
            diary.createEntry("title","body",1);
            assertEquals(1,diary.getSize());
            diary.createEntry("title","Title",1);
            assertEquals(2,diary.getSize());
        }

        @Test
        public void testThatDiaryCanDeleteEntry(){
            diary.createEntry("title","body",1);
            diary.deleteById(1);
        }

        @Test
        public void testThatDiaryHandelsExceptionWhenUserTrysToDeleteEntryWithInvalidId(){
            diary.createEntry("Title","Body",1);
            assertThrows(IllegalArgumentException.class, ()->diary.deleteById(10));
        }

        @Test
        public void testThatDiaryHandelsExceptionWhenUserTrysToCreateDiaryWithInvalidCredentials(){
            assertThrows(IllegalArgumentException.class, ()->diary.createEntry("Title",null,1));
            assertThrows(IllegalArgumentException.class,()-> diary.createEntry(null,"We all will have to eat of that table one way or another",22));
        }

        @Test
        public void testThatDiaryCanUpdateEntry(){
            diary.createEntry("title","body",1);
            diary.updateEntry("title","body",1);
        }

        @Test
        public void testThatDiaryCannotBeCreatedIfLocked(){
            diary.lock();
            assertThrows(IllegalArgumentException.class, ()->diary.createEntry("title","body",1));
        }


    }
