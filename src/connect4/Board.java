/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Jim Cendejas
 */
public class Board {

    private int[][] gameBoard = new int[6][7];
    private boolean gameNotOver = true;

    int i;
    int j;

    public Board() {
    }

    public void newBoard() {
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 7; j++) {
                this.gameBoard[i][j] = 3; // Three means no one has gone there
            }
        }
    }

    public void displayBoard(String token1, String token2) {
        System.out.println("\n\t\t 1 2 3 4 5 6 7");
        System.out.println("\t\t---------------");
        for (i = 5; i >= 0; i--) {
            System.out.print("\t\t|");
            for (j = 0; j < 7; j++) {
                boardFill(token1, token2);
            }
            System.out.println();
        }
    }

    public void boardFill(String token1, String token2) {
        if (this.gameBoard[i][j] == 3) {
            System.out.print("_" + "|");
        } else if (this.gameBoard[i][j] == 1) {
            System.out.print(token1 + "|");
        } else {
            System.out.print(token2 + "|");
        }
    }

    public void checkBoard() {
        checkRows();
        checkCol();
        checkDiag();
    }

    public boolean dropPiece(int col, int playersTurn) {
        for (int i = 0; i < 6; i++) {
            if (i == 5 && gameBoard[i][col - 1] != 3) {
                return false;
            }
            if (gameBoard[i][col - 1] == 3) {
                gameBoard[i][col - 1] = playersTurn;
                return true;
            }
        }
        return true;
    }

    public void checkRows() {
        for (int i = 0; i < 6; i++) {
            int fourInARow[] = new int[]{3, 3, 3, 3};
            for (int j = 0; j < 7; j++) {
                if (gameBoard[i][j] == 3) {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                    continue;
                }
                if (fourInARow[0] == 3) {
                    fourInARow[0] = gameBoard[i][j];
                    continue;
                }
                if (fourInARow[1] == 3 && gameBoard[i][j] == fourInARow[0]) {
                    fourInARow[1] = gameBoard[i][j];
                    continue;
                } else if (fourInARow[1] == 3 && gameBoard[i][j] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[i][j];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                    continue;
                }
                if (fourInARow[2] == 3 && gameBoard[i][j] == fourInARow[0]) {
                    fourInARow[2] = gameBoard[i][j];
                    continue;
                } else if (fourInARow[2] == 3 && gameBoard[i][j] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[i][j];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                    continue;
                }
                if (fourInARow[3] == 3 && gameBoard[i][j] == fourInARow[0]) {
                    gameNotOver = false;
                    break;
                } else if (fourInARow[3] == 3 && gameBoard[i][j] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[i][j];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                    continue;
                }
                fourInARow[0] = 3;
                fourInARow[1] = 3;
                fourInARow[2] = 3;
                fourInARow[3] = 3;

            }
        }
    }

    public void checkCol() {
        for (int i = 0; i < 7; i++) {
            int fourInARow[] = new int[]{3, 3, 3, 3};
            for (int j = 0; j < 6; j++) {
                if (gameBoard[j][i] == 3) {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[0] == 3) {
                    fourInARow[0] = gameBoard[j][i];
                } else if (fourInARow[1] == 3 && gameBoard[j][i] == fourInARow[0]) {
                    fourInARow[1] = gameBoard[j][i];
                } else if (fourInARow[2] == 3 && gameBoard[j][i] == fourInARow[1]) {
                    fourInARow[2] = gameBoard[j][i];
                } else if (fourInARow[3] == 3 && gameBoard[j][i] == fourInARow[2]) {
                    gameNotOver = false;
                    break;
                } else {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                }
            }
        }
    }

    public void checkDiag() {
        int rows = gameBoard.length;
        int cols = gameBoard[0].length;
        int maxSum = rows + cols - 2;

        for (int sum = 0; sum <= maxSum; sum++) {
            int fourInARow[] = new int[]{3, 3, 3, 3};
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i + j - sum == 0) {
                        if (gameBoard[i][j] == 3) {
                            fourInARow[0] = 3;
                            fourInARow[1] = 3;
                            fourInARow[2] = 3;
                            fourInARow[3] = 3;
                        } else if (fourInARow[0] == 3) {
                            fourInARow[0] = gameBoard[i][j];
                        } else if (fourInARow[1] == 3 && gameBoard[i][j] == fourInARow[0]) {
                            fourInARow[1] = gameBoard[i][j];
                        } else if (fourInARow[1] == 3 && gameBoard[i][j] != fourInARow[0]) {
                            fourInARow[0] = gameBoard[i][j];
                            fourInARow[1] = 3;
                            fourInARow[2] = 3;
                            fourInARow[3] = 3;
                        } else if (fourInARow[2] == 3 && gameBoard[i][j] == fourInARow[1]) {
                            fourInARow[2] = gameBoard[i][j];
                        } else if (fourInARow[2] == 3 && gameBoard[i][j] != fourInARow[0]) {
                            fourInARow[0] = gameBoard[i][j];
                            fourInARow[1] = 3;
                            fourInARow[2] = 3;
                            fourInARow[3] = 3;
                        } else if (fourInARow[3] == 3 && gameBoard[i][j] == fourInARow[2]) {
                            gameNotOver = false;
                            break;
                        } else if (fourInARow[3] == 3 && gameBoard[i][j] != fourInARow[0]) {
                            fourInARow[0] = gameBoard[i][j];
                            fourInARow[1] = 3;
                            fourInARow[2] = 3;
                            fourInARow[3] = 3;
                        } else {
                            fourInARow[0] = 3;
                            fourInARow[1] = 3;
                            fourInARow[2] = 3;
                            fourInARow[3] = 3;
                        }
                    }
                }
            }
        }

        for (int i = gameBoard.length - 1; i > 0; i--) {
            int fourInARow[] = new int[]{3, 3, 3, 3};
            for (int j = 0, x = i; x <= gameBoard.length - 1; j++, x++) {
                if (gameBoard[x][j] == 3) {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[0] == 3) {
                    fourInARow[0] = gameBoard[x][j];
                } else if (fourInARow[1] == 3 && gameBoard[x][j] == fourInARow[0]) {
                    fourInARow[1] = gameBoard[x][j];
                } else if (fourInARow[1] == 3 && gameBoard[x][j] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[x][j];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[2] == 3 && gameBoard[x][j] == fourInARow[1]) {
                    fourInARow[2] = gameBoard[x][j];
                } else if (fourInARow[2] == 3 && gameBoard[x][j] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[x][j];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[3] == 3 && gameBoard[x][j] == fourInARow[2]) {
                    gameNotOver = false;
                    break;
                } else if (fourInARow[3] == 3 && gameBoard[x][j] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[x][j];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                }
            }
        }

        for (int i = 0; i <= gameBoard.length - 1; i++) {
            int fourInARow[] = new int[]{3, 3, 3, 3};
            for (int j = 0, y = i; y <= gameBoard.length - 1; j++, y++) {
                if (gameBoard[j][y] == 3) {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[0] == 3) {
                    fourInARow[0] = gameBoard[j][y];
                } else if (fourInARow[1] == 3 && gameBoard[j][y] == fourInARow[0]) {
                    fourInARow[1] = gameBoard[j][y];
                } else if (fourInARow[1] == 3 && gameBoard[j][y] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[j][y];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[2] == 3 && gameBoard[j][y] == fourInARow[1]) {
                    fourInARow[2] = gameBoard[j][y];
                } else if (fourInARow[2] == 3 && gameBoard[j][y] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[j][y];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else if (fourInARow[3] == 3 && gameBoard[j][y] == fourInARow[2]) {
                    gameNotOver = false;
                    break;
                } else if (fourInARow[3] == 3 && gameBoard[j][y] != fourInARow[0]) {
                    fourInARow[0] = gameBoard[j][y];
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                } else {
                    fourInARow[0] = 3;
                    fourInARow[1] = 3;
                    fourInARow[2] = 3;
                    fourInARow[3] = 3;
                }
            }
        }
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(int[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public boolean isGameNotOver() {
        return gameNotOver;
    }

    public void setGameOver(boolean gameNotOver) {
        this.gameNotOver = gameNotOver;
    }
}
