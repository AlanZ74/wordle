import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
/**
 * @author Alan Zheng
 * @version 1.0
 * Jorlde: Java Wordle
 */
public class Jordle extends Application {
    private static String answer = Words.list.get((int) (Math.random() * 29));

    @Override
    public void start(Stage primaryStage) {
        //Create primary Stage & Root
        primaryStage.setTitle("Jordle");
        Pane root = new Pane();

        //Colors
        BorderStroke borderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(0.5));
        Border border = new Border(borderStroke);
        Background backgroundColor = new Background(new BackgroundFill(Color.WHITE, null, null));

        //Row 1
        HBox row1 = new HBox(4);
        Label column11 = new Label("        ");
        Label column12 = new Label("        ");
        Label column13 = new Label("        ");
        Label column14 = new Label("        ");
        Label column15 = new Label("        ");
        Label[] row1Labels = new Label[5];
        row1Labels[0] = column11;
        row1Labels[1] = column12;
        row1Labels[2] = column13;
        row1Labels[3] = column14;
        row1Labels[4] = column15;
        for (int i = 0; i < 5; i++) {
            row1Labels[i].setBorder(border);
            row1Labels[i].setBackground(backgroundColor);
            row1Labels[i].setMinWidth(50);
            row1Labels[i].setMinHeight(50);
            row1Labels[i].setTranslateX(130);
            row1Labels[i].setTranslateY(100);
            row1.getChildren().add(row1Labels[i]);
        }
        root.getChildren().add(row1);


        //Row 2
        HBox row2 = new HBox(4);
        Label column21 = new Label("        ");
        Label column22 = new Label("        ");
        Label column23 = new Label("        ");
        Label column24 = new Label("        ");
        Label column25 = new Label("        ");
        Label[] row2Labels = new Label[5];
        row2Labels[0] = column21;
        row2Labels[1] = column22;
        row2Labels[2] = column23;
        row2Labels[3] = column24;
        row2Labels[4] = column25;
        for (int i = 0; i < 5; i++) {
            row2Labels[i].setBorder(border);
            row2Labels[i].setBackground(backgroundColor);
            row2Labels[i].setMinWidth(50);
            row2Labels[i].setMinHeight(50);
            row2Labels[i].setTranslateX(130);
            row2Labels[i].setTranslateY(154);
            row2.getChildren().add(row2Labels[i]);
        }
        root.getChildren().add(row2);

        //Row 3
        HBox row3 = new HBox(4);
        Label column31 = new Label("        ");
        Label column32 = new Label("        ");
        Label column33 = new Label("        ");
        Label column34 = new Label("        ");
        Label column35 = new Label("        ");
        Label[] row3Labels = new Label[5];
        row3Labels[0] = column31;
        row3Labels[1] = column32;
        row3Labels[2] = column33;
        row3Labels[3] = column34;
        row3Labels[4] = column35;
        for (int i = 0; i < 5; i++) {
            row3Labels[i].setBorder(border);
            row3Labels[i].setBackground(backgroundColor);
            row3Labels[i].setMinWidth(50);
            row3Labels[i].setMinHeight(50);
            row3Labels[i].setTranslateX(130);
            row3Labels[i].setTranslateY(208);
            row3.getChildren().add(row3Labels[i]);
        }
        root.getChildren().add(row3);

        //Row 4
        HBox row4 = new HBox(4);
        Label column41 = new Label("        ");
        Label column42 = new Label("        ");
        Label column43 = new Label("        ");
        Label column44 = new Label("        ");
        Label column45 = new Label("        ");
        Label[] row4Labels = new Label[5];
        row4Labels[0] = column41;
        row4Labels[1] = column42;
        row4Labels[2] = column43;
        row4Labels[3] = column44;
        row4Labels[4] = column45;
        for (int i = 0; i < 5; i++) {
            row4Labels[i].setBorder(border);
            row4Labels[i].setBackground(backgroundColor);
            row4Labels[i].setMinWidth(50);
            row4Labels[i].setMinHeight(50);
            row4Labels[i].setTranslateX(130);
            row4Labels[i].setTranslateY(262);
            row4.getChildren().add(row4Labels[i]);
        }
        root.getChildren().add(row4);

        //Row 5
        HBox row5 = new HBox(4);
        Label column51 = new Label("        ");
        Label column52 = new Label("        ");
        Label column53 = new Label("        ");
        Label column54 = new Label("        ");
        Label column55 = new Label("        ");
        Label[] row5Labels = new Label[5];
        row5Labels[0] = column51;
        row5Labels[1] = column52;
        row5Labels[2] = column53;
        row5Labels[3] = column54;
        row5Labels[4] = column55;
        for (int i = 0; i < 5; i++) {
            row5Labels[i].setBorder(border);
            row5Labels[i].setBackground(backgroundColor);
            row5Labels[i].setMinWidth(50);
            row5Labels[i].setMinHeight(50);
            row5Labels[i].setTranslateX(130);
            row5Labels[i].setTranslateY(316);
            row5.getChildren().add(row5Labels[i]);
        }
        root.getChildren().add(row5);

