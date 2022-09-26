import java.util.Scanner;
public class TicTacToe {
    public static Scanner in = new Scanner(System.in);
    public static void displayGame(char[] arr){
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
            if((i+1)%3!=0) System.out.print("| ");
            else if((i+1)%3==0) System.out.println("");
        }
    }
    public static void winCondition(char[] arr)
    {
        //Player 1 = X
        //horizontal
        if(arr[0]=='X' && arr[1]=='X' && arr[2]=='X');
        else if(arr[3]=='X' && arr[4]=='X' && arr[5]=='X');
        else if(arr[6]=='X' && arr[7]=='X' && arr[8]=='X');

            //vertical
        else if(arr[0]=='X' && arr[3]=='X' && arr[6]=='X');
        else if(arr[1]=='X' && arr[4]=='X' && arr[7]=='X');
        else if(arr[2]=='X' && arr[5]=='X' && arr[8]=='X');

            //diagonal
        else if(arr[0]=='X' && arr[4]=='X' && arr[8]=='X');
        else if(arr[2]=='X' && arr[4]=='X' && arr[6]=='X');

            //Player 2 = O
            //horizontal
        else if(arr[0]=='O' && arr[1]=='O' && arr[2]=='O');
        else if(arr[3]=='O' && arr[4]=='O' && arr[5]=='O');
        else if(arr[6]=='O' && arr[7]=='O' && arr[8]=='O');

            //vertical
        else if(arr[0]=='O' && arr[3]=='O' && arr[6]=='O');
        else if(arr[1]=='O' && arr[4]=='O' && arr[7]=='O');
        else if(arr[2]=='O' && arr[5]=='O' && arr[8]=='O');

            //diagonal
        else if(arr[0]=='O' && arr[4]=='O' && arr[8]=='O');
        else if(arr[2]=='O' && arr[4]=='O' && arr[6]=='O');
    }

    public static int Player1Spot() {
        System.out.println("It's Player 1's turn (X). Which spot do you want? (0, 1, 2, 3, 4, 5, 6, 7, 8)");
        return in.nextInt();
    }

    public static char Player1Char() {
        return 'X';
    }

    public static int Player2Spot() {
        System.out.println("It's Player 1's turn (O). Which spot do you want? (0, 1, 2, 3, 4, 5, 6, 7, 8)");
        return in.nextInt();
    }

    public static char Player2Char() {
        return 'O';
    }
    public static void IsSpotTaken(char[] arr, int playerSpot, char playerChar) {
        if(arr[playerSpot]!='X' || arr[playerSpot]!='O') arr[playerSpot] = playerChar;
        else {
            System.out.println("This spot is taken. Try again please.");
            IsSpotTaken(arr, playerSpot, playerChar);
        }
    }

    public static void startGame(char[] arr) {
        for(int i = 0; i<arr.length; i++) {

            //player 1
            displayGame(arr);
            Player1Spot();
            IsSpotTaken(arr, Player1Spot(), Player1Char());
            winCondition(arr);

            //player 2
            displayGame(arr);
            Player2Spot();
            IsSpotTaken(arr, Player2Spot(), Player2Char());
            winCondition(arr);
        }
        System.out.println("Draw game");
    }
    public static void main(String[] args) {
        System.out.println("This is tic tac toe");
        char arr[] = {'_', '_', '_', '_', '_', '_', '_', '_', '_',};
        int counter = 0;
        Scanner in = new Scanner(System.in);
        int spot = 0;
    }
}

