package tic_tac_toe;
import java.util.Scanner;

public class TicTacToe {

    static Scanner input = new Scanner(System.in);
    static String[][] Board = {
                                {"EMPTY","EMPTY","EMPTY"},
                                {"EMPTY","EMPTY","EMPTY"},
                                {"EMPTY","EMPTY","EMPTY"},
                                };
    static String firstPlayer = "X";
    static String winner = " ";
    static Boolean isGameRunning = true;

    public static void main(String[] args) {

        while(isGameRunning){
            printBoard(Board);
            playerInput(Board);
            checkWinner();
            checkTie(Board);
            switchPlayer();
        }
    }

    private static void printBoard(String[][] Board) {
        for(int i = 0 ; i < Board.length ; i++){
            System.out.printf("%s  |  %s  |  %s  \n",Board[i][0],Board[i][1],Board[i][2]);
                if(i < 2){
                    System.out.println("-------------------------");
                }
                System.out.println();
        }
    }

    private static void playerInput(String[][] Board) {
        System.out.print("Enter row number and colum number \n e.g 12 13\n : ");
        int playerInput = input.nextInt();

        if(playerInput >= 11 && playerInput <= 13 && Board[(playerInput/10)-1][(playerInput % 10)-1] == "EMPTY"){
            Board[(playerInput/10)-1][(playerInput % 10) -1 ] = firstPlayer;

        }else if(playerInput >= 21 && playerInput <= 23 && Board[(playerInput/10)-1][(playerInput % 10)-1] == "EMPTY"){
            Board[(playerInput/10)-1][(playerInput % 10) -1 ] = firstPlayer;

         }else if(playerInput >= 31 && playerInput <= 33 && Board[(playerInput/10)-1][(playerInput % 10)-1] == "EMPTY"){
            Board[(playerInput/10)-1][(playerInput % 10) -1 ] = firstPlayer;
            System.out.println("Space Occupied");
        }

    }

    private static boolean checkHorizontal(String[][]Board){
        if(Board[0][0] == Board[0][1] && Board[0][0] == Board[0][2] & Board[0][0] != "EMPTY"){
            winner = Board[0][0];
            return true;
        } else if(Board[1][0] == Board[1][1] && Board[1][0] == Board[1][2] & Board[1][0] != "EMPTY"){
            winner = Board[1][0];
            return true;
        } else if(Board[2][0] == Board[2][1] && Board[2][0] == Board[2][2] & Board[2][0] != "EMPTY"){
            winner = Board[2][0];
            return true;
        }
        return false;

    }

    private static boolean checkVertical(String[][] Board){
        if(Board[0][0] == Board[1][0] && Board[0][0] == Board[2][0] & Board[0][0] != "EMPTY"){
            winner = Board[0][0];
            return true;
        }else if(Board[1][0] == Board[1][1] && Board[1][0] == Board[2][1] & Board[0][0] != "EMPTY"){
            winner = Board[1][0];
        }
        else if(Board[0][2] == Board[1][2] && Board[0][2] == Board[2][2] & Board[0][2] != "EMPTY"){
            winner = Board[0][2];
            return true;
        }
        return false;
    }

    private static boolean checkDiagonal(String[][] Board){
        if(Board[0][0] == Board[1][1] && Board[0][0] == Board[2][2] & Board[0][0] != "EMPTY"){
            winner = Board[0][0];
            return true;
        } else if(Board[0][2] == Board[1][1] && Board[0][2] == Board[2][0] & Board[0][2] != "EMPTY"){
            winner = Board[0][2];
            return true;
        }
        return false;
    }

    private static void checkTie(String[][] Board){
        for(int i = 0; i < Board.length; i++){
            for(int j = 0; j < Board.length; j++){
                if(Board[i][j] == "EMPTY"){
                    return;
                }
            }
        }
        System.out.println("It is a tie");
        isGameRunning = false;
    }

    private static void switchPlayer(){
        if(firstPlayer == "X"){
            firstPlayer = "O";
        }
        else{
            firstPlayer = "X";
        }
    }

    private static void checkWinner(){
        if(checkVertical(Board) || checkDiagonal(Board) || checkHorizontal(Board)){
            System.out.printf("The winner is %s%n", winner);
        }

    }

}
