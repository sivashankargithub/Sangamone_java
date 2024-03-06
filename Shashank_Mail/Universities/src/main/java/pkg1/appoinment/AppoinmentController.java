package pkg1.appoinment;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppoinmentController {
	public static List<ObjectModel> loadData() throws Exception{
		List<ObjectModel> data = new ArrayList<>();
		File f1 = new File("1.txt");
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNext()) {
			String[] arr1 = sc1.nextLine().split(",");
			data.add(new ObjectModel(arr1[0], arr1[1], arr1[2], arr1[3],arr1[4]));
		}
		return data;
	}
	@GetMapping("/showAllMessages")
	public List<String> method1() throws Exception {
		List<ObjectModel> data = new ArrayList<>();
		List<String> msg = new ArrayList<>();
		data=loadData();
		String template1 = "";
		String s1 = "";
		
		template1 = "Dear $name,  You have been appointed as Centre Head at $location with salary $salary.  Please report for duty on $date";
		for(int i=0;i<data.size();i++) {
			s1=template1.replace("$name", data.get(i).getData()[0]).replace("$salary", data.get(i).getData()[1]).replace("$location", data.get(i).getData()[2]).replace("$date",data.get(i).getData()[3]);
			msg.add(s1);
		}	
		return msg;
	}
	

}
