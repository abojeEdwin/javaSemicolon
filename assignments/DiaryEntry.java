public class DiaryEntry {

    private String diaryId;
    private String content;

    public String getDiary() {
        return diaryId;
    }

    public void setDiary(String diaryId){
      this.diaryId = diaryId;
    
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void Entry(String id, String content){
        this.diaryId = id;
        this.content = content;
    }
}
