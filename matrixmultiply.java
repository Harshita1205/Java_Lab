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

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.cols != m2.rows) {
            throw new IllegalArgumentException("Matrix multiplication not possible. Columns of first matrix must equal rows of second matrix.");
        }

        Matrix result = new Matrix(m1.rows, m2.cols);

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                for (int k = 0; k < m1.cols; k++) {
                    result.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
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

public class MatrixMultiplication {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        Matrix m2 = new Matrix(3, 2);
        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(0, 2, 3);
        m1.setValue(1, 0, 4);
        m1.setValue(1, 1, 5);
        m1.setValue(1, 2, 6);
        m2.setValue(0, 0, 7);
        m2.setValue(0, 1, 8);
        m2.setValue(1, 0, 9);
        m2.setValue(1, 1, 10);
        m2.setValue(2, 0, 11);
        m2.setValue(2, 1, 12);

        System.out.println("Matrix 1:");
        m1.display();

        System.out.println("Matrix 2:");
        m2.display();

        Matrix result = Matrix.multiply(m1, m2);

        System.out.println("Result of Multiplication:");
        result.display();
    }
}