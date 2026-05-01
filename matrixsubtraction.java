class Matrix {
    int rows;
    int cols;
    int[][] data;
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }
    public static Matrix subtract(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for subtraction.");
        }

        Matrix result = new Matrix(m1.rows, m1.cols);

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.cols; j++) {
                result.data[i][j] = m1.data[i][j] - m2.data[i][j];
            }
        }

        return result;
    }
    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixSubtraction {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);
        m1.setValue(0, 0, 8);
        m1.setValue(0, 1, 6);
        m1.setValue(1, 0, 4);
        m1.setValue(1, 1, 2);
        m2.setValue(0, 0, 3);
        m2.setValue(0, 1, 1);
        m2.setValue(1, 0, 5);
        m2.setValue(1, 1, 7);

        System.out.println("Matrix 1:");
        m1.display();

        System.out.println("Matrix 2:");
        m2.display();

        Matrix result = Matrix.subtract(m1, m2);

        System.out.println("Result of Subtraction:");
        result.display();
    }
}