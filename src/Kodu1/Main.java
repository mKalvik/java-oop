package Kodu1;

public class Main {

    public static void main(String[] args) {
        StudentThings mary = new StudentThings("Mary", 0, "IAPB");
        StudentThings martin = new StudentThings("Martin", 0);
        StudentThings jacob = new StudentThings("Jacob", 0);


        martin.addPoints(34);
        mary.addPoints(24);
        jacob.addPoints(43);
        martin.addPoints(6);

        mary.addYear(1997);
        martin.addYear(1995);

        System.out.println(martin.getPoints());
        System.out.println(martin.getYear());
        System.out.println(mary.getCode());
        System.out.println(mary.getYear());


        System.out.println(mary.getCode());
        System.out.println(martin.getCode());


    }
}
