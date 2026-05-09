class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<Character> al = new ArrayList<>();
        int n = board.length;
        for (int i = 0; i < n; i++) {
            al.clear();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (!al.contains(board[i][j])) {
                    al.add(board[i][j]);
                } else {
                    return false;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            al.clear();
            for (int i = 0; i < n; i++) {
                if (board[i][j] == '.')
                    continue;

                if (!al.contains(board[i][j])) {
                    al.add(board[i][j]);
                }
                else {
                    return false;
                }
            }
        }
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                al.clear();
                for (int i = boxRow * 3; i < boxRow * 3 + 3; i++) {
                    for (int j = boxCol * 3; j < boxCol * 3 + 3; j++) {
                        if (board[i][j] == '.')
                            continue;

                        if (!al.contains(board[i][j])) {
                            al.add(board[i][j]);
                        }
                        else {
                    return false;
                }
                    }
                }
            }
        }
        return true;
    }
}
