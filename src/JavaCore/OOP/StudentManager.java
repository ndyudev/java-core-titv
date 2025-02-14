import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Thêm sinh viên
    public void addStudent() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        students.add(new Student(id, name, age, gpa));
        System.out.println("✅ Thêm sinh viên thành công!\n");
    }

    // Hiển thị danh sách sinh viên
    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        System.out.println("\n📌 Danh sách sinh viên:");
        for (Student s : students) {
            s.displayInfo();
        }
    }

    // Xóa sinh viên theo ID
    public void deleteStudent() {
        System.out.print("Nhập ID sinh viên cần xóa: ");
        String id = scanner.nextLine();
        students.removeIf(s -> s.getId().equals(id));
        System.out.println("✅ Đã xóa sinh viên có ID: " + id + "\n");
    }

    // Cập nhật thông tin sinh viên
    public void updateStudent() {
        System.out.print("Nhập ID sinh viên cần cập nhật: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("Nhập tên mới: ");
                s.setName(scanner.nextLine());
                System.out.print("Nhập tuổi mới: ");
                s.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("Nhập GPA mới: ");
                s.setGpa(Double.parseDouble(scanner.nextLine()));
                System.out.println("✅ Cập nhật thành công!\n");
                return;
            }
        }
        System.out.println("❌ Không tìm thấy sinh viên có ID: " + id + "\n");
    }
}
