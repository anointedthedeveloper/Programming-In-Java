package finalstaticinstance;

public class FinalStaticInstanceDemo {
    private final int id;
    private static int totalCreated;
    private int updates;

    private FinalStaticInstanceDemo(int id) {
        this.id = id;
        totalCreated++;
    }

    public static FinalStaticInstanceDemo create(int id) {
        return new FinalStaticInstanceDemo(id);
    }

    public static FinalStaticInstanceDemo create() {
        return new FinalStaticInstanceDemo(totalCreated + 1);
    }

    public void updateInstanceVariable() {
        updates++;
    }

    public int getId() {
        return id;
    }

    public int getUpdates() {
        return updates;
    }

    public static int getTotalCreated() {
        return totalCreated;
    }

    public static void main(String[] args) {
        FinalStaticInstanceDemo first = FinalStaticInstanceDemo.create(101);
        FinalStaticInstanceDemo second = FinalStaticInstanceDemo.create();

        System.out.println("FINAL INSTANCE VARIABLE");
        System.out.println("first.id = " + first.getId());
        System.out.println("The final id is assigned once in the constructor and cannot be updated.");

        System.out.println("\nSTATIC VARIABLE");
        System.out.println("After two create() calls, totalCreated = " + getTotalCreated());
        FinalStaticInstanceDemo third = FinalStaticInstanceDemo.create(103);
        System.out.println("After another create() call, totalCreated = " + getTotalCreated());
        System.out.println("Every instance sees the same static total: " + third.getTotalCreated());

        System.out.println("\nINSTANCE VARIABLE");
        first.updateInstanceVariable();
        first.updateInstanceVariable();
        second.updateInstanceVariable();
        System.out.println("first.updates = " + first.getUpdates());
        System.out.println("second.updates = " + second.getUpdates());
        System.out.println("Each instance keeps its own updates value; values are not shared.");
    }
}
