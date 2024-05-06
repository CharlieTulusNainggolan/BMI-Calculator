import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double berat, bmi, tinggi, meter;
        boolean kurangIdeal, normal, gemuk, obesitas;

        System.out.print("Silahkan masukkan berat badan (kg): ");
        berat = input.nextDouble();

        System.out.print("Silahkan masukkan tinggi badan (cm): ");
        tinggi = input.nextDouble();

        meter = tinggi / 100.0;

        System.out.printf("Tinggi badan anda dalam satuan Meter: %.2f m\n", meter);

        bmi = berat / (meter * meter);

        System.out.printf("Hasil BMI anda adalah: %.2f\n", bmi);

        kurangIdeal = bmi < 18.5;
        normal = bmi >= 18.5 && bmi < 25;
        gemuk = bmi >= 25 && bmi < 30;
        obesitas = bmi >= 30;

        if (kurangIdeal)
            System.out.println("Sehingga Kurang ideal");
        else if (normal)
            System.out.println("Sehingga Normal");
        else if (gemuk)
            System.out.println("Sehingga Gemuk");
        else if (obesitas)
            System.out.println("Sehingga Obesitas");

            
    }
}
