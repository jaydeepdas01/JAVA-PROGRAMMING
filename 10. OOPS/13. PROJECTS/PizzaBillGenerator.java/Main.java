public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza("veg");
        Pizza a = new Pizza("non-veg");

        System.out.println("Base Pizza : ");
        p.price();
        p.addExtraCheese();
        p.addExtraToppings();
        p.takeAway();
        p.calculateBill();
        p.PrintBill();

        System.out.println("Deluxe Pizza : ");
        // Dulex pizz
        Pizza p2 = new DeluxePizza("non-veg");
        p2.price();
        p2.takeAway();
        p2.calculateBill();
        p2.PrintBill();

    }
}
