package assignment2;

import java.util.*;

public class DumbPasswords {
	
	
	public static void dumb(int m, int n) {
		List<String> ans = new ArrayList<String>();
		String str = new String();

		for (int i = 1; i <= m; i++) {
			str += i;
			for (int j = 1; j <= m; j++) {
				str += j;
				for (int k = 1; k <= n; k++) {
					str += String.valueOf((char)(96+k));
					for (int q = 1; q <= n; q++) {
						str += String.valueOf((char)(96+q));
						for (int p = Math.max(i,j)+1; p <= m; p++) {
							str += p;
							ans.add(str);
							str = str.substring(0, str.length()-1);
						}
						str = str.substring(0, str.length()-1);
					}
					str = str.substring(0, str.length()-1);
				}
				str = str.substring(0, str.length()-1);
			}
			str = str.substring(0, str.length()-1);
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		dumb(3,1);
		
	}
	
	
	
}
