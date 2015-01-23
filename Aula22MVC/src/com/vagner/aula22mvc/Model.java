package com.vagner.aula22mvc;

public class Model {

	public int[] intArray = new int[5];
	public int index = 0;
	public MainActivity delegate = null;
	
	public void setDelegate(MainActivity d) {
		delegate = d;
	}
	
	public float getAverage() {//da a media
		float average = 0;
		int count = 0;
		for (int num : intArray) {
			average += num;
			count ++;
		}
		return average / count;
	}
	
	public void addToArray(int element) {//adiciona ao Array
		intArray[index] = element;
		index++;
		if (index == 5) {
			delegate.arrayIsFull();
			index = 0;
		}
	}
}
