public class App {
	/* 
		Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.

		scoresIncreasing([1, 3, 4]) → true
		scoresIncreasing([1, 3, 2]) → false
		scoresIncreasing([1, 1, 4]) → true
	*/
	public static boolean scoresIncreasing(int[] scores) {
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < scores[i-1])
			return false;
		}
	
		return true;
	}

	public static void main(String[] args) {
		int[] scores1 = {1, 3, 4};
		System.out.println(scoresIncreasing(scores1) == true);
		int[] scores2 = {1, 3, 2};
		System.out.println(scoresIncreasing(scores2) == false);
		int[] scores3 = {1, 1, 4};
		System.out.println(scoresIncreasing(scores3) == true);

		int[] scores4 = {1, 1, 2, 4, 4, 7};
		System.out.println(scoresIncreasing(scores4) == true);
		int[] scores5 = {1, 1, 2, 4, 3, 7};
		System.out.println(scoresIncreasing(scores5) == false);
		int[] scores6 = {-5, 4, 11};
		System.out.println(scoresIncreasing(scores6) == true);
	}
}