package Strings;

public class reverseString {
    static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        String [] temp = str.split( " ");
        for (int i =temp.length-1;i>=0 ; i--) {
            if(!temp[i].equals("")){
                sb = sb.append(temp[i]).append(" ");
            }else if( i ==0){
                sb.append(temp[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "I am Sahil          Ghadigaonkar";
        System.out.println(reverse(str));
    }
}
