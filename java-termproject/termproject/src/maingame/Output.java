package maingame;

import javax.swing.JOptionPane;

class Output extends Play implements ObjectCollection {
	
	// result for balls & strikes
	String result = "";

	void printGameSuccessMessage() {

		JOptionPane.showMessageDialog(null, "[SUCCESS]");

	}

	void printGameFailMessage() {

		JOptionPane.showMessageDialog(null, "[FAIL]");

	}
	
	void printBallStrikeResult() {
		
		JOptionPane.showMessageDialog(null, result);
	}

	void printErrorMessage() {

		JOptionPane.showMessageDialog(null, INPUT.error_message,"ERROR", JOptionPane.ERROR_MESSAGE);

	}

	

}