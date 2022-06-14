package labs.lab8;

import java.util.Scanner;

public class ParityBitAdderV3 {
    String x;
    int parityType;

    public ParityBitAdderV3(String x, int parityType) throws NonBinaryValue, IllegalParityValue {
        if (x.length() != 7 || !x.matches("[01]+")) {
            throw new NonBinaryValue();
        }

        if (parityType != 0 && parityType != 1) {
            throw new IllegalParityValue();
        }

        this.x = x;
        this.parityType = parityType;
    }

    public int calculateParity() {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 7-bit binary number: ");
        String x = sc.next();
        System.out.println("Enter 0 for even parity or 1 for odd parity: ");
        int parityType = sc.nextInt();
        sc.close();

        try {
            ParityBitAdderV3 pba = new ParityBitAdderV3(x, parityType);
            int parity = pba.calculateParity();
            System.out.println("Adding " + switch (pba.parityType) {
                case 0 -> "even";
                case 1 -> "odd";
                default -> "unknown";
            } + " parity to '" + pba.x + "' results in the binary pattern '" + parity + pba.x + "'");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NonBinaryValue e) {
            e.printStackTrace();
        } catch (IllegalParityValue e) {
            e.printStackTrace();
        }
    }
}
