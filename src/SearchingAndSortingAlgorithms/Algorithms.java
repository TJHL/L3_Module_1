package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String bio = eggs.get(i);
			if(bio=="cracked") {
				return i;
			}
		}
		 return 0;
	}
	public static int countPearls(List<Boolean>oysters) {
		int a=0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				a=a+1;
			}
		}
		return a;
	}
	public static double findTallest(List<Double>peeps) {
		double a=0;
		for (int i = 0; i < peeps.size(); i++) {
		if(a<peeps.get(i)){
			a=peeps.get(i);
			}
		}
		return a;
	}
	public static String findLongestWord(List<String>words) {
		int a=0;
		String b="";
		for (int i = 0; i < words.size(); i++) {
		if(words.get(i).length()>a) {
			a=words.get(i).length();
			b=words.get(i);
		}
		}
		return b;
	}
	public static boolean containsSOS(List<String>message1) {
		for (int i = 0; i < message1.size(); i++) {
		if(message1.get(i).equals(" ... --- ... ")) {
			return true;
		}
		}
		return false;
		
	}
	public static double sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for(int j = i+1;j<results.size();j++) {
				if(results.get(i)>results.get(j)){
					double temp = results.get(i);
					results.set(i,results.get(j));
					results.set(j, temp);
				}
			}

		}
		
		return temp();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}