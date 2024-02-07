package pkg1.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		List<Integer>list1=Arrays.asList(2,6,4,10,6,2,8);
		List<Integer>list2=new ArrayList<>();
		list2.addAll(list1);
		System.out.println(list1+" Normal list");
		
		list2=list1.stream().distinct().collect(Collectors.toList());//distinct will remove duplicates
		System.out.println(list2+" Remove Duplicates");
		
		list2=list1.stream().sorted((n1,n2) -> n2.compareTo(n1)).distinct().collect(Collectors.toList());//reverse sort
		System.out.println(list2+" Reverse Sort");
		
		list2=list1.stream().sorted((n1,n2) -> n1.compareTo(n2)).distinct().collect(Collectors.toList());//sort
		System.out.println(list2+" Sort");
	}
}
