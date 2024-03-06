package pkg1.univ1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivCon {
	@GetMapping("/")
	public List<String> getuniv()throws Exception{
		List<String> list1=new ArrayList<>();
		File f1 = new File("univIndia.txt");
		Scanner sc1= new Scanner(f1);
		while(sc1.hasNext()) {
			String str1=sc1.nextLine();
			list1.add(str1);
		}
		return list1;
	}
	
	@Autowired
	UnivRepo univRepo;
	
	@PostMapping("/adduniv")
	public String adduniv() throws Exception{
		List<String> list1=new ArrayList<>();
		list1=getuniv();
		List<UnivEntity> records = new ArrayList<>();
		for(int i=0;i<list1.size();i++) {
			records = list1.get(i).lines().map(data -> new UnivEntity(data)).collect(Collectors.toList());
			univRepo.saveAll(records);
		}
		return "inserted successfully";
	}
	
	@PostMapping("/adduniv2")
	public String adduniv2(@RequestBody UnivEntity univEntity) {
		univRepo.save(univEntity);
		return "imported succesfully";
	}
	
}
