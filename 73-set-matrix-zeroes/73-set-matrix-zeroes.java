class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean zeroRow = false;  //0th row pointer
        boolean zeroCol = false; //0th col pointer
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0 ; i < n ; i++){  //if there is a zero in oth col then zeroCol will be true means that we have make zero for 0th col elements.
            if(matrix[i][0] == 0){
                zeroCol = true;
                break;
            }
        }
        
       // Same thing here that if there a zero present in the 0th row then all the elements here will have to be zero so make zeroRow true.
        
        for(int j = 0 ; j < m ; j++){ 
            if(matrix[0][j] == 0){
                zeroRow = true;
                break;
            }
        }
        
        
        for(int i = 1 ; i < n ; i++){
            for(int j = 1 ; j < m ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1 ; i < n ; i++){
            if(matrix[i][0] == 0){
                for(int j = 0 ; j < m ; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 1; j < m ; j++){
            if(matrix[0][j] == 0){
                for(int i = 0 ; i < n ; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(zeroRow){
            for(int j = 0 ; j < m ; j++){
                matrix[0][j] = 0;
            }
        }
        
        if(zeroCol){
            for(int i = 0 ;i < n ; i++){
                matrix[i][0] = 0;
            }
        }
    }
}