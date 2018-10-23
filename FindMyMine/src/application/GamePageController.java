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
    private Label player1;

    @FXML
    private Label score1;

    @FXML
    private Label player2;

    @FXML
    private Label score2;

    @FXML
    private Label player3;

    @FXML
    private Label score3;

    @FXML
    private Label player4;

    @FXML
    private Label score4;


	@FXML
	private Label showtime;

	Button[][] setOfButton = new Button[6][6];

	@FXML
	void play(MouseEvent event) {

		Button y = (Button) event.getTarget();

		if (y.getStyle() == "-fx-font-size: 0.3") {// free slot
			((Button) event.getTarget()).setStyle("-fx-font-size: 10");
			((Button) event.getTarget()).setStyle("-fx-background-color:#cccccc");
			((Button) event.getTarget()).setDisable(true);
		}

		if (y.getStyle() == "-fx-font-size: 0.1") {// bomb
			((Button) event.getTarget()).setStyle("-fx-font-size: 10");
			((Button) event.getTarget()).setText("bomb");
			((Button) event.getTarget()).setDisable(true);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
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
	

}
