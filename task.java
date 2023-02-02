public class task
{
    public static void main(String[] args) {
        System.out.println("Вот такая нам дана карта: ");
        int[][] matrix = new int[8][10];
        int[][] matrix2 = stepsMatrix(matrix);
        printMatrix(matrix2);
        System.out.print("Давайте определимся, откуда наша фигура будет стартовать!");
        Scanner row = new Scanner(System.in);
        System.out.print("Введите первую координату фигуры: ");
        int x = row.nextInt();
        Scanner column = new Scanner(System.in);
        System.out.print("Введите вторую координату фигуры: ");
        int y = column.nextInt();
        System.out.println("Путь фигуры: ");
        int[][] newmatr = new int[8-x+1][10-y+1];
        int[][] newmatr2 = stepsMatrix(newmatr);
        printMatrix(newmatr2);
        System.out.println("Количество возможных маршрутов для фигуры, которая двигается из точки с координатами [" + x + ", " + y + "] равно: " + newmatr2[newmatr2.length-1][newmatr2[0].length-1]);
    }    
        
    // заполнение массива. каждая ячейка соответствует кол-ву возможных ходов
    public static int[][] stepsMatrix(int[][] matr) {
        int[][] matr = new int[8][10];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
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
        for (int i = 0; i < steps.length; i++) {
            for (int j = 0; j < steps[0].length; j++) {
                System.out.print(steps[i][j] + "\t");
            }
            System.out.println();
        }
    }    
        
}