        //Row 6
        HBox row6 = new HBox(4);
        Label column61 = new Label("       ");
        Label column62 = new Label("       ");
        Label column63 = new Label("       ");
        Label column64 = new Label("       ");
        Label column65 = new Label("       ");
        Label[] row6Labels = new Label[5];
        row6Labels[0] = column61;
        row6Labels[1] = column62;
        row6Labels[2] = column63;
        row6Labels[3] = column64;
        row6Labels[4] = column65;
        for (int i = 0; i < 5; i++) {
            row6Labels[i].setBorder(border);
            row6Labels[i].setBackground(backgroundColor);
            row6Labels[i].setMinWidth(50);
            row6Labels[i].setMinHeight(50);
            row6Labels[i].setTranslateX(130);
            row6Labels[i].setTranslateY(370);
            row6.getChildren().add(row6Labels[i]);
        }
        root.getChildren().add(row6);

        //Title
        Label jordle = new Label("Jordle");
        jordle.setFont(new Font("Helvetica", 40));
        jordle.setTranslateX(220);
        jordle.setTranslateY(30);
        root.getChildren().add(jordle);

        //Status
        Label status = new Label("Try guessing a word!");
        status.setTranslateX(150);
        status.setTranslateY(455);
        root.getChildren().add(status);

        //Intructions
        Button instructionsButton = new Button("Instructions");
        instructionsButton.setFocusTraversable(false);
        instructionsButton.setOnMouseClicked(e -> {
            final Stage instructions = new Stage();
            instructions.initModality(Modality.APPLICATION_MODAL);
            instructions.initOwner(primaryStage);
            VBox instructionsVbox = new VBox(20);
            instructionsVbox.getChildren().add(new Text("Welcome to Java Wordle! To begin, enter a "
                + "five letter word that is related to Java Concepts."
                + "\nAfter you've typed in this word, press enter to lock in your guess."
                + "\nIf a letter is highlighted green, that means it is the correct letter and in the correct location."
                + "\nIf it is yellow, it is a correct letter, but in an incorrect location."
                + "\nIf it is gray, the letter is incorrect."
                + "\nYou get six tries to find the mystery word!"));
            Scene instructionsScene = new Scene(instructionsVbox, 600, 150);
            instructions.setScene(instructionsScene);
            instructions.show();
        });
        instructionsButton.setTranslateX(350);
        instructionsButton.setTranslateY(450);
        root.getChildren().add(instructionsButton);

        //Reset
        Button resetButton = new Button("Reset");
        resetButton.setFocusTraversable(false);
        resetButton.setOnMouseClicked(e -> {
            for (int i = 0; i < 5; i++) {
                row1Labels[i].setText("       ");
                row1Labels[i].setBackground(backgroundColor);
                row2Labels[i].setText("       ");
                row2Labels[i].setBackground(backgroundColor);
                row3Labels[i].setText("       ");
                row3Labels[i].setBackground(backgroundColor);
                row4Labels[i].setText("       ");
                row4Labels[i].setBackground(backgroundColor);
                row5Labels[i].setText("       ");
                row5Labels[i].setBackground(backgroundColor);
                row6Labels[i].setText("       ");
                row6Labels[i].setBackground(backgroundColor);
                status.setText("Try guessing a word!");
                status.setTranslateX(150);
                status.setTranslateY(455);
                answer = Words.list.get((int) (Math.random() * 29));
            }
        });
        resetButton.setTranslateX(300);
        resetButton.setTranslateY(450);
        root.getChildren().add(resetButton);

        //Error
        final Stage error = new Stage();
        error.initModality(Modality.APPLICATION_MODAL);
        error.initOwner(primaryStage);
        VBox errorVbox = new VBox(20);
        errorVbox.getChildren().add(new Text("Error. Please enter a five letter word."));
        Scene errorScene = new Scene(errorVbox, 200, 100);
        error.setScene(errorScene);


        //Set stage & Show
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

