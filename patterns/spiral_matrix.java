package patterns;
import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        if(matrix.length==0) return res;
        int left=0,top=0;
        int bottom=matrix.length-1,right=matrix[0].length-1;

        while(left<=right && top<=bottom){
            //left -> right
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            //top -> bottom
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;

            //right -> left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom -> top
            if(left<=right){
                for(int i=bottom ;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        spiral_matrix sm=new spiral_matrix();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sm.spiralOrder(matrix));
    }
}
