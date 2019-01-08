package pl.firstproject;

public class firstFunction {
    public static void main(String[] args) {
        String firstSentence = "Dzisiaj występują przelotne opady deszczu";
        String secondSentence = "Nocny przymrozek może powodować gołoledź";
        String thirdSentence = "Ciśnienie atmosferyczne gwałtowanie spada";


        System.out.println(firstSentence);
        System.out.println(secondSentence);
        System.out.println(thirdSentence);

        int sentenceLength;

        sentenceLength = firstSentence.length() + secondSentence.length() + thirdSentence.length();

        System.out.println("Długość wszystkich zdań wynosi " + sentenceLength);
    }
}
