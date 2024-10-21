public class PrintTable{
	public static void main(String[] args){

	int A = 0;
	int B = 0;
	int count = 1;
	System.out.print("a\tb\tpower(a,b)\t");
		while(count <= 5) {
			A = A + 1;
			B = A + 1;

		System.out.print(A+"\t"+B+"\t"+(int)Math.pow(A,B)+"\n");
					count++;
	}
}
}