import java.util.Scanner;
	public class Nestedshapes{
		public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.println("Calculate the area of a Circle :");
System.out.println("Calculate the area of a Rectangle :");
System.out.println("Calculate the area of a Triangle :");
int areaofshapes = input.nextInt();

	switch(areaofshapes){

		case 1:
			System.out.println("Calculate with radius :" );
			System.out.println("Calculate without radius :");
			int circleselection = input.nextInt();
			
			switch(circleselection){
					case 1:
						System.out.print("Enter the radius of a circle :");
						int radiuscircle = input.nextInt();			
						double areaofacircle = 2 * 3.142 * (Math.sqrt(radiuscircle));
						System.out.println(areaofacircle);
						break;

					case 2:
						double areaofacircle_1 = 2 * 3.142 * 20;
						System.out.print(areaofacircle_1);
						break;
					}
						break;
						
		case 2:
			System.out.println("Calculate with length and width: ");
			System.out.println("Calculate without length and width :");
			int rectangleselection = input.nextInt();
			
			switch(rectangleselection){
					case 1:
						System.out.print("Enter length of the rectangle :");
						int lengthrec = input.nextInt();
						System.out.print("Enter width of the rectangle :");
						int widthrec = input.nextInt();
						
							int areaofarectangle = lengthrec * widthrec;
							System.out.print("The area of the rectangle is" + widthrec);
							break;
					case 2:
						int areaofarectangle_1 = 20 * 40;
						System.out.print(areaofarectangle_1);
						break;
					}

		case 3:
			System.out.print("Enter the height of the triangle :");
			int heighttri = input.nextInt();

			System.out.print("Enter the width of the triangle");
			int widthtri = input.nextInt();
			
			int areaofatri = 1/2 * heighttri * widthtri;
			System.out.print(areaofatri);
			break;
			}						
			

}
}