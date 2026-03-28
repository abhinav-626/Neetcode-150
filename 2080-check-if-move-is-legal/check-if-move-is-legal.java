class Solution {
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    private static final char EMPTY = '.';

    public boolean checkMove(char[][] A, int r, int c, char color) {
        for (int[] dir : dirs) {
            if (isValid(A, r, c, color, dir)) return true;
        }
        return false;
    }

    private boolean isValid(char[][] A, int r, int c, char color, int[] dir) {
        int m = A.length, n = A[0].length;
        char other = color == 'B' ? 'W' : 'B';
        int i = 1;
        int curr = getValue(A, i, r, c, dir);
        while (curr == other && i <= m) {
            curr = getValue(A, ++i, r, c, dir);
        }
        if (i <= 1) return false;
        return curr == color;
    }

    private char getValue(char[][] A, int i, int r, int c, int[] dir) {
        int m = A.length, n = A[0].length;
        int row = r + dir[0] * i;
        int col = c + dir[1] * i;
        if (row < 0 || row >= m || col < 0 || col >= n) return EMPTY;
        return A[row][col];
    }

}