import java.util.*;

public class CountElements {

	public static ArrayList<Integer> countDistinct(int A[], int n, int k) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i <= n - k; i++) {
			int count = 0;
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = i; j < i + k; j++) {
				if (temp.isEmpty()) {
					temp.add(A[j]);
					count++;
				} else if (!temp.contains(A[j])) {
					temp.add(A[j]);
					count++;
				}
			}
			ret.add(count);
		}
		return ret;
	}

	public static void main(String[] args) {
		int N = 7;
		int K = 4;
		int A[] = { 1, 2, 1, 3, 4, 2, 3 };
		ArrayList<Integer> ret = countDistinct(A, N, K);
		System.out.println(ret);
	}

}
