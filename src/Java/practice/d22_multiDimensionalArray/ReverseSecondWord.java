package Java.practice.d22_multiDimensionalArray;

public class ReverseSecondWord {

    public static void main(String[] args) {

        //reverse second word and print it output: I evol Java
        String sentence="I love Java";
        System.out.println("sentence = " + sentence);

        String[] split = sentence.split(" ");

        String reversedWord="";

        for (int j=split[1].length()-1; j>=0; j--){
            reversedWord+=split[1].charAt(j);
        }

        String reversed = sentence.replaceFirst(split[1], reversedWord);

        System.out.println("reversed = " + reversed);

        //second way

        split[1]=reversedWord;

        for (String str: split) {
            System.out.print(str+" ");
        }
    }
}
