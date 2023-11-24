package com.sangamone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Covid19 {

	public static void main(String[] args) {
		List<String>cities=new ArrayList<>();
        List<Double>latitude1=new ArrayList<>();
        List<Double>longitude1=new ArrayList<>();
        List<Double>distance1=new ArrayList<>();
        cities.add("NewYork");
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Los Angeles");
        latitude1.add(40.7128);
        latitude1.add(41.8781);
        latitude1.add(39.7392);
        latitude1.add(34.0522);
        longitude1.add(74.0060);
        longitude1.add(87.6298);
        longitude1.add(104.9903);
        longitude1.add(118.2437);
       double  lat_pat=28.5383;
       double long_pat=81.3792;
       double temp1,temp2,temp3;
       for(int i=0;i<4;i++){
    	   temp1=Math.pow((latitude1.get(i)-lat_pat),2);
           temp2=Math.pow((longitude1.get(i)-long_pat),2);
           temp3=Math.pow(temp1+temp2, 0.5);
           distance1.add(temp3); 
       }
       System.out.println(distance1);
       double temp4=Collections.min(distance1);
       int position=distance1.indexOf(temp4);
       System.out.println(cities.get(position));
	}

}
