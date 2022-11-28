package Calc;

public class main {
    public static void main(String[] args) {

        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf(i + j);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        try {
            try {
                int sum = ArrayValueCalculator.doCalc(array);
                System.out.println("Sum = " + sum);
            } catch (ArraySizeException e) {
                e.printStackTrace();
            }
        } catch (ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
