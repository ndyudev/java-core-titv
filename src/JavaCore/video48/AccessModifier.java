package JavaCore.video48;

public class AccessModifier {
    /*
    🧩 Tổng quan về 4 Access Modifier trong Java:
Modifier	Trong class	Trong package	Package khác (kế thừa)	Package khác (không kế thừa)
public	    ✅	        ✅	            ✅	                    ✅
protected	✅	        ✅	            ✅ (chỉ nếu kế thừa)	❌
(default)	✅	        ✅	            ❌	                    ❌
private	    ✅	        ❌	            ❌	                    ❌

🔐 protected – Bảo vệ trong kế thừa
✅ Đặc điểm:
Truy cập được trong cùng package.

Truy cập được ở package khác nếu là class con (subclass).

Thường dùng khi bạn muốn cho phép kế thừa nhưng không công khai hoàn toàn như public.

🧪 Ví dụ:
📁 package1/Student.java
java
Sao chép
Chỉnh sửa
package package1;

public class Student {
    protected String name = "Duy";

    protected void hello() {
        System.out.println("Hello from Student");
    }
}
📁 package2/Main.java
java
Sao chép
Chỉnh sửa
package package2;

import package1.Student;

public class Main extends Student {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.name);  // ✅ OK vì là subclass
        m.hello();                   // ✅ OK
    }
}
✅ Nếu không kế thừa, thì protected sẽ không truy cập được từ package khác.

🌫 (default) – Không ghi gì thì là default
✅ Đặc điểm:
Khi bạn không ghi gì trước biến/hàm/class, thì mặc định là default access.

Chỉ dùng được trong cùng package.

Không dùng được ở package khác, kể cả class con kế thừa.

🧪 Ví dụ:
📁 package1/Student.java
java
Sao chép
Chỉnh sửa
package package1;

class Student {
    String name = "Duy"; // default
    void hello() {
        System.out.println("Hello from default Student");
    }
}
📁 package2/Main.java
java
Sao chép
Chỉnh sửa
package package2;

import package1.Student; // ❌ lỗi vì class Student là default (không public)

public class Main {
    public static void main(String[] args) {
        // Không thể truy cập class Student ở package khác
    }
}
📌 Default thường dùng cho những class, method chỉ xài nội bộ trong package – như helper class.

✅ Khi nào dùng gì?
Modifier	Dùng khi bạn muốn...
public	Mọi nơi truy cập được
private	Ẩn dữ liệu, bảo mật nội bộ
protected	Chia sẻ với subclass (kế thừa)
default	Chỉ nội bộ package biết, không công khai

🧠 Mẹo nhớ nhanh:
cpp
Sao chép
Chỉnh sửa
private < default < protected < public
private: riêng tư nhất

default: nội bộ package

protected: cho package + con kế thừa

public: ai cũng truy cập được
     */
}
