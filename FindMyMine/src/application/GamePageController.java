package application;

import java.awt.Toolkit;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class GamePageController implements Initializable {
	@FXML
	Button b1;

	@FXML
	Button b2;

	@FXML
	Button b3;

	@FXML
	Button b4;

	@FXML
	Button b5;

	@FXML
	Button b6;

	@FXML
	Button b11;

	@FXML
	Button b21;

	@FXML
	Button b31;

	@FXML
	Button b41;

	@FXML
	Button b51;

	@FXML
	Button b61;

	@FXML
	Button b12;

	@FXML
	Button b22;

	@FXML
	Button b32;

	@FXML
	Button b42;

	@FXML
	Button b52;

	@FXML
	Button b62;

	@FXML
	Button b13;

	@FXML
	Button b23;

	@FXML
	Button b33;

	@FXML
	Button b43;

	@FXML
	Button b53;

	@FXML
	Button b63;

	@FXML
	Button b14;

	@FXML
	Button b24;

	@FXML
	Button b34;

	@FXML
	Button b44;

	@FXML
	Button b54;

	@FXML
	Button b64;

	@FXML
	Button b15;

	@FXML
	Button b25;

	@FXML
	Button b35;

	@FXML
	Button b45;

	@FXML
	Button b55;

	@FXML
	Button b65;
	@FXML
	private Pane player1Pane;

	@FXML
	private Label player1;

	@FXML
	private Label score1;

	@FXML
	private Pane player2Pane;

	@FXML
	private Label player2;

	@FXML
	private Label score2;

	@FXML
	private Pane player3Pane;

	@FXML
	private Label player3;

	@FXML
	private Label score3;

	@FXML
	private Pane player4Pane;

	@FXML
	private Label player4;

	@FXML
	private Label score4;

	@FXML
	private Pane player5Pane;

	@FXML
	private Label player5;

	@FXML
	private Label score5;

	@FXML
	private Pane player6Pane;

	@FXML
	private Label player6;

	@FXML
	private Label score6;

	@FXML
	private Pane player7Pane;

	@FXML
	private Label player7;

	@FXML
	private Label score7;

	@FXML
	private Pane player8Pane;

	@FXML
	private Label player8;

	@FXML
	private Label score8;

	@FXML
	private Pane player9Pane;

	@FXML
	private Label player9;

	@FXML
	private Label score9;

	@FXML
	private Pane player10Pane;

	@FXML
	private Label player10;

	@FXML
	private Label score10;

	@FXML
	private Label showtime;

	@FXML
	private Label bombLeft;

	int numOfPlayer; // how many player

	Button[][] setOfButton = new Button[6][6];
	Pane[] setOfPlayer = new Pane[10]; // limit player :10
	int[] scoreOfPlayer = new int[10];
	Label[] setOfScore = new Label[10];
	int numBombLeft =11;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		numOfPlayer = 4; // get from how many client that ready

		// put each pane into setOfPlayer
		setOfPlayer[0] = player1Pane;
		setOfPlayer[1] = player2Pane;
		setOfPlayer[2] = player3Pane;
		setOfPlayer[3] = player4Pane;
		setOfPlayer[4] = player5Pane;
		setOfPlayer[5] = player6Pane;
		setOfPlayer[6] = player7Pane;
		setOfPlayer[7] = player8Pane;
		setOfPlayer[8] = player9Pane;
		setOfPlayer[9] = player10Pane;

		// to hide who does not play
		for (int i = numOfPlayer; i < 10; i++) {
			setOfPlayer[i].setVisible(false);
		}

		scoreOfPlayer[0] = 0;
		scoreOfPlayer[1] = 0;
		scoreOfPlayer[2] = 0;
		scoreOfPlayer[3] = 0;
		scoreOfPlayer[4] = 0;
		scoreOfPlayer[5] = 0;
		scoreOfPlayer[6] = 0;
		scoreOfPlayer[7] = 0;
		scoreOfPlayer[8] = 0;
		scoreOfPlayer[9] = 0;

		setOfScore[0] = score1;
		setOfScore[1] = score2;
		setOfScore[2] = score3;
		setOfScore[3] = score4;
		setOfScore[4] = score5;
		setOfScore[5] = score6;
		setOfScore[6] = score7;
		setOfScore[7] = score8;
		setOfScore[8] = score9;
		setOfScore[9] = score10;

		// TODO Auto-generated method stub
		setOfButton[0][0] = b1;
		setOfButton[0][1] = b2;
		setOfButton[0][2] = b3;
		setOfButton[0][3] = b4;
		setOfButton[0][4] = b5;
		setOfButton[0][5] = b6;
		setOfButton[1][0] = b11;
		setOfButton[1][1] = b21;
		setOfButton[1][2] = b31;
		setOfButton[1][3] = b41;
		setOfButton[1][4] = b51;
		setOfButton[1][5] = b61;
		setOfButton[2][0] = b12;
		setOfButton[2][1] = b22;
		setOfButton[2][2] = b32;
		setOfButton[2][3] = b42;
		setOfButton[2][4] = b52;
		setOfButton[2][5] = b62;
		setOfButton[3][0] = b13;
		setOfButton[3][1] = b23;
		setOfButton[3][2] = b33;
		setOfButton[3][3] = b43;
		setOfButton[3][4] = b53;
		setOfButton[3][5] = b63;
		setOfButton[4][0] = b14;
		setOfButton[4][1] = b24;
		setOfButton[4][2] = b34;
		setOfButton[4][3] = b44;
		setOfButton[4][4] = b54;
		setOfButton[4][5] = b64;
		setOfButton[5][0] = b15;
		setOfButton[5][1] = b25;
		setOfButton[5][2] = b35;
		setOfButton[5][3] = b45;
		setOfButton[5][4] = b55;
		setOfButton[5][5] = b65;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int result = StartPageController.getValueOfSpace(i, j);
				Button y = setOfButton[i][j];
				if (result == 0) {
					y.setStyle("-fx-font-size: 0.3"); // blank
				}
				if (result == 1) {
					y.setStyle("-fx-font-size: 0.1"); // bomb
				}

			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int numOfBombAround = StartPageController.getNumBombAround(i, j);
				if (numOfBombAround > 0) {
					setOfButton[i][j].setText("" + numOfBombAround);
				}
			}
		}

	}

	private int player = 0;

	@FXML
	void play(MouseEvent event) {

		Button y = (Button) event.getTarget();

		if (y.getStyle() == "-fx-font-size: 0.3") {// free slot
			((Button) event.getTarget()).setStyle("-fx-font-size: 10");
			((Button) event.getTarget()).setStyle("-fx-background-color:#cccccc");
			((Button) event.getTarget()).setDisable(true);
			player++;

		}

		if (y.getStyle() == "-fx-font-size: 0.1") {// bomb
			((Button) event.getTarget()).setStyle("-fx-font-size: 10");
			((Button) event.getTarget()).setText("bomb");
			((Button) event.getTarget()).setDisable(true);
			numBombLeft--;
			bombLeft.setText(numBombLeft+"");
			scoreOfPlayer[player]++;
			int score = scoreOfPlayer[player];
			setOfScore[player].setText(score + "");
			player++;

		}

		if (player == numOfPlayer) {
			player = 0;
		}

	}
}
