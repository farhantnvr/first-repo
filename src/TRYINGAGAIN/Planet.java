package TRYINGAGAIN;

public class Planet {
    public static void main(String[] args) {
        System.out.println("Let's begin.");
        System.out.println("Getting familiar now.");

        int a, b, c;
        a = 5;
        b = 3;
        c = 8;

        System.out.println(a + b * c);
        System.out.println(b);

        String typeA, typeB;
        typeA = "Hunger";
        typeB = "Thirst";
        String space = " ";

        System.out.println(typeA + space + typeB);
        typeA = typeA.replace("Hunger", "Fear");
        System.out.println(typeA + space + typeB);
        System.out.println("Onto the next");
        System.out.println(" ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Looping!");
        }

        String checkThis = "Wait";
        System.out.println(checkThis);
        String[] array = {"John", "Aaron"};
        System.out.println(array[0]);
        System.out.println(array[1]);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[1]);
        }
    }
}
