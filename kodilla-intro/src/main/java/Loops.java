public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
            System.out.println(sum);
        }
    }
}