/**
 * Simple FizzBuzz
 * @author Lucas Kristiansson
 * @version 1.0
 */
public class FizzBuzz{
    private void fizzBuzz(int start, int end){
        for(int i = start; i <= end; ++i){
            if(i % 3 == 0){
                System.out.print("Fizz");
            }
            if(i % 5 == 0){
                System.out.print("Buzz");
            }
            if(i % 3 != 0 && i % 5 != 0){
                System.out.print(i);
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.fizzBuzz(0, 100);
    }
}