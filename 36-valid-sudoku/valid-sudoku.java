class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int r = 0; r<N; r++){
            rows[r] = new HashSet <Character>();
            cols[r] = new HashSet <Character>();
            boxes[r] = new HashSet <Character>();
        }
        for(int r = 0; r<N; r++){
            for(int c = 0; c<N; c++){
                char val = board[r][c];
                if(val == '.'){
                    continue;
                }
                int boxindex = (r/3)*3+(c/3);
                if(rows[r].contains(val) || cols[c].contains(val) || boxes[boxindex].contains(val)){
                    return false;
                }
                rows[r].add(val);
                cols[c].add(val);
                boxes[boxindex].add(val);

            }
        }
        return true;
    }
}