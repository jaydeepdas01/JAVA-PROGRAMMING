public class ConcatenateWords {
    public static void main(String[] args) {
        String[] str ={"Jay", "deep"," Das"};
        System.out.println("concatenate : " + concate(str));
    }

 static String concate(String... word){
    String result = "";

    for(int i =0 ; i<word.length; i++){
        result = result + word[i];
    }

    return result;
 }
}
