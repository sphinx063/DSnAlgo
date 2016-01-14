package recursion;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

	public List<String> doAnagram(String s){
		List<String> res = new ArrayList<String>();
		if(s.length() == 1)
			res.add(s);
		else{
			String last = s.substring(s.length()-1);
			String first = s.substring(0,s.length()-1);
			res =merge(doAnagram(first),last);
		}
		return res;
	}
	List<String> merge(List<String> list,String last){
		List<String> res = new ArrayList<String>();
		for(String st :list){
			for(int i = 0;i<=st.length();i++){
				String p = new StringBuffer(st).insert(i,last).toString();
				res.add(p);
			}
		}
		return res;

	}

}
