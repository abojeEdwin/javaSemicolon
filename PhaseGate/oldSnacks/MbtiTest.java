import java.util.Arrays;
import java.util.Scanner;
	public class MbtiTest{
		public static void main(String[] args){
	Scanner input =new Scanner(System.in);

String [] extrovertedIntroverted = new String[5];
String [] finalextrovertedIntroverted= new String[5];
String [] sensingIntuitive = new String[5];
String [] finalsensingIntuitive = new String[5];
String [] thinkingFeeling = new String [5];
String [] finalthinkingFeeling = new String[5];
String [] judgingPerspective = new String [5];
String [] finaljudgingPerspective = new String[5];

	System.out.println("What is your name? :");
	String username = input.nextLine();


extrovertedIntroverted[0] = "nothing";

while(!extrovertedIntroverted[0].equalsIgnoreCase("a") && !extrovertedIntroverted[0].equalsIgnoreCase("b")){   

	System.out.println("1.\nA. expand energy,enjoy groups\nB. conserve energy, enjoy one-on-one");
	extrovertedIntroverted[0] = input.nextLine();


		if(!extrovertedIntroverted[0].equalsIgnoreCase("a")&& !extrovertedIntroverted[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
			if (extrovertedIntroverted[0].equalsIgnoreCase("A"))
				finalextrovertedIntroverted[0] = "A. expand energy,enjoy groups";

			if (extrovertedIntroverted[0].equalsIgnoreCase("B"))	 
				finalextrovertedIntroverted[0] = "B. conserve energy, enjoy one-on-one";	

		}


sensingIntuitive[0] = "nothing"; 

while(!sensingIntuitive[0].equalsIgnoreCase("a") && !sensingIntuitive[0].equalsIgnoreCase("b")){   

	System.out.println("2.\nA. interpret literally\nB. look for meaning and possiblities");
	sensingIntuitive[0] = input.nextLine();


		if(!sensingIntuitive[0].equalsIgnoreCase("a")&& !sensingIntuitive[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(sensingIntuitive[0].equalsIgnoreCase("A"))finalsensingIntuitive[0] = "A. interpret literally";
			
			if(sensingIntuitive[0].equalsIgnoreCase("B"))finalsensingIntuitive[0] = "B. look for meaning and possiblities";
		}


thinkingFeeling[0] = "nothing";

while(!thinkingFeeling[0].equalsIgnoreCase("a") && !thinkingFeeling[0].equalsIgnoreCase("b")){   

	System.out.println("3.\nA. Logical,thinking, questioning\nB. emphathetic,feeling,acccomodating");
	thinkingFeeling[0] = input.nextLine();


		if(!thinkingFeeling[0].equalsIgnoreCase("a")&& !thinkingFeeling[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
			
			if(thinkingFeeling[0].equalsIgnoreCase("A"))finalthinkingFeeling[0] = "A. Logical,thinking, questioning";

			if(thinkingFeeling[0].equalsIgnoreCase("B"))finalthinkingFeeling[0] = "B. emphathetic,feeling,acccomodating";
		}

			

judgingPerspective[0] = "nothing";

while(!judgingPerspective[0].equalsIgnoreCase("a") && !judgingPerspective[0].equalsIgnoreCase("b")){   

	System.out.println("4.\nA. organized,orderly\nB. flexible,adaptable");
	judgingPerspective[0] = input.nextLine();


		if(!judgingPerspective[0].equalsIgnoreCase("a")&& !judgingPerspective[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
						
			if(judgingPerspective[0].equalsIgnoreCase("A"))finaljudgingPerspective[0] = "A. organized,orderly";
			
			if(judgingPerspective[0].equalsIgnoreCase("B"))finaljudgingPerspective[0] = "B. flexible,adaptable";
		}



extrovertedIntroverted[1] = "nothing";

while(!extrovertedIntroverted[1].equalsIgnoreCase("a") && !extrovertedIntroverted[1].equalsIgnoreCase("b")){   

	System.out.println("5.\nA. more outgoing,think out loud\nB. more reserved,think to yourself");
	extrovertedIntroverted[1] = input.nextLine();


		if(!extrovertedIntroverted[1].equalsIgnoreCase("a")&& !extrovertedIntroverted[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
				
			if(extrovertedIntroverted[1].equalsIgnoreCase("A"))finalextrovertedIntroverted[1] = "A. more outgoing,think out loud";

			if(extrovertedIntroverted[1].equalsIgnoreCase("B"))finalextrovertedIntroverted[1] = "B. more reserved,think to yourself";
		}




sensingIntuitive[1] = "nothing";

while(!sensingIntuitive[1].equalsIgnoreCase("a") && !sensingIntuitive[1].equalsIgnoreCase("b")){   

	System.out.println("6.\nA. practical,realistic,experiential\nB. imaginative,innovative,theroetical");
	sensingIntuitive[1] = input.nextLine();


		if(!sensingIntuitive[1].equalsIgnoreCase("a")&& !sensingIntuitive[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
			
			if(sensingIntuitive[1].equalsIgnoreCase("A"))finalsensingIntuitive[1] = "A. practical,realistic,experiential";

			if(sensingIntuitive[1].equalsIgnoreCase("B"))finalsensingIntuitive[1] = "B. imaginative,innovative,theroetical";
		}




thinkingFeeling[1] = "nothing";

while(!thinkingFeeling[1].equalsIgnoreCase("a") && !thinkingFeeling[1].equalsIgnoreCase("b")){   

	System.out.println("7.\nA. candid,straight forward,frank\nB. tactful,kind,encouraging");
	thinkingFeeling[1] = input.nextLine();


		if(!thinkingFeeling[1].equalsIgnoreCase("a")&& !thinkingFeeling[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
		
			if(thinkingFeeling[1].equalsIgnoreCase("A"))finalthinkingFeeling[1] = "A. candid,straight forward,frank";

			if(thinkingFeeling[1].equalsIgnoreCase("B"))finalthinkingFeeling[1] = "B. tactful,kind,encouraging";

		}



judgingPerspective[1] = "nothing";

while(!judgingPerspective[1].equalsIgnoreCase("a") && !judgingPerspective[1].equalsIgnoreCase("b")){   

	System.out.println("8.\nA. plan,schedule \nB. unplanned,spontaneous");
	judgingPerspective[1] = input.nextLine();


		if(!judgingPerspective[1].equalsIgnoreCase("a")&& !judgingPerspective[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
			
			if(judgingPerspective[1].equalsIgnoreCase("A"))finaljudgingPerspective[1] = "A. plan,schedule";

			if(judgingPerspective[1].equalsIgnoreCase("B"))finaljudgingPerspective[1] = "B. unplanned,spontaneous";			

		}





extrovertedIntroverted[2] = "nothing";

while(!extrovertedIntroverted[2].equalsIgnoreCase("a") && !extrovertedIntroverted[2].equalsIgnoreCase("b")){   

	System.out.println("9.\nA. seek many tasks,public activities,interaction with others\nB. seek private, solitary activities with quiet to concentrate");
	extrovertedIntroverted[2] = input.nextLine();


		if(!extrovertedIntroverted[2].equalsIgnoreCase("a")&& !extrovertedIntroverted[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
		
			if(extrovertedIntroverted[2].equalsIgnoreCase("A"))finalextrovertedIntroverted[2] = "A.seek many tasks,public activities,interaction with others";

			if(extrovertedIntroverted[2].equalsIgnoreCase("B"))finalextrovertedIntroverted[2] = "B. seek private, solitary activities with quiet to concentrate";
		}




sensingIntuitive[2] = "nothing";

while(!sensingIntuitive[2].equalsIgnoreCase("a") && !sensingIntuitive[2].equalsIgnoreCase("b")){   

	System.out.println("10.\nA. stardard,usual,conventional\nB. different,novel,unique");
	sensingIntuitive[2] = input.nextLine();


		if(!sensingIntuitive[2].equalsIgnoreCase("a")&& !sensingIntuitive[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(sensingIntuitive[2].equalsIgnoreCase("A"))finalsensingIntuitive[2] = "A. stardard,usual,conventional";

			if(sensingIntuitive[2].equalsIgnoreCase("B"))finalsensingIntuitive[2] = "B. different,novel,unique";
		}



thinkingFeeling[2] = "nothing";

while(!thinkingFeeling[2].equalsIgnoreCase("a") && !thinkingFeeling[2].equalsIgnoreCase("b")){   

	System.out.println("11.\nA. firm,tend to criticize,hold the line\nB. gentle,tend to appreciate,concilate");
	thinkingFeeling[2] = input.nextLine();


		if(!thinkingFeeling[2].equalsIgnoreCase("a")&& !thinkingFeeling[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

				if(thinkingFeeling[2].equalsIgnoreCase("A"))finalthinkingFeeling[2] = "A. firm,tend to criticize,hold the line";

				if(thinkingFeeling[2].equalsIgnoreCase("B"))finalthinkingFeeling[2] = "B. gentle,tend to appreciate,concilate";
		}



judgingPerspective[2] = "nothing";

while(!judgingPerspective[2].equalsIgnoreCase("a") && !judgingPerspective[2].equalsIgnoreCase("b")){   

	System.out.println("12.\nA  regulated, structured. \nB. easy-going.live and let live");
	judgingPerspective[2] = input.nextLine();


		if(!judgingPerspective[2].equalsIgnoreCase("a")&& !judgingPerspective[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

				if(judgingPerspective[2].equalsIgnoreCase("A"))finaljudgingPerspective[2] = "A.  regulated, structured";

				if(judgingPerspective[2].equalsIgnoreCase("B"))finaljudgingPerspective[2] = "B. easy-going.live and let live";

		}




extrovertedIntroverted[3] = "nothing";

while(!extrovertedIntroverted[3].equalsIgnoreCase("a") && !extrovertedIntroverted[3].equalsIgnoreCase("b")){   

	System.out.println("13.\nA. external,communicative,express yourself\nB. internal,reticent,keep to yourself");
	extrovertedIntroverted[3] = input.nextLine();

		if(!extrovertedIntroverted[3].equalsIgnoreCase("a")&& !extrovertedIntroverted[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
			
				if(extrovertedIntroverted[3].equalsIgnoreCase("A"))finalextrovertedIntroverted[3] = "A. external,communicative,express yourself";

				if(extrovertedIntroverted[3].equalsIgnoreCase("B"))finalextrovertedIntroverted[3] = "B. internal,reticent,keep to yourself";
		}




sensingIntuitive[3] = "nothing";

while(!sensingIntuitive[3].equalsIgnoreCase("a") && !sensingIntuitive[3].equalsIgnoreCase("b")){   

	System.out.println("14.\nA  focus on here-and-now\nB. look to the future, global perspective, big picture");
	sensingIntuitive[3] = input.nextLine();


		if(!sensingIntuitive[3].equalsIgnoreCase("a")&& !sensingIntuitive[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(sensingIntuitive[3].equalsIgnoreCase("A"))finalsensingIntuitive[3] = "A  focus on here-and-now";

			if(sensingIntuitive[3].equalsIgnoreCase("B"))finalsensingIntuitive[3] = "B. look to the future, global perspective, big picture";
		}




thinkingFeeling[3] = "nothing";

while(!thinkingFeeling[3].equalsIgnoreCase("a") && !thinkingFeeling[3].equalsIgnoreCase("b")){   

	System.out.println("15.\nA. tough-minded, just \nB. tender-hearted,merciful");
	thinkingFeeling[3] = input.nextLine();


		if(!thinkingFeeling[3].equalsIgnoreCase("a")&& !thinkingFeeling[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(thinkingFeeling[3].equalsIgnoreCase("A"))finalthinkingFeeling[3] = "A. tough-minded, just ";

			if(thinkingFeeling[3].equalsIgnoreCase("B"))finalthinkingFeeling[3] = "B. tender-hearted,merciful";

		}



judgingPerspective[3] = "nothing";

while(!judgingPerspective[3].equalsIgnoreCase("a") && !judgingPerspective[3].equalsIgnoreCase("b")){   

	System.out.println("16.\nA. preparation, plan ahead\nB. go with the flow, adapt as you go");
	judgingPerspective[3] = input.nextLine();


		if(!judgingPerspective[3].equalsIgnoreCase("a")&& !judgingPerspective[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(judgingPerspective[3].equalsIgnoreCase("A"))finaljudgingPerspective[3] = "A. preparation, plan ahead";

			if(judgingPerspective[3].equalsIgnoreCase("B"))finaljudgingPerspective[3] = "B. go with the flow, adapt as you go";

		}



extrovertedIntroverted[4] = "nothing";

while(!extrovertedIntroverted[4].equalsIgnoreCase("a") && !extrovertedIntroverted[4].equalsIgnoreCase("b")){   

	System.out.println("17.\nA  active,initiate \nB. reflective,deliberate");
	extrovertedIntroverted[4] = input.nextLine();


		if(!extrovertedIntroverted[4].equalsIgnoreCase("a")&& !extrovertedIntroverted[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");
			
			if(extrovertedIntroverted[4].equalsIgnoreCase("A"))finalextrovertedIntroverted[4] = "A.  active,initiate";
	
			if(extrovertedIntroverted[4].equalsIgnoreCase("B"))finalextrovertedIntroverted[4] = "B. reflective,deliberate";

		}




sensingIntuitive[4] = "nothing";

while(!sensingIntuitive[4].equalsIgnoreCase("a") && !sensingIntuitive[4].equalsIgnoreCase("b")){   

	System.out.println("18.\nA  facts, things, what is\nB. ideas, dreams, what could be, philosophical");
	sensingIntuitive[4] = input.nextLine();


		if(!sensingIntuitive[4].equalsIgnoreCase("a")&& !sensingIntuitive[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(sensingIntuitive[4].equalsIgnoreCase("A"))finalsensingIntuitive[4] = "A.  facts, things, what is";

			if(sensingIntuitive[4].equalsIgnoreCase("B"))finalsensingIntuitive[4] = "B. ideas, dreams, what could be, philosophical";
		}





thinkingFeeling[4] = "nothing";

while(!thinkingFeeling[4].equalsIgnoreCase("a") && !thinkingFeeling[4].equalsIgnoreCase("b")){   

	System.out.println("19.\nA. matter of fact, issue-oriented \nB. sensitive,people-oriented,commpassionate");
	thinkingFeeling[4] = input.nextLine();


		if(!thinkingFeeling[4].equalsIgnoreCase("a")&& !thinkingFeeling[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(thinkingFeeling[4].equalsIgnoreCase("A"))finalthinkingFeeling[4] = "A. matter of fact, issue-oriented";

			if(thinkingFeeling[4].equalsIgnoreCase("B"))finalthinkingFeeling[4] = "B. sensitive,people-oriented,commpassionate";

		}




judgingPerspective[4] = "nothing";

while(!judgingPerspective[4].equalsIgnoreCase("a") && !judgingPerspective[4].equalsIgnoreCase("b")){   

	System.out.println("20.\nA. control, govern\nB. latitude, freedom");
	judgingPerspective[4] = input.nextLine();


		if(!judgingPerspective[4].equalsIgnoreCase("a")&& !judgingPerspective[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

			if(judgingPerspective[4].equalsIgnoreCase("A"))finaljudgingPerspective[4] = "A. control, govern";

			if(judgingPerspective[4].equalsIgnoreCase("B"))finaljudgingPerspective[4] = "B. latitude, freedom";
		}








System.out.println("Hello " +  username +  " you selected: \n");


for(int checktru = 0; checktru < extrovertedIntroverted.length; checktru++){
		
	System.out.println(finalextrovertedIntroverted[checktru]);
		}


	int count_A = 0;
	int count_B = 0;

	for(int checktru = 0; checktru <  extrovertedIntroverted.length; checktru++){
			if(extrovertedIntroverted[checktru].equalsIgnoreCase("A")){
					count_A += 1;
			}else count_B +=1;				
				}
	
	
System.out.println("Numbers of A selected:"+ count_A +"\n"+"Numbers of B selected :"+ count_B+"\n");
	
	String resultextrovertedIntroverted;
	if(count_A > count_B){
		resultextrovertedIntroverted = "E";
		}else resultextrovertedIntroverted = "I";
	



for(int checktru = 0; checktru < sensingIntuitive.length; checktru++){
		
	System.out.println(finalsensingIntuitive[checktru]);
		}

	int counter_A = 0;
	int counter_B = 0;
	for(int checktru = 0; checktru <  sensingIntuitive.length; checktru++){
			if(sensingIntuitive[checktru].equalsIgnoreCase("A")){
					counter_A += 1;
			}else counter_B +=1;				
				}
System.out.println("Numbers of A selected:"+ counter_A +"\n"+"Numbers of B selected :"+ counter_B+"\n");

		String resultsensingIntuitive;
	if(counter_A > counter_B){
		resultsensingIntuitive = "S";
		}else resultsensingIntuitive = "N";




for(int checktru = 0; checktru < thinkingFeeling.length; checktru++){
		
	System.out.println(finalthinkingFeeling[checktru]);
		}

	int counterA_ = 0;
	int counterB_ = 0;
	for(int checktru = 0; checktru <  thinkingFeeling.length; checktru++){
			if(thinkingFeeling[checktru].equalsIgnoreCase("A")){
					counterA_ += 1;
			}else counterB_ +=1;				
				}
System.out.println("Numbers of A selected:"+ counterA_ +"\n"+"Numbers of B selected :"+ counterB_+"\n");


		String resultthinkingFeeling;
	if(counterA_ > counterB_){
		resultthinkingFeeling = "T";
		}else resultthinkingFeeling = "F";




for(int checktru = 0; checktru < judgingPerspective.length; checktru++){
		
	System.out.println(finaljudgingPerspective[checktru]);
		}

	int counter_A_ = 0;
	int counter_B_ = 0;
	for(int checktru = 0; checktru <  judgingPerspective.length; checktru++){
			if(judgingPerspective[checktru].equalsIgnoreCase("A")){
					counter_A_ += 1;
			}else counter_B_ +=1;				
				}
System.out.println("Numbers of A selected:"+ counter_A_ +"\n"+"Numbers of B selected :"+ counter_B_+"\n");


		String resultjudgingPerspective;
	if(counterA_ > counter_B_){
		resultjudgingPerspective = "J";
		}else resultjudgingPerspective = "P";


String finalResult = resultextrovertedIntroverted+resultsensingIntuitive+resultthinkingFeeling+resultjudgingPerspective;
			

MbtiFunction function = new MbtiFunction();
	String result = function.finalResult(finalResult);
	System.out.print("\n"+result);


			









	
	












	

































































}
}