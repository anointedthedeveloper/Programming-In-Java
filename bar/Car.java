package bar;
public class Car {
    int maxSpeedLevel = 50;

    //move car
    public void moveCar(int carSpeedLevel){
        if(carSpeedLevel >= maxSpeedLevel){
            System.out.println("Car Speed level is above maxmimum speed level");
            System.out.println("\nNew Car Speed level is:"+ maxSpeedLevel);
        
        }else{
            System.out.println("Car Speed Level is:" + carSpeedLevel);
        }
    }
        public static void main(String[] args) {
            Car newCar= new Car();
            newCar.moveCar(120);
        }
    }
    

    