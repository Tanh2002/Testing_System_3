import java.util.Comparator;

public class Exercise5 {
    public class Department implements Comparator<Department> {
        int id;
        String name;

        @Override
        public String toString() {
            return "Department{" + "id=" + id + ", name='" + name + '\'' + '}';
        }

        @Override // ghi đè phương thức compare của Interface Comparator
        public int compare(Department o1, Department o2) {
            return o1.name.compareTo(o2.name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            Department department = (Department) o;
            if (name.equals(department.name)) {
                return true;
            }
            return false;
        }


    }

    public static void question1(Department department) {
        System.out.println(department.toString());
    }

    public static void question2(Department[] departments) {
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public static void question3(Department department) {
        System.out.println(department.hashCode());
    }

    public static void question4(Department department) {
        if (department.name.equals("Phòng A")) {
            System.out.println("Có tên là phòng A");
        } else {
            System.out.println("Không tên là phòng A");
        }
    }

    public static void question5(Department department1, Department department2) {
        if (department1.equals(department2)) {
            System.out.println("Có bằng nhau !");
        } else {
            System.out.println("Không bằng nhau !");
        }
    }

    public static void question6(Department[] departments) {
        // order by
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                if (departments[i].name.compareToIgnoreCase(departments[j].name) < 0) {
                    // swap
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
