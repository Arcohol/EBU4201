package labs.lab8;

public class IllegalParityValue extends Exception {
    public IllegalParityValue() {
        super("Error: The program's parity bit input (the second argument) must be either 0 or 1. Please try again!");
    }
}
