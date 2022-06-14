package labs.lab6;

public class ParityBitAdder {
    public int calculateParity(String x, int parityType) {
        int parity = 0;
        for (int i = 0; i < x.length(); i++) {
            parity ^= x.charAt(i) - '0';
        }
        if (parityType == 0) {
            return parity;
        } else {
            return (parity == 0) ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        String x = args[0];
        int parityType = Integer.parseInt(args[1]);

        ParityBitAdder pba = new ParityBitAdder();
        int parity = pba.calculateParity(x, parityType);
        System.out.println("Adding " + switch (parityType) {
            case 0 -> "even";
            case 1 -> "odd";
            default -> "unknown";
        } + " parity to '" + x + "' results in the binary pattern '" + parity + x + "'");
    }
}
