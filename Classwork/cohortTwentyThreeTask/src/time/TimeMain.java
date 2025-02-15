package time;



public class TimeMain {
    public static void main(String[] args) {
        Time1 time = new Time1();
        //display("Output string representation of time",time);
        //System.out.println();

        //time.setTime(9,40,40);
        //display("Time after setting",time);
        //System.out.println();
    try{
        time.setTime(99,99,99);
    }
    catch(IllegalArgumentException e){
        System.out.println("Exception : " + e.getMessage());
    }
    display(" Time after calling setTime with invalid input ",time);


    }



    public static void display(String header, Time1 time) {
        System.out.printf("%s%n Universal Time : %s%n Standard time : %s%n", header, time.toUniversalString(), time.toString());
    }
}
