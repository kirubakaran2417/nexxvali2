package task;

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode {

	public static ArrayList<Integer> mergedarraylist(ArrayList<Integer> list1,ArrayList<Integer>list2) {
		list1.addAll(list2);//merged two array list
		Collections.sort(list1);//sorted the merged list
		ArrayList<Integer> answer=new ArrayList<Integer>();
		answer.add(list1.get(2));
		answer.add(list1.get(6));
		answer.add(list1.get(8));
		return answer;
		
	}
}
