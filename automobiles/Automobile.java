package automobiles;

class automobiles {
    int wheels = 2;

    protected boolean isAutomobile(){
        if(wheels > 0){
            return true;
        }else{
            return false;
        }
    }

    //private access modifier
    private String setWheels(){
        return "Number of Wheels: "+wheels;
    }

    //public access modifier
    public void hasWheels(int numOfWheels) {
        wheels = numOfWheels;
        setWheels();
    }

    //package(default) access modifier
    int getwheels(){
        return wheels;
    }
    
} 