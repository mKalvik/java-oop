package grinder;


import java.time.LocalTime;

public class main {

    public static void main(String[] args) {
        Grinder grinder1 = new Grinder(LocalTime.now());
        Grinder grinder2 = new Grinder(LocalTime.now());
        Grinder grinder3 = new Grinder(LocalTime.now());

        try {
            grinder1.setToEnergySaveMode(61);
        } catch (IllegalArgumentException e) {
            System.out.println("Too many minutes");
        }

        try {
            grinder1.grind();
            grinder1.grind();
            grinder1.grind();
            grinder1.grind();
        } catch (GrinderNotCleanException e) {
            System.out.println(e.getMessage());
            grinder1.clean();
            System.out.println("Grinder on nüüd puhas!");
        }




//        System.out.println(grinder1.equals(grinder2));
//        System.out.println(grinder2.equals(grinder1));
//        System.out.println(grinder1.equals(grinder1));
//        System.out.println(grinder1.equals(grinder2));
//        System.out.println(grinder2.equals(grinder3));
//        System.out.println(grinder1.equals(grinder3));
//        System.out.println(grinder1.hashCode());
//        System.out.println(grinder2.hashCode());
//        System.out.println(grinder3.hashCode());


        try {
            grinder1.setBeanAmounts(60, 60);
        } catch (IllegalArgumentException e) {
            System.out.println("Too many beans");
        }


        System.out.println(grinder1.getBeansFromFirstContainer());
        System.out.println(grinder1.getBeansFromSecondContainer());


//        grinder.grind();
//        grinder.grind();
//        System.out.println(grinder.getGrindCount());
    }
}
