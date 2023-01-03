package Java.day7ControlFlowStatements;

public class IfElseIfElse {

    public static void main(String[] args) {
        //program to display week days with if else if

        int day=3;

        if (day==1){
            System.out.println("Monday");
        }
        else if (day==2){
            System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }
        else if (day==5){
            System.out.println("Friday");
        }
        else if (day==6){
            System.out.println("Saturday");
        }
        else if (day==7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("not valid day");
        }
    }
}
