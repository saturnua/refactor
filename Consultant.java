package refactor;

public class Consultant {

    public void start() {

        Human client = new Human(); //��� ��� ��������� � ������ ����� ����� getHuman() ������ ��� ����� � ���� �������� ��������� ����� Human � �� ��� ���� �������� ����� 
        client.getHuman();
        BmiCalculator bmiCalc = new BmiCalculator();
        double bmiIndex = bmiCalc.calculateBmi(client.getHeight(), client.getWeight());
        String bmiCategory = bmiCalc.getBmiCategory(bmiIndex);
       
        System.out.println("Hello, " + client.getName() + "!");
	    System.out.println("My name is Peter, and I'm your personal Fitness Consultant.");
	    System.out.println("Thank you for the information provided. Let's see what we've got. ");
	    System.out.println("OK. Your BMI Index is: " + bmiIndex);
	    System.out.println("Your BMI Category is: " + bmiCategory);
    }
// ������� ����� getHuman() � ����� Human
    
}