public class Listing07_04_CountLettersInArray {
    public static void main(String[] args) {

        char[] randomLowerCaseLetters = createArray();
        int[] counts = countOccurrences(randomLowerCaseLetters);

        System.out.println("The lowercase letters are: ");
        displayArray(randomLowerCaseLetters);
        System.out.println("And their occurrences are: ");
        displayOccurrences(counts);


    }

    public static char[] createArray() {
        char[] randomLowerCaseLetters = new char[100];
        for (int i = 0; i < randomLowerCaseLetters.length; i++) {
            randomLowerCaseLetters[i] = getRandomLowerCaseLetter();
        }
        return randomLowerCaseLetters;

    }

    public static void displayArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if((i + 1) % 20 == 0){
                System.out.println();
            }
        }
        System.out.println();



    }

    public static int[] countOccurrences(char[] randomLowerCaseLetters) {
        int[] counts = new int[26];

        for (int i = 0; i < randomLowerCaseLetters.length; i++) {
            counts[randomLowerCaseLetters[i] - 'a'] += 1;
        }
        return counts;
    }
    public static void displayOccurrences(int[] counts){
        for(int i = 0; i < counts.length; i++){
            System.out.println(((char)(i+'a') ) + ": " + counts[i] + " times");
        }
    }

    public static char getRandomLowerCaseLetter() {
        return (char) (Math.random() * ('z' - 'a' + 1) + 'a');
    }

}