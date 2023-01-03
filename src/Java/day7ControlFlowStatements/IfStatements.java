package Java.day7ControlFlowStatements;

public class IfStatements {

    public static void main(String[] args) {

        int score=85;

        if(score>=70){
            System.out.println("Excellent");
            System.out.println("You passed with grade A");
        }

        int bonus, sales;
        double salary, commissionRate;

        sales=5000;
        salary=1000;

        if(sales>=5000){
            bonus=500;
            commissionRate=1.12;

            salary=salary*commissionRate+bonus;
        }

        System.out.println("Your salary is "+salary+" $");

    }
}
