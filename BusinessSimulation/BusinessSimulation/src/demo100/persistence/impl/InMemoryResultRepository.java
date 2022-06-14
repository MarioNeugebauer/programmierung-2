package demo100.persistence.impl;

import java.util.ArrayList;
import java.util.List;

import demo100.persistence.ResultRepository;

public class InMemoryResultRepository implements ResultRepository {

	private List<Integer> resultArrayListInt = new ArrayList<Integer>();
	
	@Override
	public void save(Integer intResult) {
		resultArrayListInt.add(intResult);
	}
	
	public List<Integer> getIntResults() {
		return resultArrayListInt;
	}

}
