public class StringDemo {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "HELLO";
    String s4 = "welcome";

    void printDemo(){
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println(s1.hashCode() + " - " + s2.hashCode() + " - " + s3.hashCode() + " - " + s4.hashCode());
    }

    public static void main(String[] args) {
        StringDemo sd1 = new StringDemo();
        sd1.printDemo();
    }
}
