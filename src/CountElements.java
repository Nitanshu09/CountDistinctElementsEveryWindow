import java.util.*;

public class CountElements {

	public static ArrayList<Integer> countDistinct(int A[], int n, int k) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i <= n - k; i++) {
			int start = i;
			int end = start + k - 1;
			if (ret.isEmpty()) {
				while (start <= end) {
					map.put(A[start], map.getOrDefault(A[start], 0) + 1);
					start++;
				}
				ret.add(map.size());
			} else {
				map.put(A[end], map.getOrDefault(A[end], 0) + 1);
				if (map.get(A[start - 1]) == 1) {
					map.remove(A[start - 1]);
				} else {
					map.put(A[start - 1], map.get(A[start - 1]) - 1);
				}
				ret.add(map.size());
			}
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
