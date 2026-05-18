
public class Pizza {

    String pizzaType;
    float price;
    int num = 1;

    Pizza(String pizzaType) {
        this.pizzaType = pizzaType.toLowerCase();
    }

    // pizza price
    void price() {
        if (pizzaType.equals("veg")) {
            price = 300f;
            System.out.println("Base veg pizze price : " + price + "Rs/-");
        }

        if ((pizzaType.equals("non-veg"))) {
            price = 400f;
            System.out.println("Base non-veg pizze price : " + price + "Rs/-");
        }
    }

    // addExtraCheese()
    void addExtraCheese() {
        price += 100f;
        System.out.println("Adding  Extra Cheese of 100rs.");
    }

    // addExtraToppings()
    void addExtraToppings() {
        price += 100f;
        System.out.println("Adding  Extra Toppings of 100rs.");
    }

    // takeAway()
    void takeAway() {
        price += 20f;
        System.out.println("Take Away(Carry Bag) of 20rs");
    }

    // bill calculation
    void calculateBill() {
        System.out.println("Total price of pizza : " + price + "Rs/-");
    }

    // printing bill
    void PrintBill() {
        System.out.println("=========Bill==========");
        System.out.println("Purnia Pizza wala");
        System.out.println("Type of pizza : " + pizzaType + ".");
        System.out.println("Total price : " + price + "Rs/-");
        System.out.println("Thank you !!");
         System.out.println("=========Bill==========");
    }
}