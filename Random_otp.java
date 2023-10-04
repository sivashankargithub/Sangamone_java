package sangamone_pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Random_otp {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String otp="";
            for (int j = 0; j < 8 ; j++) {
                otp += random.nextInt(10);
            }
            list1.add(otp);
        }
        System.out.println(list1);
    }

}
