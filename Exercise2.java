using package Java;

import java.time.LocalDate;

public class Exercise2 {
    public class Account {
        public int id;
        public String email;
        public String userName;
        public String fullName;
        public Department department;
        public Position position;
        public LocalDate createDate;
        public Group[] groups;
    }

    private static void question1() {
        System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");
        Account[] accArray = new Account[5];
        for (int i = 0; i < accArray.length; i++) {
            Account acc = new Account();
            acc.email = "Email " + i;
            acc.userName = "User name " + i;
            acc.fullName = "Full name " + i;
            acc.createDate = LocalDate.now();
            accArray[i] = acc;
            System.out.println("Thông tin Account " + i + " Email: " + accArray[i].email + " UserName: " + accArray[i].userName + " FullName: " + accArray[i].fullName + " CreateDate: " + accArray[i].createDate);
        }
    }

    public static void main(String[] args) {
        question1();
    }
}
