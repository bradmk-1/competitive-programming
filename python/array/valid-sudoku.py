class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        rows = defaultdict(set)
        cols = defaultdict(set)
        box = defaultdict(set)

        for i in range(9):
            for j in range(9):
                # row
                if board[i][j] in rows[i] and board[i][j].isnumeric():
                    return False
                else:
                    rows[i].add(board[i][j])
                # col
                if board[i][j] in cols[j] and board[i][j].isnumeric():
                    return False
                else:
                    cols[j].add(board[i][j])
                # subbox
                if board[i][j] in box[(i // 3, j // 3)] and board[i][j].isnumeric():
                    return False
                else:
                    box[(i // 3, j // 3)].add(board[i][j])
        
        return True
    

# https://leetcode.com/problems/valid-sudoku/
# O(9^2) as sudoko board is always 9x9
# Use a set for each row / column and if there is a number, add it. 
# Tricky part is getting the 3x3 part, trick here is to divide the index of your current row and col by 3 to get what grid they fall in, then 
# apply same set logic to them as normal row / column

                
                

        


        

        

        
        
        
        