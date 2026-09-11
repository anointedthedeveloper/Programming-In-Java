package bar;
class Toyota extends Car {
    //override move car class
    public void moveCar(int carSpeedLevel){
        
        Car carObject = new Car();
        int speedLevel = carObject.maxSpeedLevel + carSpeedLevel;
        System.out.println("Toyota Car Speed Level is: " + carSpeedLevel);
    }
    public static void main(String[] args) {
        Toyota newToyota = new Toyota();
        newToyota.moveCar(120);
    }
}
