public class UnicodeSequence {
 /*** @param args the command line arguments*/
 public static void main(String[] args) {
// Prints 'Hello' using hexadecimal escape sequence characters
 System.out.println("\u0048\u0065\u006C\u006C\u006F" + "!\n");
// Prints 'Blake' using octal escape sequence character for 'a'
 System.out.println("Bl\141ke\"2007\" "); 
}
}