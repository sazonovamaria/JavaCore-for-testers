import hw2.MyArrayDataException;
import hw2.MyArraySizeException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"3", "7", "3", "4"},
                {"56", "62", "7", "8"},
                {"13", "78", "87", "65"},
                {"88", "90", "26", "48"},
        };

        try {
            System.out.println("Сумма значений массива - " + getSum(arr, 4));
        } catch (MyArraySizeException e) {
            System.out.println("Невозможно вычислить сумму массива. Массив имеет неверный размер.");
        } catch (MyArrayDataException e) {
            System.out.println("Невозможно вычислить сумму массива. В ячейке " + e.getCoordinates() + " ошибочные данные");
        }
    }

    public static int getSum(String[][] arr, int arraySize) throws MyArrayDataException, MyArraySizeException {
        int result = 0;

        if (arr.length != arraySize) {
            throw new MyArraySizeException("Неверный размер массива", arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arraySize) {
                throw new MyArraySizeException("Неверный размер массива", arr[i].length);
            }

            for (int j = 0; j < arr[i].length; ++j) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент невозможно привести к цифровому значению", i, j);
                }
            }
        }

        return result;

    }
}

