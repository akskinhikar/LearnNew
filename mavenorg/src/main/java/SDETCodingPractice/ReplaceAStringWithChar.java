import java.util.Arrays;

public class ReplaceAStringWithChar {

    public static void main(String[] args) {
        String str = "My Name is Akshay Kinhikar";

        char[] arr = str.toCharArray();

        char toBeReplaced = ' ';

        String newString = "";

        for(int i=0;i<arr.length;i++){
            if(arr[i] == toBeReplaced){
                arr[i]='*';
                newString=newString+arr[i];

            }else{
                newString=newString+arr[i];
            }
        }

        System.out.println(newString);

    }
}
