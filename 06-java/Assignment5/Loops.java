public class Loops {
    /* The purpose of this class is to
    practice for loops.
     */
    public void printStringArray(){
        //Write code to move through array and print all elements of array using for loop
        String[] subjects= {"math","computer science","history","geograpghy"};
        for(int i=0; i<subjects.length; i++) {
            System.out.println(subjects[i]);
        }
    }
    public void printIntegarArray(){
        //Write code to move through array and print all elements of array using for loop
        int [] numbers= {3,7,9,4,2};
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    public void printCharArray(){
        //Write code to move through array and print all elements of array using for loop
        char [] alphabets= {'a','c','e'};
        for(int i=0; i< alphabets.length; i++) {
            System.out.println(alphabets[i]);
        }
    }
    public void printStringArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        String [] subjects= {"math","computer science","history","geograpghy"};
        for(String each : subjects) {
            System.out.println(each);
        }
    }
    public void printIntegarArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        int [] numbers= {3,7,9,4,2};
        for(int each : numbers) {
            System.out.println(each);
        }
    }
    public void printCharArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        char [] alphabets= {'a','c','e'};
        for(char each: alphabets) {
            System.out.println(each);
        }
    }
    public static void main(String [] args){
        Loops practice = new Loops();

        System.out.println("Printing String array using for loop");
        practice.printStringArray();
        System.out.println("Printing int array using for loop");
        practice.printIntegarArray();
        System.out.println("Printing char array using for loop");
        practice.printCharArray();
        System.out.println("Printing String array using foreach loop");
        practice.printStringArray2();
        System.out.println("Printing int array using foreach loop");// write similar message for all methods calling them
        practice.printIntegarArray2();
        System.out.println("Printing char array using foreach loop");
        practice.printCharArray2();
        // call all above methods here one by one
    }
}
