package JavaCore.OOP.VD35;

public class Book {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Book(TacGia tacGia, int namXuatBan, double giaBan, String tenSach) {
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaBan = giaBan;
        this.tenSach = tenSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void inTenSach() {
        System.out.println("Tên Sách:" + tenSach);
    }

    public boolean kiemTraCungNamXuatBan(Book bookKhac) {
//        if(this.namXuatBan == bookKhac.namXuatBan ) {
//            return true;
//        } else {
//            return false;
//        }
        return this.namXuatBan == bookKhac.namXuatBan;
    }
}
