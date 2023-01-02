package maingame;

class Calculater implements ObjectCollection {

	int ball = 0;
    int strike = 0;
    int try_count = 0;

	void countBall() {

        ball = 0;
        for (int num : INPUT.user_input) {
            if (isBall(num)) {
                ball++;
            }
        }

        addBallCountToResult();

    }
	
	private boolean isBall(int num) {

        return GENERATOR.answer.contains(num) 
        		&& GENERATOR.answer.indexOf(num) != INPUT.user_input.indexOf(num);

    }

	
	private void addBallCountToResult() {

		// per round
		OUTPUT.result = "";
		if (ball != 0) {
			OUTPUT.result += ball + " ball\n";
        }

	}

    
    void countStrike() {

        strike = 0;
        for (int num : INPUT.user_input) {
            if (isStrike(num)) {
                strike++;
            }
        }

        addStrikeCountToResult();
        addNothingCaseToResult();
        
        OUTPUT.printBallStrikeResult();

    }

    private boolean isStrike(int num) {

        return GENERATOR.answer.contains(num) 
        		&& GENERATOR.answer.indexOf(num) == INPUT.user_input.indexOf(num);

    }
    
    private void addStrikeCountToResult() {

		if (strike != 0) {
			OUTPUT.result += strike + " strike\n";
        }

	}

    private void addNothingCaseToResult() {

		if (ball == 0 && strike == 0) {
			OUTPUT.result += "nothing";
        }

	}
}