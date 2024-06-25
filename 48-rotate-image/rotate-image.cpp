class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        
     int n=matrix.size();
 
        for(int i=0;i<n; i++){
            for(int j=i;j<matrix[i].size(); j++){
                swap(matrix[i][j], matrix[j][i] );
            }
        }

     for(int index=0; index<n; index++){
         reverse(matrix[index].begin(), matrix[index].end());
     }
        
    }
};