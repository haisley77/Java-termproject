package maingame;


import javax.swing.JOptionPane;


class Play implements ObjectCollection  {

	void play(String input) {

		INPUT.enterUserInput(input);
		GAME.countBall();
		GAME.countStrike();
		GAME.try_count++;	
		   	
	}


	void checkRestart() {

		try {
			INPUT.enterUserCommand(JOptionPane.showInputDialog("Restart: 1 / End: 2"));
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "[ERROR] 1 OR 2", "ERROR", JOptionPane.ERROR_MESSAGE);
			checkRestart();
		}
		
		if (INPUT.user_command == 2) {
			System.exit(0);
		}
		if (INPUT.user_command == 1) {
			initializeForRestart();
		}
		
	}
	
	void initializeForRestart() {
		 
        GENERATOR.pickRandomNumber();
        GAME.try_count = 0;
        
    }

}


