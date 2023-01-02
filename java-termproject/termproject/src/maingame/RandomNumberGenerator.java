package maingame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RandomNumberGenerator implements ObjectCollection {

	List<Integer> answer = new ArrayList<>();   

    void pickRandomNumber() {

        answer.clear();
        Random RANDOM = new Random();

        while (answer.size() < 3) {
        	// 1~9
            int randomNumber = RANDOM.nextInt(9) + 1;

            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
            }
        }
        
        System.out.println(answer);

    }

}