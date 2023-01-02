package maingame;

interface ObjectCollection {

	RandomNumberGenerator GENERATOR = new RandomNumberGenerator();
	Calculater GAME = new Calculater();
	Output OUTPUT = new Output();
	Input INPUT = new Input();
	Play PLAY = new Play();

}