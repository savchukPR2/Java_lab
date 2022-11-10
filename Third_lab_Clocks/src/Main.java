public class Main {
    public static void main(String[] args) {
        System.out.println(java.time.LocalDateTime.now().getHour());

        System.out.println(" ");
        System.out.print("1) ");
        Watch watch_one = new Watch("Apple", 220);
        watch_one.printWatch();

        System.out.println(" ");
        System.out.print("2) ");
        Watch watch_two = new Watch("Rolex", 1300, 10, 36);
        watch_two.printWatch();

        System.out.println("Example of work: ");
        watch_two.actionTime(-5, +10);
        watch_two.printWatch();

        System.out.println(" ");
        System.out.print("3) ");
        Second_Watch second_watch_one = new Second_Watch("Apple", 450);
        second_watch_one.printWatch();

        System.out.println(" ");
        System.out.print("4) ");
        Second_Watch second_watch_two = new Second_Watch("Citizen", 12999, 22, 5, 36);
        second_watch_two.printWatch();
        System.out.print("Example of work: ");
        second_watch_two.setTime(Interface.Arrow.Hours, 2);
        second_watch_two.printWatch();

        System.out.println(" ");
        System.out.println("Watch Store:");
        Store Store = new Store();
        System.out.println("Biggest price: " + Store.getBiggestPrice());
        System.out.println("Most popular brand: " + Store.getMostPopularBrand());
        System.out.println("All brands:");
        Store.printAllBrands();
    }
}
