package example;

public class JavaTesting {

    public static void main(String args[]){
        test();
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
}
