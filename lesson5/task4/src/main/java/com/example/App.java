package com.example;

/**
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.На
 * шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 *
 */
public class App {
    public static void main(String[] args) {

        boolean print = false;
        for (int m = 0; m < 8; m++) {
            int[][] chessBoard = new int[8][8];
            int numberQueens = 0;
            for (int i = 0; i < chessBoard.length; i++) {
                for (int j = 0; j < chessBoard.length; j++) {
                    if (chessBoard[i][j] == 0) {
                        int end = 0;
                        int count = 1;
                        for (int k = 0; end == 0; k++) {
                            if (i == 0 && j < m) {
                                chessBoard[i][j] = 1;
                                break;
                            }
                            if (i > 0 && i - k > 0 && count == 1) {
                                chessBoard[i - k][j] = 1;
                            } else if (i < chessBoard.length && i + k < chessBoard.length && count == 2) {
                                chessBoard[i + k][j] = 1;
                            } else if (j > 0 && j - k > 0 && count == 3) {
                                chessBoard[i][j - k] = 2;
                            } else if (j < chessBoard.length && j + k < chessBoard[i].length && count == 4) {
                                chessBoard[i][j + k] = 1;
                            } else if (i > 0 && i - k > 0 && j > 0 && j - k > 0 && count == 5) {
                                chessBoard[i - k][j - k] = 1;
                            } else if (i < chessBoard.length && i + k < chessBoard.length && j < chessBoard.length
                                    && j + k < chessBoard.length && count == 6) {
                                chessBoard[i + k][j + k] = 1;
                            } else if (j > 0 && j - k > 0 && i < chessBoard.length && i + k < chessBoard.length
                                    && count == 7) {
                                chessBoard[i + k][j - k] = 1;
                            } else if (j < chessBoard.length && j + k < chessBoard.length && i > 0 && i - k > 0
                                    && count == 8) {
                                chessBoard[i - k][j + k] = 1;
                            } else if (count < 9) {
                                count++;
                                k = 0;
                            } else {
                                chessBoard[i][j] = 5;
                                numberQueens++;
                                end = 1;
                            }
                        }
                    }
                    if (print) {
                        System.out.printf("%d ", chessBoard[i][j]);

                    }
                }
                if (print) {
                    System.out.println();
                }
            }
            if (print) {
                m = chessBoard.length;
            }
            if (numberQueens == 7 && !print) {
                m--;
                print = true;

            }

        }

    }

}

// удалось найти только 7 ферзей, дальнейшую доработку программы вижу с
// дополнительными циклами, но это уже не очень хорошо.
