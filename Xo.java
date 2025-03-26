import java.util.*;

class Xo {
    public static void main(String[] args) {
        char board[][] =new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=' ';
            }
        }
        
        boolean isbool=false;
        char player='X';
        int move =0;
        while(!isbool){
            Scanner sc =new Scanner(System.in);
            printBoard(board);
            System.out.println("player "+player+" :");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                move++;
                boolean check = checkCondition(board,player);
            if(check==true){
                System.out.println("Player Wins");
                printBoard(board);
                break;
            }
            else if(move==9){
                System.out.println("Match Drawn");
                printBoard(board);
                break;
            }
            else{
                player=(player=='X')?'O':'X';
            }
            }
            else{
                System.out.println("Please try again");
            }
        }
        
        
    }
    static void printBoard(char board[][]){
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
        
    }
    static boolean checkCondition(char board[][],char player){
        for(int row=0;row<board.length;row++){
                if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                    return true;
                }
        }

          for(int col=0;col<board.length;col++){
                if(board[0][col]==player && board[1][col] ==player && board[2][col]==player){
                    return true;
                }
            if(board[1][1]==player&&board[0][0]==player&&board[2][2]==player){
                return true;
            }
             if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
                return true;
            } 
        }
    return false;

    }
 
}
