package SDETCodingPractice;
public class UpperToLowerString {

    public static void main(String[] args) {
        String str = "My Name is Akshay Kinhikar";
        String newStr = "";
        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i] == ' '){
                newStr = newStr + arr[i];
            }else if(arr[i] >= 'a' && arr[i]<='z'){
                newStr = newStr + Character.toUpperCase(arr[i]);

            }else if(arr[i] >= 'A' && arr[i]<='Z'){
                newStr = newStr + Character.toLowerCase(arr[i]);
            }
        }

        System.out.println(newStr);
    }

}
