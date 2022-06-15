public class ArraysWithWhileLoop extends WhileAndDoWhile{

    String[] subjects= {"math","computer science","history","geograpghy"};
    int [] numbers= {3,7,9,4,2};
    char [] alphabets= {'a','c','e'};


    @Override
    public void printStringArray() {
        //write implementation to print elements of array using while loop
        int i=0;
        while(i<subjects.length) {
            System.out.println(subjects[i]);
            i++;
        }
    }
    @Override
    public void printIntagerArray() {
        int i=0;
        while(i< numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
    }
    @Override
    public void printCharArray() {
        int i=0;
        while(i< alphabets.length) {
            System.out.println(alphabets[i]);
            i++;
        }
    }
    @Override
    public void searchStringArray(String word) {
        int i=0;
        while(i<word.length()) {
            if(subjects[i] == word){
                System.out.println("Here I am you found me");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
    }
    @Override
    public void searchIntegarArray(int number) {
        int i=0;
        while(i<numbers.length) {
            if(numbers[i] == number) {
                System.out.println("Here I am you found me");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
    }
    @Override
    public void searchCharArray(char letter) {
        int i=0;
        while(i<alphabets.length) {
            if(alphabets[i] == letter) {
                System.out.println("Here I am you found me");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
    }
    /*Write implementation for other 5 methods which you declared
      in abstract class here as well using "WHILE LOOP"

      *** for search methods: if word is not found print message "you entered wrong input"
          and if word is found print message "Here I am you found me"  ****

     */
    public void printVowels(String[] vowelArray){
        //write code here to print vowel array using While loop
        int i=0;
        while(i< vowelArray.length) {
            System.out.println(vowelArray[i]);
            i++;
        }

    }
    public static void main(String [] args){
        String[] vowels = {"a","e","i","o","u"};

        ArraysWithWhileLoop bunchOfArray = new ArraysWithWhileLoop();

        bunchOfArray.printVowels(vowels);
        bunchOfArray.printStringArray();
        bunchOfArray.printIntagerArray();
        bunchOfArray.printCharArray();
        bunchOfArray.searchStringArray("math");
        bunchOfArray.searchIntegarArray(7);
        bunchOfArray.searchCharArray('a');

        //Declare array having vowel elements
        //call method printVowels(String vowelArray)
        //call all other methods here
    }
}
