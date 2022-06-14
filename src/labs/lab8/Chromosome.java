package labs.lab8;

import java.util.Arrays;

public class Chromosome {
    private int[] chromosomeArray;

    public Chromosome(int[] chromosomeArray) throws NonBinaryValue {
        for (int i : chromosomeArray) {
            if (i != 0 && i != 1) {
                for (int j = 0; j < chromosomeArray.length; j++) {
                    chromosomeArray[j] = 1;
                }
                throw new NonBinaryValue();
            }
        }
        this.chromosomeArray = chromosomeArray;

    }

    public int getFitness() {
        int fitness = 0;
        for (int i = 0; i < chromosomeArray.length; i++) {
            if (chromosomeArray[i] == 1) {
                fitness++;
            }
        }
        return fitness;
    }

    public String toString() {
        return Arrays.toString(chromosomeArray);
    }

    public static void main(String[] args) {
        try {
            Chromosome c1 = new Chromosome(new int[] { 1, 0, 1, 1, 1, 0, 1 });
            System.out.println(c1.toString());
            System.out.println(c1.getFitness());

            Chromosome c2 = new Chromosome(new int[] { 3, 5, 2, 2 });
            System.out.println(c2.toString());
            System.out.println(c2.getFitness());
        } catch (NonBinaryValue e) {
            e.printStackTrace();
        }
    }
}
