import java.util.Arrays;
import java.util.Scanner;
	public class MbtiTest{
		public static void main(String[] args){
	Scanner input =new Scanner(System.in);

String [] extrovertedIntroverted = new String[5];
String [] sensingIntuitive = new String[5];
String [] thinkingFeeling = new String [5];
String [] judgingPerspective = new String [5];

	System.out.println("What is your name? :");
	String username = input.nextLine();


extrovertedIntroverted[0] = "nothing";

while(!extrovertedIntroverted[0].equalsIgnoreCase("a") && !extrovertedIntroverted[0].equalsIgnoreCase("b")){   

	System.out.println("1.\nA. expand energy,enjoy groups\nB. conserve energy, enjoy one-on-one");
	extrovertedIntroverted[0] = input.nextLine();


		if(!extrovertedIntroverted[0].equalsIgnoreCase("a")&& !extrovertedIntroverted[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

sensingIntuitive[0] = "nothing"; 

while(!sensingIntuitive[0].equalsIgnoreCase("a") && !sensingIntuitive[0].equalsIgnoreCase("b")){   

	System.out.println("2.\nA. interpret literally\nB. look for meaning and possiblities");
	sensingIntuitive[0] = input.nextLine();


		if(!sensingIntuitive[0].equalsIgnoreCase("a")&& !sensingIntuitive[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

thinkingFeeling[0] = "nothing";

while(!thinkingFeeling[0].equalsIgnoreCase("a") && !thinkingFeeling[0].equalsIgnoreCase("b")){   

	System.out.println("3.\nA. Logical,thinking, questioning\nB. emphathetic,feeling,acccomodating");
	thinkingFeeling[0] = input.nextLine();


		if(!thinkingFeeling[0].equalsIgnoreCase("a")&& !thinkingFeeling[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


judgingPerspective[0] = "nothing";

while(!judgingPerspective[0].equalsIgnoreCase("a") && !judgingPerspective[0].equalsIgnoreCase("b")){   

	System.out.println("4.\nA. organized,orderly\nB. flexible,adaptable");
	judgingPerspective[0] = input.nextLine();


		if(!judgingPerspective[0].equalsIgnoreCase("a")&& !judgingPerspective[0].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

extrovertedIntroverted[1] = "nothing";

while(!extrovertedIntroverted[1].equalsIgnoreCase("a") && !extrovertedIntroverted[1].equalsIgnoreCase("b")){   

	System.out.println("5.\nA. more outgoing,think out loud\nB. more reserved,think to yourself");
	extrovertedIntroverted[1] = input.nextLine();


		if(!extrovertedIntroverted[1].equalsIgnoreCase("a")&& !extrovertedIntroverted[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

sensingIntuitive[1] = "nothing";

while(!sensingIntuitive[1].equalsIgnoreCase("a") && !sensingIntuitive[1].equalsIgnoreCase("b")){   

	System.out.println("6.\nA. practical,realistic,experiential\nB. imaginative,innovative,theroetical");
	sensingIntuitive[1] = input.nextLine();


		if(!sensingIntuitive[1].equalsIgnoreCase("a")&& !sensingIntuitive[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

thinkingFeeling[1] = "nothing";

while(!thinkingFeeling[1].equalsIgnoreCase("a") && !thinkingFeeling[1].equalsIgnoreCase("b")){   

	System.out.println("7.\nA. candid,straight forward,frank\nB. tactful,kind,encouraging");
	thinkingFeeling[1] = input.nextLine();


		if(!thinkingFeeling[1].equalsIgnoreCase("a")&& !thinkingFeeling[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

judgingPerspective[1] = "nothing";

while(!judgingPerspective[1].equalsIgnoreCase("a") && !judgingPerspective[1].equalsIgnoreCase("b")){   

	System.out.println("8.\nA. plan,schedule \nB. unplanned,spontaneous");
	judgingPerspective[1] = input.nextLine();


		if(!judgingPerspective[1].equalsIgnoreCase("a")&& !judgingPerspective[1].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


extrovertedIntroverted[2] = "nothing";

while(!extrovertedIntroverted[2].equalsIgnoreCase("a") && !extrovertedIntroverted[2].equalsIgnoreCase("b")){   

	System.out.println("9.\nA. seek many tasks,public activities,interaction with others\nB. seek private, solitary activities with quiet to concentrate");
	extrovertedIntroverted[2] = input.nextLine();


		if(!extrovertedIntroverted[2].equalsIgnoreCase("a")&& !extrovertedIntroverted[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

sensingIntuitive[2] = "nothing";

while(!sensingIntuitive[2].equalsIgnoreCase("a") && !sensingIntuitive[2].equalsIgnoreCase("b")){   

	System.out.println("10.\nA. stardard,usual,conventional\nB. different,novel,unique");
	sensingIntuitive[2] = input.nextLine();


		if(!sensingIntuitive[2].equalsIgnoreCase("a")&& !sensingIntuitive[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

thinkingFeeling[2] = "nothing";

while(!thinkingFeeling[2].equalsIgnoreCase("a") && !thinkingFeeling[2].equalsIgnoreCase("b")){   

	System.out.println("11.\nA. firm,tend to criticize,hold the line\nB. gentle,tend to appreciate,concilate");
	thinkingFeeling[2] = input.nextLine();


		if(!thinkingFeeling[2].equalsIgnoreCase("a")&& !thinkingFeeling[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


judgingPerspective[2] = "nothing";

while(!judgingPerspective[2].equalsIgnoreCase("a") && !judgingPerspective[2].equalsIgnoreCase("b")){   

	System.out.println("12.\nA  regulated, structured. \nB. easy-going.live and let live");
	judgingPerspective[2] = input.nextLine();


		if(!judgingPerspective[2].equalsIgnoreCase("a")&& !judgingPerspective[2].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

extrovertedIntroverted[3] = "nothing";

while(!extrovertedIntroverted[3].equalsIgnoreCase("a") && !extrovertedIntroverted[3].equalsIgnoreCase("b")){   

	System.out.println("13.\nA  C");
	extrovertedIntroverted[3] = input.nextLine();


		if(!extrovertedIntroverted[3].equalsIgnoreCase("a")&& !extrovertedIntroverted[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


sensingIntuitive[3] = "nothing";

while(!sensingIntuitive[3].equalsIgnoreCase("a") && !sensingIntuitive[3].equalsIgnoreCase("b")){   

	System.out.println("14.\nA  focus on here-and-now\nB. look to the future, global perspective, big picture");
	sensingIntuitive[3] = input.nextLine();


		if(!sensingIntuitive[3].equalsIgnoreCase("a")&& !sensingIntuitive[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


thinkingFeeling[3] = "nothing";

while(!thinkingFeeling[3].equalsIgnoreCase("a") && !thinkingFeeling[3].equalsIgnoreCase("b")){   

	System.out.println("15.\nA. tough-minded, just \nB. tender-hearted,merciful");
	thinkingFeeling[3] = input.nextLine();


		if(!thinkingFeeling[3].equalsIgnoreCase("a")&& !thinkingFeeling[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


judgingPerspective[3] = "nothing";

while(!judgingPerspective[3].equalsIgnoreCase("a") && !judgingPerspective[3].equalsIgnoreCase("b")){   

	System.out.println("16.\nA. preparation, plan ahead\nB. go with the flow, adapt as you go");
	judgingPerspective[3] = input.nextLine();


		if(!judgingPerspective[3].equalsIgnoreCase("a")&& !judgingPerspective[3].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

extrovertedIntroverted[4] = "nothing";

while(!extrovertedIntroverted[4].equalsIgnoreCase("a") && !extrovertedIntroverted[4].equalsIgnoreCase("b")){   

	System.out.println("17.\nA  active,initiate \nB. reflective,deliberate");
	extrovertedIntroverted[4] = input.nextLine();


		if(!extrovertedIntroverted[4].equalsIgnoreCase("a")&& !extrovertedIntroverted[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


sensingIntuitive[4] = "nothing";

while(!sensingIntuitive[4].equalsIgnoreCase("a") && !sensingIntuitive[4].equalsIgnoreCase("b")){   

	System.out.println("18.\nA  facts, things, what is\nB. ideas, dreams, what could be, philosophical");
	sensingIntuitive[4] = input.nextLine();


		if(!sensingIntuitive[4].equalsIgnoreCase("a")&& !sensingIntuitive[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

thinkingFeeling[4] = "nothing";

while(!thinkingFeeling[4].equalsIgnoreCase("a") && !thinkingFeeling[4].equalsIgnoreCase("b")){   

	System.out.println("19.\nA. matter of fact, issue-oriented \nB. sensitive,people-oriented,commpassionate");
	thinkingFeeling[4] = input.nextLine();


		if(!thinkingFeeling[4].equalsIgnoreCase("a")&& !thinkingFeeling[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}

judgingPerspective[4] = "nothing";

while(!judgingPerspective[4].equalsIgnoreCase("a") && !judgingPerspective[4].equalsIgnoreCase("b")){   

	System.out.println("20.\nA. control, govern\nB. latitude, freedom");
	judgingPerspective[4] = input.nextLine();


		if(!judgingPerspective[4].equalsIgnoreCase("a")&& !judgingPerspective[4].equalsIgnoreCase("b")){
				System.out.println("Please Try Again, Enter A or B");
		}else System.out.println("You can move to the next question");

		}


System.out.println("Hello " +  username +  " you selected \n");


System.out.print(extrovertedIntroverted[0]+"." + " expand energy,enjoy groups "+","  + "conserve energy, enjoy one-on-one" );
System.out.print("\n" + extrovertedIntroverted[1]+"." + " more outgoing,think out loud"+"," + "more reserved,think to yourself\n");
System.out.println("\n" + extrovertedIntroverted[2]+"."+ " seek many tasks,public activities,interaction with others" +"," + "seek private, solitary activities with quiet to concentrate");

System.out.println("\n"+extrovertedIntroverted[3]+"." + "external,communicative,express yourself"+"," + "internal,reticent,keep to yourself\n");
System.out.println("\n"+extrovertedIntroverted[4]+"." + "active,initiate"+ "," +"reflective"+","+"deliberate\n");







	

































































}
}