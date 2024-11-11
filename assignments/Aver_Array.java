public class Aver_Array{
	public static void main(String[] args){


int [] first_array = {5,10,15,20};
int sum = 0;
int average=0;
	for(int i = 0; i < first_array.length;i++){
		sum += first_array[i];
		average = sum/first_array.length;
		}
		System.out.print(average);

}
}