        //Key Events
        root.setOnKeyPressed((KeyEvent e) -> {
            if (!checked(row1Labels)) {
                if (column11.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column11.setText("      " + e.getCode());
                } else if (column12.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column12.setText("      " + e.getCode());
                } else if (column13.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column13.setText("      " + e.getCode());
                } else if (column14.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column14.setText("      " + e.getCode());
                } else if (column15.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column15.setText("      " + e.getCode());
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column15.getText().strip().equals("")) {
                    column15.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column14.getText().strip().equals("")) {
                    column14.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column13.getText().strip().equals("")) {
                    column13.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column12.getText().strip().equals("")) {
                    column12.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column11.getText().strip().equals("")) {
                    column11.setText("       ");
                } else if (e.getCode() == KeyCode.ENTER) {
                    if (isComplete(row1Labels)) {
                        check(row1Labels);
                        if (checkWin(row1Labels)) {
                            status.setText("Congratulations! You've guessed the word!");
                            status.setTranslateX(70);
                        }
                    }
                }
            }
            if (!checked(row2Labels) && checked(row1Labels) && !checkWin(row1Labels)) {
                if (column21.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column21.setText("      " + e.getCode());
                } else if (column22.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column22.setText("      " + e.getCode());
                } else if (column23.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column23.setText("      " + e.getCode());
                } else if (column24.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column24.setText("      " + e.getCode());
                } else if (column25.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column25.setText("      " + e.getCode());
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column25.getText().strip().equals("")) {
                    column25.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column24.getText().strip().equals("")) {
                    column24.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column23.getText().strip().equals("")) {
                    column23.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column22.getText().strip().equals("")) {
                    column22.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column21.getText().strip().equals("")) {
                    column21.setText("       ");
                } else if (e.getCode() == KeyCode.ENTER) {
                    if (isComplete(row2Labels)) {
                        check(row2Labels);
                        if (checkWin(row2Labels)) {
                            status.setText("Congratulations! You've guessed the word!");
                            status.setTranslateX(70);
                        }
                    }
                }
            }
            if (!checked(row3Labels) && checked(row2Labels) && !checkWin(row2Labels)) {
                if (column31.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column31.setText("      " + e.getCode());
                } else if (column32.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column32.setText("      " + e.getCode());
                } else if (column33.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column33.setText("      " + e.getCode());
                } else if (column34.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column34.setText("      " + e.getCode());
                } else if (column35.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column35.setText("      " + e.getCode());
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column35.getText().strip().equals("")) {
                    column35.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column34.getText().strip().equals("")) {
                    column34.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column33.getText().strip().equals("")) {
                    column33.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column32.getText().strip().equals("")) {
                    column32.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column31.getText().strip().equals("")) {
                    column31.setText("       ");
                } else if (e.getCode() == KeyCode.ENTER) {
                    if (isComplete(row3Labels)) {
                        check(row3Labels);
                        if (checkWin(row3Labels)) {
                            status.setText("Congratulations! You've guessed the word!");
                            status.setTranslateX(70);
                        }
                    }
                }
            }
            if (!checked(row4Labels) && checked(row3Labels) && !checkWin(row3Labels)) {
                if (column41.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column41.setText("      " + e.getCode());
                } else if (column42.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column42.setText("     " + e.getCode());
                } else if (column43.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column43.setText("      " + e.getCode());
                } else if (column44.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column44.setText("      " + e.getCode());
                } else if (column45.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column45.setText("      " + e.getCode());
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column45.getText().strip().equals("")) {
                    column45.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column44.getText().strip().equals("")) {
                    column44.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column43.getText().strip().equals("")) {
                    column43.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column42.getText().strip().equals("")) {
                    column42.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column41.getText().strip().equals("")) {
                    column41.setText("       ");
                } else if (e.getCode() == KeyCode.ENTER) {
                    if (isComplete(row4Labels)) {
                        check(row4Labels);
                        if (checkWin(row4Labels)) {
                            status.setText("Congratulations! You've guessed the word!");
                            status.setTranslateX(70);
                        }
                    }
                }
            }
            if (!checked(row5Labels) && checked(row4Labels) && !checkWin(row4Labels)) {
                if (column51.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column51.setText("      " + e.getCode());
                } else if (column52.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column52.setText("      " + e.getCode());
                } else if (column53.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column53.setText("      " + e.getCode());
                } else if (column54.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column54.setText("      " + e.getCode());
                } else if (column55.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column55.setText("      " + e.getCode());
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column55.getText().strip().equals("")) {
                    column55.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column54.getText().strip().equals("")) {
                    column54.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column53.getText().strip().equals("")) {
                    column53.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column52.getText().strip().equals("")) {
                    column52.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column51.getText().strip().equals("")) {
                    column51.setText("       ");
                } else if (e.getCode() == KeyCode.ENTER) {
                    if (isComplete(row5Labels)) {
                        check(row5Labels);
                        if (checkWin(row5Labels)) {
                            status.setText("Congratulations! You've guessed the word!");
                            status.setTranslateX(70);
                        }
                    }
                }
            }
            if (!checked(row6Labels) && checked(row5Labels) && !checkWin(row5Labels)) {
                if (column61.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column61.setText("      " + e.getCode());
                } else if (column62.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column62.setText("      " + e.getCode());
                } else if (column63.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column63.setText("      " + e.getCode());
                } else if (column64.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column64.setText("      " + e.getCode());
                } else if (column65.getText().strip().equals("") && e.getCode().isLetterKey()) {
                    column65.setText("      " + e.getCode());
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column65.getText().strip().equals("")) {
                    column65.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column64.getText().strip().equals("")) {
                    column64.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column63.getText().strip().equals("")) {
                    column63.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column62.getText().strip().equals("")) {
                    column62.setText("       ");
                } else if (e.getCode() == KeyCode.BACK_SPACE && !column61.getText().strip().equals("")) {
                    column61.setText("       ");
                } else if (e.getCode() == KeyCode.ENTER) {
                    if (isComplete(row6Labels)) {
                        check(row6Labels);
                        if (checkWin(row6Labels)) {
                            status.setText("Congratulations! You've guessed the word!");
                            status.setTranslateX(70);
                        } else {
                            status.setText("Game Over. The word was " + answer + ".");
                            status.setTranslateX(120);
                        }
                    }
                }
            }
            if (e.getCode() == KeyCode.ENTER) {
                if (!checked(row1Labels)) {
                    if (!isBlank(row1Labels)) {
                        error.show();
                    }
                } else if (!checked(row2Labels)) {
                    if (!isBlank(row2Labels)) {
                        error.show();
                    }
                } else if (!checked(row3Labels)) {
                    if (!isBlank(row3Labels)) {
                        error.show();
                    }
                } else if (!checked(row4Labels)) {
                    if (!isBlank(row4Labels)) {
                        error.show();
                    }
                } else if (!checked(row5Labels)) {
                    if (!isBlank(row5Labels)) {
                        error.show();
                    }
                } else if (!checked(row6Labels)) {
                    if (!isBlank(row6Labels)) {
                        error.show();
                    }
                }
            }
        });
        root.requestFocus();
    }
    /**
     * Method to check if a row is completely filled out.
     * @param rowLabels the row being checked.
     * @return returns a boolean representing whether or not the row if completely filled.
     */
    public static Boolean isComplete(Label[] rowLabels) {
        for (int i = 0; i < 5; i++) {
            if (rowLabels[i].getText().strip().equals("")) {
                return false;
            }
        }
        return true;
    }
    /**
     * Method to check if a row is completely blank.
     * @param rowLabels the row being checked.
     * @return returns a boolean representing whether or not the row is completely blank.
     */
    public static Boolean isBlank(Label[] rowLabels) {
        for (int i = 0; i < 5; i++) {
            if (!rowLabels[i].getText().strip().equals("")) {
                return false;
            }
        } return true;
    }
    /**
     * Method that determines whether or not a row has been locked in.
     * @param rowLabels row being checked.
     * @return returns a boolean representing whether or not the row has been checked.
     */
    public static Boolean checked(Label[] rowLabels) {
        Background backgroundColor = new Background(new BackgroundFill(Color.WHITE, null, null));
        if (rowLabels[0].getBackground().equals(backgroundColor)) {
            return false;
        }
        return true;
    }
    /**
     * Method that checks a row.
     * @param rowLabels the row being checked.
     */
    public static void check(Label[] rowLabels) {
        Background yes = new Background(new BackgroundFill(Color.GREEN, null, null));
        Background mid = new Background(new BackgroundFill(Color.YELLOW, null, null));
        Background no = new Background(new BackgroundFill(Color.GRAY, null, null));
        for (int i = 0; i < 5; i++) {
            if (rowLabels[i].getText().strip().toLowerCase().charAt(0) == (answer.charAt(i))) {
                rowLabels[i].setBackground(yes);
            } else if (answer.contains(rowLabels[i].getText().strip().toLowerCase())) {
                rowLabels[i].setBackground(mid);
            } else {
                rowLabels[i].setBackground(no);
            }
        }
    }
    /**
     * Method that checks whether or not the player won.
     * @param rowLabels row being checked.
     * @return returns whether or not the player won.
     */
    public static boolean checkWin(Label[] rowLabels) {
        Background yes = new Background(new BackgroundFill(Color.GREEN, null, null));
        for (int i = 0; i < 5; i++) {
            if (!rowLabels[i].getBackground().equals(yes)) {
                return false;
            }
        } return true;
    }
}