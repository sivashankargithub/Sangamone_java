package sangamone_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Offset {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the message: ");
			String name1=sc.nextLine();
			System.out.println("Enter offset value: ");
			int offset=sc.nextInt();
			List<String> code=encrypt1(name1,offset);
			System.out.println("Encrypted code:"+code);
			List<String> mcode=code;
			String k[]=mcode.toArray(new String[mcode.size()]);
			for(String str : k)
			{
				System.out.println("Decrypted message is:"+decrypt1(str,offset));
			}
		}
	}
	public static List<String> encrypt1(String word1, int off1)
	{
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		List<String> list3=new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");
		list1.add("I");
		list1.add("J");
		list1.add("K");
		list1.add("L");
		list1.add("M");
		list1.add("N");
		list1.add("O");
		list1.add("P");
		list1.add("Q");
		list1.add("R");
		list1.add("S");
		list1.add("T");
		list1.add("U");
		list1.add("V");
		list1.add("W");
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		list1.add("j");
		list1.add("k");
		list1.add("l");
		list1.add("m");
		list1.add("n");
		list1.add("o");
		list1.add("p");
		list1.add("q");
		list1.add("r");
		list1.add("s");
		list1.add("t");
		list1.add("u");
		list1.add("v");
		list1.add("w");
		list1.add("x");
		list1.add("y");
		list1.add("z");
		list1.add(" ");
		
		list2.add("01");
		list2.add("02");
		list2.add("03");
		list2.add("04");
		list2.add("05");
		list2.add("06");
		list2.add("07");
		list2.add("08");
		list2.add("09");
		list2.add("10");
		list2.add("11");
		list2.add("12");
		list2.add("13");
		list2.add("14");
		list2.add("15");
		list2.add("16");
		list2.add("17");
		list2.add("18");
		list2.add("19");
		list2.add("20");
		list2.add("21");
		list2.add("22");
		list2.add("23");
		list2.add("24");
		list2.add("25");
		list2.add("26");
		list2.add("27");
		list2.add("28");
		list2.add("29");
		list2.add("30");
		list2.add("31");
		list2.add("32");
		list2.add("33");
		list2.add("34");
		list2.add("35");
		list2.add("36");
		list2.add("37");
		list2.add("38");
		list2.add("39");
		list2.add("40");
		list2.add("41");
		list2.add("42");
		list2.add("43");
		list2.add("44");
		list2.add("45");
		list2.add("46");
		list2.add("47");
		list2.add("48");
		list2.add("49");
		list2.add("50");
		list2.add("51");
		list2.add("52");
		list2.add("53");
		
		String name=word1;
		int offset=off1;
		int len1 = name.length();
		//System.out.println(len1);
		String result="";
		
		for(int i=0;i<len1;i++) 
		{
			String temp1=name.substring(i,i+1);//getting element in name
			//System.out.println(temp1);
			int position=list1.indexOf(temp1);
			position=position+offset;
			if(position>52)
			{
				position=position-53;
			}
			//getting the position of element in list 1
			//System.out.println(position);
			String temp2=list2.get(position);//getting what element is there in list2 at position
			//System.out.println(temp2);
			result=result+temp2;
			
			
		}
		list3.add(result);
		return list3;	
			
	}
	public static List<String> decrypt1(String ec, int off2)
	{
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		List<String> list3=new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");
		list1.add("I");
		list1.add("J");
		list1.add("K");
		list1.add("L");
		list1.add("M");
		list1.add("N");
		list1.add("O");
		list1.add("P");
		list1.add("Q");
		list1.add("R");
		list1.add("S");
		list1.add("T");
		list1.add("U");
		list1.add("V");
		list1.add("W");
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		list1.add("j");
		list1.add("k");
		list1.add("l");
		list1.add("m");
		list1.add("n");
		list1.add("o");
		list1.add("p");
		list1.add("q");
		list1.add("r");
		list1.add("s");
		list1.add("t");
		list1.add("u");
		list1.add("v");
		list1.add("w");
		list1.add("x");
		list1.add("y");
		list1.add("z");
		list1.add(" ");
		
		list2.add("01");
		list2.add("02");
		list2.add("03");
		list2.add("04");
		list2.add("05");
		list2.add("06");
		list2.add("07");
		list2.add("08");
		list2.add("09");
		list2.add("10");
		list2.add("11");
		list2.add("12");
		list2.add("13");
		list2.add("14");
		list2.add("15");
		list2.add("16");
		list2.add("17");
		list2.add("18");
		list2.add("19");
		list2.add("20");
		list2.add("21");
		list2.add("22");
		list2.add("23");
		list2.add("24");
		list2.add("25");
		list2.add("26");
		list2.add("27");
		list2.add("28");
		list2.add("29");
		list2.add("30");
		list2.add("31");
		list2.add("32");
		list2.add("33");
		list2.add("34");
		list2.add("35");
		list2.add("36");
		list2.add("37");
		list2.add("38");
		list2.add("39");
		list2.add("40");
		list2.add("41");
		list2.add("42");
		list2.add("43");
		list2.add("44");
		list2.add("45");
		list2.add("46");
		list2.add("47");
		list2.add("48");
		list2.add("49");
		list2.add("50");
		list2.add("51");
		list2.add("52");
		list2.add("53");
		
		String code=ec;
		int offset=off2;
		int len2=code.length();
		String result2="";
		for (int i=0;i<len2;i+=2)
		{
			String temp1=code.substring(i,i+2);
			//System.out.println(temp1);
			int position = list2.indexOf(temp1);
			position=position-offset;
			if(position<0)
			{
				position=position+53;
			}
			String temp2=list1.get(position);
			result2=result2+temp2;
		}
		list3.add(result2);
		return list3;
	}

}
