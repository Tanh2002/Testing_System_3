public class Exercise3 {
    private static void question1() {
        Integer salary = 5000;
        System.out.printf("%2.2f", (float) salary);
    }

    private static void question2() {
        System.out.println("-------------Question2--------------");
        String s = "1234567";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    private static void question3() {
        System.out.println("-------------Question3--------------");
        Integer i = 1234567;
        int i1 = i.intValue();
        System.out.println(i1);
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }

}
