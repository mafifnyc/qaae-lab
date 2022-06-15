public class ArraysWithDoWhileLoop extends WhileAndDoWhile{

    String[] subjects= {"math","computer science","history","geograpghy"};
    int [] numbers= {3,7,9,4,2};
    char [] alphabets= {'a','c','e'};

    @Override
    public void printStringArray() {
        //write implementation to print elements of array using do-while loop
        int i=0;
        do {
            System.out.println(subjects[i]);
            i++;
        }
        while (i<subjects.length);
    }
    @Override
    public void printIntagerArray() {
        int i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        }
        while (i < numbers.length);
    }
        @Override
    public void printCharArray() {
            int i=0;
            do {
                System.out.println(alphabets[i]);
                i++;
            }
            while(i< alphabets.length);
        }
    @Override
    public void searchStringArray(String word) {
        int i=0;
        do {
            if(subjects[i] == word){
                System.out.println("Here I am you found me, I am at " + i + "th Index.");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
        while(i<subjects.length);
    }
    @Override
    public void searchIntegarArray(int number) {
        int i=0;
        do {
            if(numbers[i] == number) {
                System.out.println("Here I am you found me, I am at " + i + "th Index.");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
        while(i<numbers.length);
    }
    @Override
    public void searchCharArray(char letter) {
        int i=0;
        do {
            if(alphabets[i] == letter) {
                System.out.println("Here I am you found me, I am at " + i + "th Index.");
            }
            else {
                System.out.println("you entered wrong input");
            }
            i++;
        }
        while(i<alphabets.length);
    }
    /*Write implementation for other 5 methods which you declared
      in abstract class here as well using "DO-WHILE LOOP"

      *** for search methods: if word is not found print message "you entered wrong input"
          and if word is found print message "Here I am you found me"  ****

     */
    public void printVowels(String[] vowelArray){
        //write code here to print vowel array using While loop
        int i=0;
        do {
            System.out.println(vowelArray[i]);
            i++;
        }
        while(i< vowelArray.length);
    }
    public static void main(String[] args){
        String[] vowels = {"a","e","i","o","u"};

        ArraysWithDoWhileLoop bunchOfArrays = new ArraysWithDoWhileLoop();

        bunchOfArrays.printVowels(vowels);
        bunchOfArrays.printStringArray();
        bunchOfArrays.printIntagerArray();
        bunchOfArrays.printCharArray();
        bunchOfArrays.searchStringArray("math");
        bunchOfArrays.searchIntegarArray(7);
        bunchOfArrays.searchCharArray('a');
        //Declare array having vowel elements
        //call method printVowels(String vowelArray)
        //call all other methods here
    }
    
}
