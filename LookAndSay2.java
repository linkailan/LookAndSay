import java.util.Scanner;

public class LookAndSay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int input = in.nextInt();

		if (input == 1) {
			System.out.println("1");
		}
		if (input == 2) {
			System.out.println("11");
		}

		String str = "11";

		for (int i = input; i < input + 10; i++) {

			str += '$';
			int len = str.length();
			int count = 1;
			String tmp = "";

			char[] arr = str.toCharArray();

			for (int j = 1; j < len; j++) {

				if (arr[j] != arr[j - 1]) {
					tmp += count + 0;
					tmp += arr[j - 1];
					count = 1;
				} else {
					count++;
				}

				str = tmp;
			}

			System.out.println(str);

		}

	}

}
