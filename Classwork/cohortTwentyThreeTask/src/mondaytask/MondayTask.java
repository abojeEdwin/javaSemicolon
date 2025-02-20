package mondaytask;

public class MondayTask {
    public static int[][] returnOX(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 'X') {
                    array[i][j] = 1;
                } else if (array[i][j] == '0') {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static String toString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                builder.append(array[i][j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}


