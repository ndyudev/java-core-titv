package JavaCore.OOP.VD35;

public class BookManager {
    public static void main(String[] args) {
        myDate n1 = new myDate(22 , 07 , 2006);

        TacGia tg1 = new TacGia("Chau Nhat Duy", n1);

        Book b1 = new Book(tg1, 2006,10,"Đắt nhân tâm");

        Book b2 = new Book(tg1, 2006,10,"Đắt nhân tâm");

        System.out.println(n1);

        System.out.println(tg1);

        System.out.println(b1);

        b1.inTenSach();

        System.out.println("So sach sach 1 va 3:" + b1.kiemTraCungNamXuatBan(b2));
    }
}
