public class ArrayPractice {
    public static void main(String[] args) {

        int [][] array = {
                {2,3,5}, {7,8,4}
        };
        int[][] result = new int[array.length][array[0].length];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(array[i][j] > 5) {
                    result[i][j] = array[i][j];
                }
            }
        }




    }
}
