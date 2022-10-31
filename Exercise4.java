import java.util.Scanner;

public class Exercise4 {
    public static void question1() {
        String s1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        s1 = scanner.nextLine();
        String[] words = s1.split(" ");
        System.out.println("Số kí tự: " + words.length);
        scanner.close();
    }

    private static void question2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Question 2 ------------");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1: ");
        String s1 = sc1.next();
        System.out.println("Nhập vào chuỗi 2: ");
        String s2 = sc1.next();

        System.out.println("Kết quả sau khi nối chuỗi: " + s1 + " " + s2);
        sc1.close();
    }

    public static void question3() {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Nhập Tên: ");
        name = scanner.nextLine();
        String firstCharacter = name.substring(0, 1).toUpperCase();
        String leftCharacter = name.substring(1);
        System.out.println("char at:" + name.charAt(1));
        name = firstCharacter + leftCharacter;
        System.out.println(name);
        scanner.close();
    }

    public static void question4() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        name = name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
        }
        scanner.close();
    }

    public static void question5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ: ");
        String firstName = scanner.nextLine();
        System.out.println("Nhập tên: ");
        String lastName = scanner.nextLine();
        System.out.println("Họ tên đầy đủ: " + firstName.concat(lastName));
        scanner.close();
    }

    public static void question6() {
        String fullName;
        String lastName = "", middleName = "", firstName = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên đầy đủ:");
        fullName = scanner.nextLine();
// Chuẩn hóa xâu
        fullName = fullName.trim();
        String[] words = fullName.split(" ");
        lastName = words[0];
        firstName = words[words.length - 1];
        for (int i = 1; i <= words.length - 2; i++) {
            middleName += words[i] + " ";
        }
        System.out.println("Họ là: " + lastName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + firstName);
        scanner.close();
    }

    public static void question7() {

        Scanner scanner = new Scanner(System.in);
        String fullName;
        System.out.println("Nhập họ tên đầy đủ");
        fullName = scanner.nextLine();
        scanner.close();
// remove space characters
        fullName = fullName.trim();
        fullName = fullName.replaceAll("\\s+", " ");
        System.out.println("test" + fullName);
        String[] words = fullName.split(" ");
        fullName = "";
        for (String word : words) {
            String firstCharacter = word.substring(0, 1).toUpperCase();
            String leftCharacter = word.substring(1);
            word = firstCharacter + leftCharacter;
            fullName += word + " ";
        }
        System.out.println("Họ tên sau khi chuẩn hóa: " + fullName);
    }

    public static void question8() {

        String[] groupNames = {"Java with VTI", "Cách qua môn gia va", "Học Java có khó không?"};
        for (String groupName : groupNames) {
            if (groupName.contains("Java")) {
                System.out.println(groupName);
            }
        }
    }

    public static void question9() {
        String[] groupNames = {"Java", "C#", "C++"};
        for (String groupName : groupNames) {
            if (groupName.equals("Java")) {
                System.out.println(groupName);
            }
        }
    }

    public static void question10() {

        Scanner scanner = new Scanner(System.in);
        String s1, s2, reverseS1 = "";
        System.out.println("Nhập chuỗi 1");
        s1 = scanner.nextLine();
        System.out.println("Nhập chuỗi 2");
        s2 = scanner.nextLine();
        scanner.close();
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverseS1 += s1.substring(i, i + 1);
        }
        if (s2.equals(reverseS1)) {
            System.out.println("Đây là chuỗi đảo ngược !");
        } else {
            System.out.println("Đây không phải chuỗi đảo ngược");
        }
    }

    public static void question11() {

        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Mời bạn nhập vào một chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' == str.charAt(i)) {
                count++;
            }
        }
    }

    public static void question12() {
        Scanner scanner = new Scanner(System.in);
        String s1, reverseS1 = "";
        System.out.println("Nhập chuỗi 1");
        s1 = scanner.nextLine();
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverseS1 += s1.charAt(i);
        }
        System.out.println(reverseS1);
        scanner.close();
    }

    public static void question13() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < str.length(); i++) {
            if (checkKeyNumber(str.charAt(i))) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    public static boolean checkKeyNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public static void question14() {

        Scanner scanner = new Scanner(System.in);
        String str;
        char ch1, ch2;
        System.out.println("Nhập chuỗi: ");

        str = scanner.nextLine();
        System.out.println("Nhập kí tự muốn chuyển: ");
        ch1 = scanner.nextLine().toCharArray()[0]; // chuyển một mảng string sang arraychar, sau đó lấy phần tử thứ 0
        System.out.println("Nhập kí tự sẽ chuyển: ");
        ch2 = scanner.nextLine().toCharArray()[0];
        scanner.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                str = str.replace(ch1, ch2);
            }
        }
        System.out.println("Chuoi sau khi chuyen: " + str);
    }

    public static void question15() {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Chuỗi: ");
        str = scanner.nextLine();
        scanner.close();
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static void question16() {

        Scanner scanner = new Scanner(System.in);
        String str;
        int n;
        System.out.println("Chuỗi: ");
        str = scanner.nextLine();
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        scanner.close();
        if (str == null || str.isEmpty() || str.length() % n != 0) {
            System.out.println("No");
            return;
        }
    }

    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        question11();
        question12();
        question13();
        question14();
        question15();
        question16();
    }
}
