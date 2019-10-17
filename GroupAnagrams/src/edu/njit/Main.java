package edu.njit;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Main sol = new Main();
	    sol.groupAnagrams(new String[] {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Set<String> processed = new HashSet<String>();
        List<List<String>> result = new ArrayList<List<String>>();
        for(int i = 0; i < strs.length; i++) {
            List<String> anagrams = null;
            for(int j = i; j < strs.length; j++) {
                if(!processed.contains(strs[j]) && isAnagram(strs[i], strs[j])) {
                    if(anagrams == null) {
                        anagrams = new ArrayList<String>();
                    }
                    anagrams.add(strs[j]);
                }
            }
            if(anagrams != null) {
                for(String item : anagrams) {
                    processed.add(item);
                }
                result.add(anagrams);
            }
        }
        return result;
    }

    private boolean isAnagram(String base, String target) {
        if(base.length() != target.length()) {
            return false;
        }
        char[] baseChar = base.toCharArray(), targetChar = target.toCharArray();
        Arrays.sort(baseChar);
        Arrays.sort(targetChar);
        for(int i = 0; i < base.length(); i++) {
            if(baseChar[i] != targetChar[i]) {
                return false;
            }
        }
        return true;
    }
}
