package tictactoeTwoPlayers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class tictactoeTwoPlayers extends Application implements EventHandler<ActionEvent> {

    private Button[] buttons;
    private boolean xTurn = true;
    private boolean win = false;


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane, 400, 400);
        buttons = new Button[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new Button(" ");
            buttons[i].setPrefSize(150, 150);
            buttons[i].setOnAction(this);
        }

        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gridPane.add(buttons[index], j, i);
                index++;
            }
        }

        stage.setTitle("Board");
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (buttons[j] == event.getSource() && xTurn && buttons[j].getText().equals(" ") && !win) {
                    buttons[j].setText("X");

                } else if (buttons[j] == event.getSource() && !xTurn && buttons[j].getText().equals(" ") && !win) {
                    buttons[j].setText("O");

                } else {
                    if (xTurn) {
                        xTurn = false;
                    } else {
                        xTurn = true;
                    }
                }


                if (xTurn) {
                    xTurn = false;
                } else {
                    xTurn = true;
                }
            }
            if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X")) {
                buttons[0].setText("X wins !!!!");
                buttons[1].setText("X wins !!!!");
                buttons[2].setText("X wins !!!!");
                win = true;


            }
            if (buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")) {
                buttons[3].setText("X wins !!!!");
                buttons[4].setText("X wins !!!!");
                buttons[5].setText("X wins !!!!");
                win = true;
            }
            if (buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")) {
                buttons[6].setText("X wins !!!!");
                buttons[7].setText("X wins !!!!");
                buttons[8].setText("X wins !!!!");
                win = true;
            }
            if (buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O")) {
                buttons[0].setText("O wins !!!!");
                buttons[1].setText("O wins !!!!");
                buttons[2].setText("O wins !!!!");
                win = true;
            }
            if (buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O")) {
                buttons[3].setText("O wins !!!!");
                buttons[4].setText("O wins !!!!");
                buttons[5].setText("O wins !!!!");
                win = true;
            }
            if (buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")) {
                buttons[6].setText("O wins !!!!");
                buttons[7].setText("O wins !!!!");
                buttons[8].setText("O wins !!!!");
                win = true;
            }

            if (buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")) {
                buttons[0].setText("X wins !!!!");
                buttons[4].setText("X wins !!!!");
                buttons[8].setText("X wins !!!!");
                win = true;
            }
            if (buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")) {
                buttons[2].setText("X wins !!!!");
                buttons[4].setText("X wins !!!!");
                buttons[6].setText("X wins !!!!");
                win = true;
            }
            if (buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O")) {
                buttons[0].setText("O wins !!!!");
                buttons[4].setText("O wins !!!!");
                buttons[8].setText("O wins !!!!");
                win = true;
            }
            if (buttons[2].getText().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O")) {
                buttons[2].setText("O wins !!!!");
                buttons[4].setText("O wins !!!!");
                buttons[6].setText("O wins !!!!");
                win = true;

            }
            if (buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")) {
                buttons[0].setText("X wins !!!!");
                buttons[3].setText("X wins !!!!");
                buttons[6].setText("X wins !!!!");
                win = true;
            }
            if (buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")) {
                buttons[1].setText("X wins !!!!");
                buttons[4].setText("X wins !!!!");
                buttons[7].setText("X wins !!!!");
                win = true;
            }
            if (buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")) {
                buttons[2].setText("X wins !!!!");
                buttons[5].setText("X wins !!!!");
                buttons[8].setText("X wins !!!!");
                win = true;
            }
            if (buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O")) {
                buttons[0].setText("O wins !!!!");
                buttons[3].setText("O wins !!!!");
                buttons[6].setText("O wins !!!!");
                win = true;
            }
            if (buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O")) {
                buttons[1].setText("O wins !!!!");
                buttons[4].setText("O wins !!!!");
                buttons[7].setText("O wins !!!!");
                win = true;
            }
            if (buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O")) {
                buttons[2].setText("O wins !!!!");
                buttons[5].setText("O wins !!!!");
                buttons[8].setText("O wins !!!!");
                win = true;
            }
            if ((!buttons[0].getText().equals(" ") && !buttons[1].getText().equals(" ") && !buttons[2].getText().equals(" ") &&
                    (!buttons[3].getText().equals(" ") && !buttons[4].getText().equals(" ") && !buttons[5].getText().equals(" ")) &&
                    (!buttons[6].getText().equals(" ") && !buttons[7].getText().equals(" ") && !buttons[8].getText().equals(" "))) && !win) {

                buttons[0].setText("Draw");
                buttons[1].setText("Draw");
                buttons[2].setText("Draw");
                buttons[3].setText("Draw");
                buttons[4].setText("Draw");
                buttons[5].setText("Draw");
                buttons[6].setText("Draw");
                buttons[7].setText("Draw");
                buttons[8].setText("Draw");


            }


        }
    }
}


























