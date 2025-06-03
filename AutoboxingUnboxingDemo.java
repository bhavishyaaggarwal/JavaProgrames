public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        // Autoboxing: int to Integer
        int primitiveInt = 42;
        Integer integerObject = primitiveInt;

        System.out.println("Autoboxing: int to Integer");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Integer object: " + integerObject);

        // Autoboxing: Integer to String
        String integerAsString = integerObject.toString();

        System.out.println("\nAutoboxing: Integer to String");
        System.out.println("Integer object: " + integerObject);
        System.out.println("String representation: " + integerAsString);

        // Unboxing: String to int
        String numberString = "123";
        int unboxedInt = Integer.parseInt(numberString);

        System.out.println("\nUnboxing: String to int");
        System.out.println("String: " + numberString);
        System.out.println("Unboxed int: " + unboxedInt);

        // Autoboxing: int to String
        int anotherInt = 789;
        String intAsString = Integer.toString(anotherInt);

        System.out.println("\nAutoboxing: int to String");
        System.out.println("Primitive int: " + anotherInt);
        System.out.println("String representation: " + intAsString);

        // Unboxing: Integer to int
        Integer anotherInteger = 456;
        int unboxedInteger = anotherInteger;

        System.out.println("\nUnboxing: Integer to int");
        System.out.println("Integer object: " + anotherInteger);
        System.out.println("Unboxed int: " + unboxedInteger);
    }
}
