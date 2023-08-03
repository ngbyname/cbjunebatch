package example;

public class JavaTesting {

    public static void main(String args[]) {
        dataTypes();
    }

    public static void test() {
        String name = "amod";
        if (name.equalsIgnoreCase("ajay")) {
            System.out.println("chal gya Ajay");
        } else if (name.equalsIgnoreCase("prashant")) {
            System.out.println("chal gya Prashant");
        } else if (name.equalsIgnoreCase("amod")) {
            System.out.println("chal gya amod");
        } else {
            System.out.println("chal gya Code bull");
        }
    }

    public static void dataTypes() {
        /**
         * Data Types - String and StringBuilder
         * Example -
         *
         * Ques - concatenate two name, Code and Bull
         */
        String a = "Code";
        String b = "Bull";
        System.out.println("before String operation: " + a);
        a = a + " " + b;
        System.out.println("Print after String operation: " + a);

        StringBuilder c = new StringBuilder();
        c.append("true");
        System.out.println("before operation: " + c);
        c.append("false");
        System.out.println("After operation: " + c);
    }
}
