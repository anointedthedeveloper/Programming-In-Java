package session6;

public class ClassA {
    static int totalCount = 0;
    int count = 0;
    
    void sumTotal () {
        totalCount++;
    }
    void addCount () {
        count++;
    }

    void showCounts () {
        System.out.println("Count is : " + count);
        System.out.println("Total Count is : " + totalCount);
    }
    
}
