package demo100.service;

import demo100.persistence.ResultRepository;

public class Calculation {
	private ResultRepository repository;
	public Calculation(ResultRepository repository) {
		this.repository=repository;
	}
	public int addition(int a, int b) {
		int result=a+b;
		repository.save(result);
		return result;
	}
	public int multiplikation(int a, int b) {
		int result=a*b;
		repository.save(result);
		return result;
	}
}
