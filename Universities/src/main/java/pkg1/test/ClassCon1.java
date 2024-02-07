package pkg1.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassCon1 {
	@Autowired
	InterRepo1 ir1;
	
	@PostMapping("/test1")
	public ClassEntity m1(@RequestBody ClassEntity ce) {
		ir1.save(ce);
		return ce;
	}
}
