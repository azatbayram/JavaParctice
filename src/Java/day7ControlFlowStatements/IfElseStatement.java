package Java.day7ControlFlowStatements;

public class IfElseStatement {

    public static void main(String[] args) {
        //if else statement
        int score=60;

        if(score>=70){
            System.out.println("Excellent");
            System.out.println("You passed with grade A");
        }
        else {
            System.out.println("You failed");
        }

        int bonus, sales;
        double salary, commissionRate;

        sales=5000;
        salary=1000;

        if(sales>=5000){
            bonus=500;
            commissionRate=1.12;
        }
        else {
            bonus=100;
            commissionRate=1.1;
        }

        salary=salary*commissionRate+bonus;

        System.out.println("Your salary is "+salary+" $");
    }
}
