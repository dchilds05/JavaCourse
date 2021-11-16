public class PrimitiveOperations {
    public static void main(String[] args){
        int myInt = 5;
        float myFloat = (float)3.5;
        System.out.println("myInt: " + myInt);
        System.out.println("myFloat: " + myFloat);

        float product = myInt * myFloat;
        System.out.println("product: " + product);

        float newFloat = (float)myInt;
        System.out.println("newFloat: " + newFloat);

        int newInt = (int)myFloat;
        System.out.println("newInt: " + newInt);

        char myChar = 'Z';
        System.out.println("myChar: "+ myChar);

        char lower = Character.toLowerCase(myChar);
        System.out.println("lowerCase: " + lower);
    }
}