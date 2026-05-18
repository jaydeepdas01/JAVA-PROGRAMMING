class Example{
    private String name ="My name is Jaydeep Das";

    //Read only property means there is only getter not setter , variable data already set.
    //variable can access but not modify.
    public String getName() {
        return name;
    }

    
}

public class _3_ReadOnlyProperty {
    public static void main(String[] args) {
        Example E1 = new Example();
        //we can not set new name cause there is no any setter.
        System.out.println(E1.getName());
    }
}
