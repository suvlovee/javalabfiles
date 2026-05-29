public class SizeOfAllDataTypes {
    public static void main(String[] args) {
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        System.out.println("Size of boolean: Not precisely defined, typically 1 bit (but may be represented as 1 byte in memory)"+Boolean.MIN_VALUE + " bytes");
        System.out.println("Size of Date:"+ Date.MIN_VALUE + " bytes");
        System.out.println("Size of Date:"+ Date.MAX_VALUE + " bytes");

    }
}