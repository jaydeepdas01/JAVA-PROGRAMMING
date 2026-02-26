public class StringMethod {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = ",World.";
        String s3 = "Java";

        String concate = s1.concat(s2); //add two string.
        System.out.println(concate);

        boolean equal = s1.equals("Hello");// check value equal or not.return type is boolean
        // can not ignore upper or lower case.
        System.out.println(equal); 

        boolean equalIgnore = "hello".equalsIgnoreCase(s1);//ignore case,
        System.out.println(equalIgnore);

        System.out.println(s1.length()); //.length() use to cound length of string.

        System.out.println(s1.charAt(0));// show value in given index

        //show index of particular char, or show 1st occurance char index of the given substring.
        System.out.println(s1.indexOf('H'));
        System.out.println(s1.indexOf("el"));


    }
}
