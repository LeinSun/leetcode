package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(l.lengthOfLongestSubstring("abcadcac"));
	}
	
	public int lengthOfLongestSubstring(String s) {
		
		int n = s.length(), ans = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0,j=0; i < n && j < n; ) {
			if (!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				i++;
				ans = Math.max(ans, i-j);
			}
			else {
				set.remove(s.charAt(j));	
				j ++ ;
			}
		}
        return ans;
        
    }
	
	//best solution
	public int lengthOfLongestSubstring2(String s) {
		
		int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
        
    }

}
