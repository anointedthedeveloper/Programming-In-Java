package fruits;

public class Mango implements Suckers {
    //implements method of suckers
    @Override
    public void isSuckable(Boolean hasJuice) {
        if(hasJuice){
            System.out.println("This fruit can be sucked on");
        }else{
            System.ou_   t.println("This fruit should be either pealed or licked");
        }
    }   
    //run
    public static void main(String a[]){
        Mango mango = new Mango();
        //
        System.out.println("Does Mango have seeds? " + Suckers.hasSeeds);
        mango.isSuckable(true);
    }
}
