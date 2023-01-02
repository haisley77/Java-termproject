package maingame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Input implements ObjectCollection {

	List<Integer> user_input = new ArrayList<>();
	String error_message = "[ERROR] Try again";
	int user_command = 0;

	void enterUserInput(String input_number) {
		// initialize user_input
		user_input.clear();

        // make an user_input list
        for (int i = 0; i < input_number.length(); i++) {
            user_input.add(input_number.charAt(i)-'0');
        }
        
        checkUserInputException();

    }
	
	// throw an exception
	private void checkUserInputException() {

        Set<Integer> set = new HashSet<>(user_input);
        
        if (isErrorCase(set)) {
            OUTPUT.printErrorMessage();
            throw new IllegalArgumentException();
        }

	}
	
	// exception case
	private boolean isErrorCase(Set<Integer> set) {
		
		if (user_input.size()!=3) {
			return true;
		}
		
		if (user_input.contains(0)) {
			return true;
		}
		
		if (set.size() != 3) {
			return true;
		}
		
		for (Integer c:user_input) {
			if (c < 1 || c > 9) {
				return true;
			}
		}
 
		return false;
	}


	void enterUserCommand(String command) {

        user_command = Integer.parseInt(command);
        
        checkCommandException();
        
    }

	private void checkCommandException() {

		if (user_command != 1 && user_command != 2) {
			throw new IllegalArgumentException();
		}

	}
	

}