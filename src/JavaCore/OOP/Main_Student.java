public class Main_Student {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n📌 QUẢN LÝ SINH VIÊN");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Cập nhật sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> manager.addStudent();
                case 2 -> manager.showStudents();
                case 3 -> manager.deleteStudent();
                case 4 -> manager.updateStudent();
                case 5 -> {
                    System.out.println("🚀 Thoát chương trình!");
                    return;
                }
                default -> System.out.println("❌ Chọn sai, vui lòng nhập lại!\n");
            }
        }
    }
}
