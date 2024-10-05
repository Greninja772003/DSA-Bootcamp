package dataTypes;

public class unicode {


    public static void main(String[] args) {
        char x = 0x0370;//it is a unicode used to generate an alphabet of greek language


        char xx = 0x03C8;

        //for loop to print greek language alphabets
        for (char c = 0x0370;c<=0x03FF; c++ )
        System.out.print( c+ " ");
        System.out.println("   ");
        //for loop to print gujrati language alphabets
        for (char g = 0x0900;g<=0x0970; g++ )
            System.out.print( g+ " ");
    }
}
