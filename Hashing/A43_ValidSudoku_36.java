package DSA.Hashing;

import java.util.HashSet;
import java.util.Set;

/*
Question:
Determine if a 9 x 9 Sudoku board is valid.
A valid Sudoku board must satisfy:
Each row contains digits 1-9 without repetition.
Each column contains digits 1-9 without repetition.
Each 3x3 sub-box contains digits 1-9 without repetition.
Example 1:
Input:
Valid Sudoku Board
Output:
true
Example 2:
Input:
Invalid Sudoku Board
Output:
false
 */
public class A43_ValidSudoku_36 {
    public static boolean ByStringValidSudoku(char[][] nums){
        Set<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=nums[i][j];
                if(ch!='.'){
                    if(!set.add(ch + " at row "+ i)|| !set.add(ch+" at column "+j)||!set.add(ch+" at box "+i/3+"-" + j/3)){
                        return false;
                    }
                }

            }
        }
        return true;
    }
    public static boolean validSudoku(char[][] board){
        HashSet<Character>[]rows= new HashSet[9];
        HashSet<Character>[]Col= new HashSet[9];
        HashSet<Character>[]box= new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            Col[i]=new HashSet<>();
            box[i]=new HashSet<>();

        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch= board[i][j];
                int boxes=3*(i/3)+(j/3);
                if(ch=='.'){
                   continue;
                }
                if(rows[i].contains(ch)|| Col[j].contains(ch)||box[boxes].contains(ch)){
                    return false;
                }
                rows[i].add(ch);
                Col[j].add(ch);
                box[boxes].add(ch);
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSudoku(board));
        System.out.println(ByStringValidSudoku(board));

        char[][] board1 = {
                {'5','3','.','.','7','.','.','5','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSudoku(board1));
        System.out.println(ByStringValidSudoku(board1));
    }

}
