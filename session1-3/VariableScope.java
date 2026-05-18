public class VariableScope {
  /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       int num = 2;
       double result = num * num;
       System.out.format("The square root of %d is %f.%n", num, 
result);
  }
}