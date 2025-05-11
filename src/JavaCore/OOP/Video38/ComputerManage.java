package JavaCore.OOP.Video38;

public class ComputerManage {
    public static void main(String[] args) {
        Country Vietnam = new Country("Vietnam", "84");
        Country USA = new Country("USA", "82");
        Country Germany = new Country("Germany", "81");


        Manufacturer Asus = new Manufacturer("Asus", USA);
        Manufacturer Viet = new Manufacturer("Viet", Vietnam);

        System.out.println(Asus);
    }
}
