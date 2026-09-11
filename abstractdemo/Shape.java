package abstractdemo;

abstract class Shape {

    private final float PI = 3.14159F; // Variable to store value of PI

    /**
     * Returns the value of PI
     *
     * @return float
     */
    public float getPI() {
        return PI;
    }

    /**
     * Abstract method
     *
     * @param val a float variable storing the value specified by user
     * @return float
     */
    
    abstract void calculate(float val);
}