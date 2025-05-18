package JavaCore.OOP.Abstract.Video44;
/*
3. Lưu ý quan trọng về abstract:
Quy tắc	Giải thích
abstract class không thể tạo đối tượng trực tiếp	new Animal() ❌ không được
Nếu có abstract method, class bắt buộc phải là abstract
Lớp kế thừa phải override các abstract method, nếu không thì class đó cũng phải là abstract
abstract class có thể chứa cả method bình thường và method trừu tượng

📌 4. Khi nào dùng abstract?
Dùng khi:

Bạn có 1 class chưa đầy đủ, muốn các class con phải tự định nghĩa thêm hành vi cụ thể.

Bạn đang làm việc với đa hình (polymorphism).

Bạn muốn đảm bảo các lớp con phải implement đúng cấu trúc.

📦 5. So sánh abstract class và interface (bạn sẽ học tiếp theo):
abstract class	interface
Có constructor	✅ Có	❌ Không
Có thuộc tính	✅ Có thể có	✅ Từ Java 8+
Có method thường	✅ Có	✅ (Java 8+)
Đa kế thừa	❌ Không	✅ Có thể implement nhiều interface
Dùng khi	Các class có quan hệ gần nhau	Định nghĩa chức năng/phạm vi chung

 */
public class HinhManager {
    public static void main(String[] args) {

        ToaDo toaDo1 = new ToaDo(5, 5);
        ToaDo toaDo2 = new ToaDo(6, 6);
        ToaDo toaDo3 = new ToaDo(7, 7);
        // Không thể new Contructor từ abstract
        Hinh hinh1 = new Diem(toaDo1);

        Hinh hinh2 = new HinhTron(toaDo2, 10);

        Hinh hinh3 = new HinhChuNhat(toaDo3, 7, 9);

        System.out.println(" Dien tich hien tron:" + hinh2.tinhDienTich());

        System.out.println(" Dien tich hinh chu nhat:" + hinh3.tinhDienTich());
    }
}
