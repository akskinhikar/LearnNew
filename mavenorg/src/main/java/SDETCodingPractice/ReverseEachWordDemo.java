package SDETCodingPractice;

public class ReverseEachWordDemo {

	public static void main(String[] args) {

		String str = "My name is Akshay Kinhikar";
		String newString = "";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			char[] newStr = arr[i].toCharArray();
			String reversWord = "";

			for (int j = newStr.length - 1; j >= 0; j--) {
				
				reversWord = reversWord + newStr[j];

			}
			newString = newString + reversWord + " ";

		}

		System.out.println("Orignal string = "+str);
		System.out.println("String with reverse word = "+newString);

	}

}
