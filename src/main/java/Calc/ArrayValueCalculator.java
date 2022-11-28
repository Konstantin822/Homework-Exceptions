package Calc;

public class ArrayValueCalculator {
        public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
            if (array.length == 4 && array[0].length == 4){
            } else {
                throw new ArraySizeException("Wrong array lenght");
            }
            int sum = 0;
            if (array.length != 4){
                throw new ArraySizeException("Wrong array lenght");
            }


            for (int i = 0; i < array.length ; i++) {
                if (array[i].length != 4){
                    throw new ArraySizeException("Wrong array lenght");
                }
                for (int j = 0; j < array[i].length ; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Can not convert " + i + " x " + j);
                    }
                }
            }

            Integer[][] intArray = new Integer[array.length][array[0].length];
            int result = 0;
            for (int i = 0; i < array.length ; i++) {
                for (int j = 0; j < array[0].length ; j++) {
                    intArray[i][j] = Integer.parseInt(array[i][j]);
                    result += intArray[i][j];
                }
            }
            return sum;
    }
}
