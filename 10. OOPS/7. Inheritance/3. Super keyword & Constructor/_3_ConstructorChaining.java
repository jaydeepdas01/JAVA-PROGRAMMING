/* constructor execution order
parent class -> child class -> next child class of that child class. */


class India{
    India(){
        System.out.println("I am India(Conuntry)");
    }
}

class Bihar extends India{
Bihar(){ //super() called automatically due to default constructor.
    System.out.println("I am Bihar(State.)");
}
}

class Purnea extends Bihar{
    Purnea(){
        System.out.println("I am Purnea(district)");
    }
}


public class _3_ConstructorChaining {
    public static void main(String[] args){
        Purnea address = new Purnea();// constructor execution order India -> Bihar -> Purnea.

    }
}
