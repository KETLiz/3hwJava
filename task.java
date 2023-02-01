public class task
{
    public static void main(String[] args) {
        int[][] matrix = stepsMatrix();
        //printMatrix(matrix);
        System.out.println("Количество возможных маршрутов до правой нижней клетки равно " + matrix[7][9]);
    }    
        
    // заполнение массива. каждая ячейка соответствует кол-ву возможных ходов
    public static int[][] stepsMatrix() {
        int[][] matr = new int[8][10];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                matr[0][j] = 1;
                matr[i][0] = 1;
                if (i > 0 & j > 0) {
                    matr[i][j] = matr[i-1][j] + matr[i][j-1];
                }
            }
        }
        return matr;
    }    
        
    // вывод массива на экран
    public static void printMatrix(int[][] steps) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(steps[i][j] + "\t");
            }
            System.out.println();
        }
    }    
        
}