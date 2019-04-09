package spacedIntegers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SpacedIntegers extends HashSet<Integer>{
	
	HashSet<Integer> set;
	private int minDistance;
	
	SpacedIntegers(int minDistance){
		if(minDistance <= 0) {
			throw new IllegalArgumentException();
		}
		set = new HashSet<Integer>();
		
	}
	
	public boolean add(Integer newElement) {
		//ArrayList<Integer> list = new ArrayList<Integer>(set);
		///Collections.sort(list); //sort hash set
		boolean value = true;
		if(this.isEmpty()) {
			this.add(newElement);
			value = true;
		}
		else if((Math.abs(/*oldElement*/ - newElement) < minDistance) {
			value = false;
		}else {
			set.add(newElement);
		}
		
		
		return value;
		
	}
	
	public boolean addAll(Collection<? extends Integer> collection) {
		
		return this.addAll(collection);
		
		
	}
	
	public int getCurrentMinDistance() {
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list); //sort hash set
		//biggest numbers at the top
		int res = list.get(0) - list.get(1);
		return res;
	}


	
	
	

}
