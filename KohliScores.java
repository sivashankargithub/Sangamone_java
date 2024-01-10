package com.sangamone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KohliScores {

	public static void main(String[] args) {
		List<Integer>score=new ArrayList<>();
		score.add(77);
		score.add(57);
		score.add(127);
		score.add(32);
		List<Integer>list1=score.stream().filter(n -> n>=100).collect(Collectors.toList());
		System.out.println("Virat Hundreds : "+list1);
		

	}

}
