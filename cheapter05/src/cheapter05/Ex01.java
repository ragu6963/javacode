package cheapter05;

public class Ex01 {
	public static void main(String[] args) {
		int intArr1[];
		int intArr2[];
		int[] intArr3[] = { { 0, 0 }, { 1, 1 } };
		String[] names = { "가나다", "라마바", "사아자" };
		String[] names1;
		names1 = new String[] { "하하하", "호호호", "후후후" };
		String[] names2 = new String[10];
		for(int i = 0 ; i < names1.length ;i++) {
			System.out.println(names1[i]);
		}
	}
}
