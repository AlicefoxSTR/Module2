import java.util.Arrays;
public class Module2 {

    public static void main(String[] args) {
        int[] array1 = {44, 32, 86, 19};
        int[] array21 = {1, 2, 3, 4};
        int[] array22 = {1, 3};
        int[] array3 = {1, 2, 3};
        System.out.println(repeat("hello", 3)); //проверка каждого символа
        System.out.println(differenceMaxMin(array1)); //разница между самым большим и маленьким числом
        System.out.println(isAvgWhole(array21)); //ср. значение = целое
        System.out.println( isAvgWhole(array22)); //задача3.2
        System.out.println(Arrays.toString(cumulativeSum(array3))); //сумма самого себя + предыдущие
        System.out.println( getDemicalPlaces("44.28754")); //число 10-ых знаков
        System.out.println (Fibonacci(12)); //число Фибоначчи
        System.out.println( isValid("59a20")); //задача 7
        System.out.println(isStrangePair("уауау", "ауауау")); //задача8
        System.out.println(isPrefix("automation", "auto-")); //задача9
        System.out.println(boxSeq(6));  //задача10
    }

    //Задача №1
    public static String repeat(String a, int n) {
        String str = " ";
        for (int i = 0; i < a.length(); i++){
            char sym = a.charAt(i);
            for (int j = 1; j <= n; j++){
                str += sym;
            }
        }
        return str;
    }

    //Задача №2
    public static int differenceMaxMin(int arr[]) {
        int max = arr[1];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        int dmm = max - min;
        return dmm ;
    }

    //Задание №3
    public static boolean isAvgWhole(int arr[]) {
        double iaw = 0;
        for (int i = 0; i < arr.length; i++)
            iaw += arr[i];
        iaw = iaw/arr.length;
        if (iaw % 2==0){
            return true;
        }
        else {
            return false;
        }

    }

    //Задание №4
    public static int[] cumulativeSum(int arr[]) {
        int[] mas = new int[arr.length];
        mas[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            mas[i] = arr[i] + mas[i-1];
        }
        return mas;
    }

    //Задание №5
    public static int getDemicalPlaces(String str) {
        int kol = 0;
        int ind = 0;
        for (int i = 0; i < str.length(); i++ ){
            if (str.charAt(i) == '.'){
                kol = 0;
                ind = 1;
            }
            else{
                kol++;
            }
        }
        if (ind == 1){
            return kol;
        }
        else {
            return 0;
        }
    }

    //Задание №6
    public static int Fibonacci(int num) {
        int a = 1;
        int b = 1;
        int sum = 0;
        if (num == 1)
            return 1;
        else
            for (int i = 2; i <= num; i++) {
                sum = a + b;
                b = a + b;
                a = b - a;
            }
        return sum;
    }

    //Задание №7
    public static boolean isValid(String str){
        try {
            double num = Double.parseDouble(str);
        } catch (NumberFormatException e){
            return false;
        }
        return str.length() <= 5;
    }

    //Задание №8
    public static boolean isStrangePair(String str1, String str2){
        return str1.charAt(0) == str2.charAt(str2.length()-1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
    }

    //Задание №9
    public static boolean isPrefix(String str1, String str2){
        for (int i =0; i < str2.length()-1; i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String str1, String str2){
        for (int i = str1.length() - str2.length() +1; i < str2.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //Задание №10
    public static int boxSeq(int shag) {
        int a = 0;
        for (int i = 1; i <= shag; i++) {
            if (i % 2 == 1) {
                a += 3;
            }
            else
                a -= 1;
        }
        return a;
    }
}
