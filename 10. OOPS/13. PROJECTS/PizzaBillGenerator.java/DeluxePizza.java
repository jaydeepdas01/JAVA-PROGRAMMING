public class DeluxePizza extends Pizza {
    String pizzaType;
    float price;
    int num = 1;

    DeluxePizza(String pizzaType) {
        super(pizzaType.toLowerCase());
        this.pizzaType = pizzaType.toLowerCase();
    }

    // pizza price
    @Override
    void price() {
        if (pizzaType.equals("veg")) {
            price = 670f;
            System.out.println("Deluxe veg pizze price : " + price + "Rs/-");
        }

        if ((pizzaType.equals("non-veg"))) {
            price = 750f;
            System.out.println("duluxe non-veg pizze price : " + price + "Rs/-");
        }
    }

    // take away
    @Override
    void takeAway() {
        price += 20f;
        System.out.println("Take Away(Carry Bag) of 20rs");
    }

    // total bill
    @Override
    void calculateBill() {
        System.out.println("Total price of pizza : " + price + "Rs/-");
    }

    @Override
    void PrintBill() {
        System.out.println("=========Bill==========");
        System.out.println("Purnia Pizza wala");
        System.out.println("Type of pizza : " + pizzaType + ".");
        System.out.println("Total price : " + price + "Rs/-");
        System.out.println("Thank you !!");
        System.out.println("=========Bill==========");
    }

}
