package labs.lab1;

public class BMICalculator {
    public static void main(String[] args) {
        int weight = Integer.parseInt(args[0]);
        double height = Integer.parseInt(args[1]) / 100.0;
        double bmi = weight / (height * height);
        System.out.println("Your weight: " + weight + " kg");
        System.out.println("Your height: " + height + " m");
        System.out.printf("Your BMI: %.2f%n", bmi);
        String bmiRange;
        if (bmi < 18.5) {
            bmiRange = "Underweight";
        } else if (bmi < 25) {
            bmiRange = "Normal";
        } else if (bmi < 30) {
            bmiRange = "Overweight";
        } else {
            bmiRange = "Obese";
        }
        System.out.println("You are in the " + bmiRange + " range");
    }
}
