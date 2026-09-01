package session6;

public class ProgramA {
    public static void main(String[] args) {
        ClassA programA = new ClassA();
        programA.addCount();
        programA.sumTotal();
        programA.showCounts();

        //another instance
          ClassA programB= new ClassA();
        programB.addCount();
        programB.sumTotal();
        programB.showCounts();
    }
}
