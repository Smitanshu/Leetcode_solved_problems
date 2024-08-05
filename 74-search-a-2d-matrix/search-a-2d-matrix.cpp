class Solution {
public:
    bool searchMatrix(vector<vector<int>>& arr, int target) {


    //   int row=matrix.size();
    //   int col=matrix[0].size();
    //   int n=row * col;                         //row*col......(M X N )


          
      

    //       int s=0;
    //       int e=n-1;
    //       int mid=(s+(e-s))/2;

    //     while(s<=e){


    //         int rowIndex=mid/col;
    //         int colIndex=mid% col;

    //         int curr_number=matrix[rowIndex][colIndex];
    //         if(curr_number==target) return true;

    //         if(matrix[rowIndex][colIndex]==target) return true;

    //         else if(matrix[rowIndex][colIndex]< target)  {    
    //              s=mid+1;}


    //         else if(matrix[rowIndex][colIndex]  > target )  {  e=mid-1;  }
         

    //         mid=s+(e-s)/2;


    //     }

    //     return false;

int n=arr.size();
        for(int i=0; i<n;i++){
            for(int j=0;j<arr[i].size();j++){

                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;




    }
};