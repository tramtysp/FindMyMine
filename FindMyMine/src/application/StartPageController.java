package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class StartPageController {

	@FXML
	private Button start;
	
	//this will be assign to each button in the GamePage 0=free 1=bomb
	public static int[][] valueOfSpace = new int[6][6];
	
	// create array to keep number of surrounding bomb
	public static int[][] bombAround = new int[6][6];
	int numBomb = 0;

	@FXML
	void start(ActionEvent event) throws IOException {
		// assign bomb to the slot
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				
				float result = (float) Math.random();
				if (result < 0.5) {
					result = 0;
				}
				if (result >= 0.5) {
					result = 1;
				}
				if (numBomb >= 11) {
					result = 0;
				}
				if (result == 0) {
					valueOfSpace[i][j] = 0;//free space
				}
				if (result == 1) {
					valueOfSpace[i][j] = 1;//bomb
					numBomb++;
				}

			}
		}
		
		// fix number of bomb to 11
		while (numBomb != 11) {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {

					if (valueOfSpace[i][j] == 0) {
						int result = (int) Math.random();
						if (result < 0.5) {
							result = 0;
						}
						if (result >= 0.5) {
							result = 1;
						}
						if (result == 0) {
							valueOfSpace[i][j] = 0;//free space
						}
						if (result == 1) {
							valueOfSpace[i][j] = 1;//bomb
							numBomb++;
						}
					}
				}

			}
		}

		// set number in free slot

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {

				int countBombAround = 0;
				if (valueOfSpace[i][j] == 0) { // if this is free slot
					if (i - 1 >= 0 && j - 1 >= 0) { // if there is a slot
						if (valueOfSpace[i - 1][j - 1] == 1) { // if the upperleft is bomb
							countBombAround++;
						}
					}
					if (i >= 0 && j - 1 >= 0) {
						if (valueOfSpace[i][j - 1] == 1) {
							countBombAround++;
						}
					}
					if (i + 1 <= 5 && j - 1 >= 0) {
						if (valueOfSpace[i + 1][j - 1] == 1) {
							countBombAround++;
						}
					}
					if (i - 1 >= 0 && j >= 0) {
						if (valueOfSpace[i - 1][j] == 1) {
							countBombAround++;
						}
					}
					if (i + 1 <= 5 && j >= 0) {
						if (valueOfSpace[i + 1][j] == 1) {
							countBombAround++;
						}
					}
					if (i - 1 >= 0 && j + 1 <= 5) {
						if (valueOfSpace[i - 1][j + 1] == 1) {
							countBombAround++;
						}
					}
					if (i >= 0 && j + 1 <= 5) {
						if (valueOfSpace[i][j + 1] == 1) {
							countBombAround++;
						}
					}
					if (i + 1 <= 5 && j + 1 <= 5) {
						if (valueOfSpace[i + 1][j + 1] == 1) {
							countBombAround++;
						}
					}
					bombAround[i][j] = countBombAround;

					

				}
			}
		}
		
		AnchorPane gamePage = (AnchorPane) FXMLLoader.load(getClass().getResource("GamePage.fxml"));
		Scene scene = new Scene(gamePage);
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();

	}
	public static int getValueOfSpace(int i,int j) {
		int valueofspace = valueOfSpace[i][j];
		return valueofspace ;
		
	}
	public static int getNumBombAround(int i,int j) {
		int numbombaround = bombAround[i][j];
		return numbombaround;
	}
}
