public class SizeOfAllDataTypes {
    public static void main(String[] args) {
        System.out.println("Size of byte: " + Byte.BYTES + " bytes");
        System.out.println("Size of short: " + Short.BYTES + " bytes");
        System.out.println("Size of int: " + Integer.BYTES + " bytes");
        System.out.println("Size of long: " + Long.BYTES + " bytes");
        System.out.println("Size of float: " + Float.BYTES + " bytes");
        System.out.println("Size of double: " + Double.BYTES + " bytes");
        System.out.println("Size of char: " + Character.BYTES + " bytes");
        /*
         * Java does not provide Boolean.BYTES or Boolean.SIZE.
         * The size of boolean is not exactly defined by Java.
         * It stores only true or false, so logically it needs 1 bit.
         * In memory, the JVM may store it differently.
         */
        System.out.println("Size of boolean: Not precisely defined in Java");

        /*
         * Date is not a primitive data type.
         * It is a class/reference type, so Java does not provide Date.BYTES.
         * java.util.Date stores time internally using a long value.
         */
        System.out.println("Size of Date: Not fixed because Date is a class/reference type");
        System.out.println("Internal time value used by Date is long: " + Long.BYTES + " bytes");

    }
}
