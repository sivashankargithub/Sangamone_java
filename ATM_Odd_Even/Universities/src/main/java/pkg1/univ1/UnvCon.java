package pkg1.univ1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnvCon {
	public List<String> loadData(String fname) throws Exception{
		List<String>list1=new ArrayList<>();
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		return list1;
	}
	
	@GetMapping("/getUniv")
	public List<String>getUniv() throws Exception{
		return loadData("univIndia.txt");
	}
	
	@Autowired
	UnivRepo univRepo;
	
	@PostMapping("/addUniv")
	public String addUniv() throws Exception {
		List<String>list1=new ArrayList<>();
		list1=loadData("univIndia.txt");
		
		List<UnivEntity>records=new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			records.add(new UnivEntity(list1.get(i)));
			univRepo.saveAll(records);
		}
		
		return "inserted successfully";
		
	}
}
