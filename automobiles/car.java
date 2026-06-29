package automobiles;

 class car {
    public static void main(String[] args){
        Automobile automobile = new Automobile();

        //public access modifier
        public String has wheels(int numOfWheels)
        //testing public access
        System.out.println("===Provided Number of wheels===");
        automobile.hasWheels(4);

        //testing private access 
        System.out.println("===Number of wheels===");
        automobile.setWheels();

        //testing protected access 
        System.out.println("===Checking if is an Automobile===");
        automobile.isAutomobile();

        //testing package access
        System.out.println("===Get Number of wheels===");
        automobile.isAutomobile();
    }
}
