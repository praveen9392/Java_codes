class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        long aLong = (long) a;
        System.out.println("conversion to long: " + aLong);

        float aFloat = (float) aLong;
        System.out.println("conversion to float: " + aFloat);

        double aDouble = (double) aFloat;
        System.out.println("conversion to double: " + aDouble);

        float aFloat2 = (float) aDouble;
        System.out.println("conversion to float: " + aFloat2);

        byte b = 4;
        short bShort = (short) b;
        System.out.println("conversion to short: " + bShort);

        byte bByte = (byte) bShort;
        System.out.println("conversion to byte: " + bByte);

        int c = 4;
        char cChar = (char) c;
        System.out.println("conversion to char: " + cChar);

        int cInt = (int) cChar;
        System.out.println("conversion to int: " + cInt);
    }
}