package Strings;
// You have been given a string 'STR' of words. You need to replace all the spaces between words with “@40”.
public class replaceString {
    static StringBuilder brute (StringBuilder str){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length() ;i++){
            if(str.charAt(i) == ' ' ){
                res.append("@40");
            }else{
                res.append(str.charAt(i));
            }
        }
        return res;
    }
    static StringBuilder inbuilt (StringBuilder str){
        for(int i=0;i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str.replace(i, i+1, "@40");
            }
        }
        return str;

    }
    static StringBuilder optimised(StringBuilder str){
        int n = str.length();
        int count =0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        int length = n + (count*2);
        for(int i =0;i<length - n;i++){
            str.append(' ');
        
        }

        int index = length-1;

        for(int i =n -1;i >=0 ;i--){
            if(str.charAt(i) == ' '){
                str.setCharAt(index, '0');
                str.setCharAt(index -1, '4');
                str.setCharAt(index-2, '@');
                index = index-3;
            }
            else{
                str.setCharAt(index, str.charAt(i));
                index--;
            }
        }
        return str;
    }

    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Sahil Santosh Ghadigaonkar");
        System.out.println(str.length());
        System.out.println(brute(str)+ " brute sol");
        System.out.println(inbuilt(str) + " inbuilt sol");
        System.out.println(optimised(str)+ " optimised sol");

    }
}
