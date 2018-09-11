public class Resistor {
    private double i;
    private double r;

    public Resistor(double resistance){
        r = resistance;
        this.r = r;
    }

    public void setI(double current) {
        i = current;
        this.i = i;
    }

    public void setV(double voltage) {
        i = voltage / r;
    }

    public double getI() {
        return i;
    }

    public double getV() {
        return i * r;
    }

    public double getR() {
        return r;
    }

    public double getPower() {
        return i*i*r;
    }

    public static void main(String[] args){

        Resistor r1, r2;

        System.out.println("Creating a 50 Ohm resistor (r1)");

        r1 = new Resistor(50.0);

        System.out.println("Its resistance is " + r1.getR() + " Ohms");

        System.out.println("Its current is " + r1.getI() + " Amps");

        System.out.println("Its voltage is " + r1.getV() + " Volts");

        System.out.println("Its power is " + r1.getPower() + " Watts");

        System.out.println("Creating a 100 Ohm resistor (r2)");

        r2 = new Resistor(100.0);

        System.out.println("Its resistance is " + r2.getR() + " Ohms");

        System.out.println("Setting r1's current to 2 Amps");

        r1.setI(2.0);

        System.out.println("Its current is " + r1.getI() + " Amps");

        System.out.println("Its voltage is " + r1.getV() + " Volts");

        System.out.println("Its power is " + r1.getPower() + " Watts");

        System.out.println("Setting r1's voltage to 50 Volts");

        r1.setV(50.0);

        System.out.println("Its current is " + r1.getI() + " Amps");

        System.out.println("Setting r2's current to 3 Amps");

        r2.setI(3.0);

        System.out.println("Its voltage is " + r2.getV() + " Volts");
    }
}
