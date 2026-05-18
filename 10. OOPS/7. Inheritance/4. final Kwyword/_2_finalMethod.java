class Country {
    final void show() {
        System.out.println("I am country.");
    }
}

class State extends Country {
    void show() { // final method can not be override. showing error if you execute.
        System.out.println("I am state.");
    }

}

public class _2_finalMethod {
    public static void main(String[] args) {

    }

}
