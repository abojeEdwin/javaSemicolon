public class PrintMultiplicationTable{
	public static void main(String[] args){

	for( int i = 1; i <= 9; i++) {
		for( int m = 1; m <= 9; m++){
		System.out.println( i + " X" + m + "=" +( i * m)+ " " + "\n");
		}
	}

	int i = 1;
	int m = 1;
		while (i <= 9) {
			i++;
	}
		while (m <= 9) {
			m++;
	}
			System.out.print(i + " X" + i + "=" + (i * m) + " " + " \n");


	do { 
		System.out.print( i + "X" + m +"=" + (i * m) + " " + "\n");
		m++;
	} while ( m <= 9);

	do {	i++;

	} while ( i <= 9 );







}
}