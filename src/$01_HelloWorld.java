import java.util.Calendar;

public class $01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");


// Primitive Types

        int myInt = 10;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        System.out.println("Integer min val = " + myMinIntValue);
        System.out.println("Integer max val = " + myMaxIntValue);
        System.out.println("Busted min val = " + (myMinIntValue - 1 ));
        System.out.println("Busted max val = " + (myMaxIntValue + 1 ));

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short min val = " + myMinShortValue);
        System.out.println("Short max val = " + myMaxShortValue);
  
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long min val = " + myMinLongValue);
        System.out.println("Long max val = " + myMaxLongValue);


        System.out.println("------------Challenge 1--------------");
        System.out.println();
    }


}
