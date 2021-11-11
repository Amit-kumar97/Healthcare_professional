import java.util.Scanner;

public class Patient {
    String name;
    double height,weight,result;

    public Patient(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double compute_BMI()
    {
        result = weight/(height*height);
        return result;
    }
    void display()
    {
        System.out.println("Patient Name: "+name);
        System.out.println("Patient's BMI= "+result+"kg/m^2");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        double height = s.nextDouble();
        double weight = s.nextDouble();
        Patient obj = new Patient(name,height,weight);
        obj.compute_BMI();
        obj.display();

    }
}
