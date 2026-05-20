public class ForLoopWithVariables {
    public static void main(String[] args) {
        int product;
        for (int num = 1; num <= 5; num++) {
            product = num * 10;;
            System.out.printf("\n % d * 10 = % d ", num, product);
        }
    }
}
