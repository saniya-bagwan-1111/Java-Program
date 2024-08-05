public class MatrixMultiplication{
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int [][] result=matrixmult(matrix1,matrix2);
        for(int i []:result)
        {
            for(int j : i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixmult(int[][] matrix1, int[][] matrix2) {
    
        int rows=matrix1.length;
        int cols1=matrix1[0].length;
        int cols2=matrix2[0].length;
        int [][] result=new int[rows][cols2];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols2;j++)
            {
                for(int k=0;k<cols1;k++){
                    result [i][j] += matrix1[i][k]* matrix2[k][j];
                }
            }
        }
        return result;
    }
}