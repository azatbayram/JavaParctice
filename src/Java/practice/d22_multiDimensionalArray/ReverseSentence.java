package Java.practice.d22_multiDimensionalArray;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence="Today is a good day to learn Java";

        System.out.println("sentence = " + sentence);


        String[] split = sentence.split(" ");

        String reversedSentence ="";

        for (int i=split.length-1; i>=0; i--){

            reversedSentence+=split[i]+" ";

        }

        System.out.println("reversedSentence = " + reversedSentence);
    }
}
