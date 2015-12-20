package refactor;

import java.util.Scanner;

public class Human {

	private String sex;
    private String name;
    private int age;
    private double height;
    private double weight;

    Scanner input = new Scanner(System.in);
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public Human getHuman() {

       /*
    	String name;
       String sex;
       int age;
       double height;
       double weight; не нужно так как метод уже в классе и у него поля определены*/

        Human human = new Human();

        System.out.println("Enter your name:");
        name = getName(input.next());
        System.out.println("Enter your sex (male/female):");
        sex = getSex(input.next());
        System.out.println("Enter your age:");
        age = getAge(input.next());
        System.out.println("Enter your height in cm:");
        height = getHeight(input.next());
        System.out.println("Enter your weight in kg:");
        weight = getWeight(input.next());


        human.setName(name);
        human.setSex(sex);
        human.setAge(age);
        human.setHeight(height);
        human.setWeight(weight);

        return human;
    }
    
// Ниже выполняется проверка вводимых данных
    
    private String getName(String s) {
        while ((!s.matches("(\\D){3,15}"))) {
            System.out.println("Enter correct value (3 to 15 letters):");
            s = input.next();
        }
        return s;
    }

    private String getSex(String sex) {
        sex = sex.toLowerCase();
        while (!(sex.matches("male|female"))) {
            System.out.println("Please enter correct value (male or female):");
            sex = input.next().toLowerCase();
        }
        return sex;
    }

    private int getAge(String s) {
        while (true) {
            while (!(s.matches("\\d+"))) {
                System.out.println("Enter correct value from 10 to 100:");
                s = input.next();
            }
            int age = Integer.valueOf(s);
            if ((age >= 10) && (age <= 100)) {
                return age;
            } else {
                System.out.println("Enter correct value from 10 to 100:");
                s = input.next();
            }
        }

    }

    private double getHeight(String s) {
        while (true) {
            while (!(s.matches("\\d+[\\.,]?\\d+"))) {
                System.out.println("Enter correct value from 50 to 250:");
                s = input.next();
            }
            s = s.replace(",", ".");
            double height = Double.valueOf(s);
            if ((height >= 50.0) && (height <= 250.0)) {
                return height;
            } else {
                System.out.println("Enter correct value from 50 to 250:");
                s = input.next();
            }
        }
    }

    private double getWeight(String s) {
        while (true) {
            while (!(s.matches("\\d+[\\.,]?\\d+"))) {
                System.out.println("Enter correct value from 30.0 to 300.0:");
                s = input.next();
            }
            s = s.replace(",", ".");
            double weight = Double.valueOf(s);
            if ((weight >= 30.0) && (weight <= 300.0)) {
                return weight;
            } else {
                System.out.println("Enter correct value from 30.0 to 300.0:");
                s = input.next();
            }
        }
    }
}