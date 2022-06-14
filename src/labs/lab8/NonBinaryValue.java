package labs.lab8;

public class NonBinaryValue extends Exception {
    public NonBinaryValue() {
        super("Error: The first input to this program must be a 7-bit binary number. Please try again!");
    }
}
