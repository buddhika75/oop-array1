package arrayexample4;

import java.util.Scanner;

public class ArrayExample4 {

    public static void main(String[] args) {
        int numberOfpatients;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number of patient you want to calculate BMI : ");
        numberOfpatients = s.nextInt();
        Patient[] patients = new Patient[numberOfpatients];
        for (int i = 0; i < patients.length; i++) {
            Patient p = new Patient();
            System.out.print("Please enter the first name (without any space) of the patient number " + (i + 1) + " : ");
            p.name = s.next();
            System.out.print("Please enter the height (in Meters) of the patient number " + (i + 1) + " : ");
            p.height = s.nextDouble();
            System.out.print("Please enter the weight (in kg) of the patient number " + (i + 1) + " : ");
            p.weight = s.nextDouble();
            p.calculateBmi();
            patients[i] = p;
        }
        Patient obese;
        Patient lean;
        obese = patients[0];
        lean = patients[0];

        for (Patient p : patients) {
            System.out.println(p.name + " is having a BMI of " + p.bmi);
            if (p.bmi > obese.bmi) {
                obese = p;
            }
            if (p.bmi < lean.bmi) {
                lean = p;
            }
        }

        System.out.println(obese.name + " is having the heighest BMI of " + obese.bmi + ".");
        System.out.println(lean.name + " is having the lowest BMI of " + lean.bmi + ".");

    }

}
