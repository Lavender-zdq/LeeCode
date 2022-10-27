public class LeeCodePratice {

    //剑指 Offer 04. 二维数组中的查找
//    在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
//    请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                if(matrix[row][column]==target)
                    return true;




            }



        }


        return false;
    }


}
