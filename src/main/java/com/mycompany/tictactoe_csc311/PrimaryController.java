package com.mycompany.tictactoe_csc311;

import java.io.IOException;
import javafx.util.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PrimaryController 
{

    // Will be used to keep track of player turns
    int playerMove = -1;

    // Initating all button objects.
    @FXML
    Button button1;

    @FXML
    Button button2;

    @FXML
    Button button3;

    @FXML
    Button button4;

    @FXML
    Button button5;

    @FXML
    Button button6;

    @FXML
    Button button7;

    @FXML
    Button button8;

    @FXML
    Button button9;

    // Initiating all circle objects.
    @FXML
    Circle circle1;

    @FXML
    Circle circle2;

    @FXML
    Circle circle3;

    @FXML
    Circle circle4;

    @FXML
    Circle circle5;

    @FXML
    Circle circle6;

    @FXML
    Circle circle7;

    @FXML
    Circle circle8;

    @FXML
    Circle circle9;

    // Initiating all rectangle objects.
    @FXML
    Rectangle rect1;

    @FXML
    Rectangle rect2;

    @FXML
    Rectangle rect3;

    @FXML
    Rectangle rect4;

    @FXML
    Rectangle rect5;

    @FXML
    Rectangle rect6;

    @FXML
    Rectangle rect7;

    @FXML
    Rectangle rect8;

    @FXML
    Rectangle rect9;

    /**
     * Will be used to exit javafx platform and exit tictactoe game.
     */
    public void closeGame(ActionEvent event) 
    {
        Platform.exit();
        System.exit(0);
    } // End method.

    /**
     * playerMove - Method that will control the move of the player in regards
     * to which position they choose.
     *
     * @param event - Mouse click of pane.
     */
    @FXML
    public void playerMove(ActionEvent event) 
    {

        // Get the button object that is pressed.
        Button button = (Button) event.getSource();

        // Increment playerMove by 1 to show a player move.
        // Will start at -1 and player moves will officially start at 0.
        playerMove++;

        // Will retrieve the fxid from the button that was pressed.
        // Using switch-block in order to check which button was pressed, therefore corresponding
        // Square and circle shapes will become active depending on whoever's turn it is currently.
        // Will break in order to avoid all following position's shapes to become active.
        switch (button.getId()) 
        {
            case "button1":
                button.setDisable(true); // Disables current button so that no other person can override the player's choice.

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect1.setVisible(true);
                } else // Player 2's turn.
                {
                    circle1.setVisible(true);
                }
                break;

            case "button2":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect2.setVisible(true);
                } else // Player 2's turn.
                {
                    circle2.setVisible(true);
                }
                break;

            case "button3":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect3.setVisible(true);
                } else // Player 2's turn.
                {
                    circle3.setVisible(true);
                }
                break;

            case "button4":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect4.setVisible(true);
                } else // Player 2's turn.
                {
                    circle4.setVisible(true);
                }
                break;

            case "button5":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect5.setVisible(true);
                } else // Player 2's turn.
                {
                    circle5.setVisible(true);
                }
                break;

            case "button6":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect6.setVisible(true);
                } else // Player 2's turn.
                {
                    circle6.setVisible(true);
                }
                break;

            case "button7":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect7.setVisible(true);
                } else // Player 2's turn.
                {
                    circle7.setVisible(true);
                }
                break;

            case "button8":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect8.setVisible(true);
                } else // Player 2's turn.
                {
                    circle8.setVisible(true);
                }
                break;

            case "button9":
                button.setDisable(true);

                if (playerMove % 2 == 0) // If even, it's player 1's turn.
                {
                    rect9.setVisible(true);
                } else // Player 2's turn.
                {
                    circle9.setVisible(true);
                }
                break;
        } // End Switch.
        checkIfGameIsOver();
    } // End method.

    /**
     * restartGame - will make all buttons not disabled, and all shapes not
     * visible.
     */
    @FXML
    public void restartGame() 
    {
        playerMove = -1;

        setDisableButtons(false);

        setVisibleCircles(false);

        setVisibleRectangles(false);
    } // End method.

    /**
     * checkIfGameIsOver - Will be used to check if a player has won the game
     * after every turn. Once a player wins, all buttons will be disabled and
     * animation for the corresponding winner will occur. Can restart game using
     * new game button in the file drop down.
     */
    public void checkIfGameIsOver() 
    {
        String winner = "";

        // Below are all possible cases where a player can win, will set winner variable to whoever satifies the requirements first.   
        // Case 1.
        if (rect1.isVisible() && rect2.isVisible() && rect3.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle1.isVisible() && circle2.isVisible() && circle3.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 2.
        if (rect4.isVisible() && rect5.isVisible() && rect6.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle4.isVisible() && circle5.isVisible() && circle6.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 3.
        if (rect7.isVisible() && rect8.isVisible() && rect9.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle7.isVisible() && circle8.isVisible() && circle9.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 4.
        if (rect1.isVisible() && rect4.isVisible() && rect7.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle1.isVisible() && circle4.isVisible() && circle7.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 5.
        if (rect2.isVisible() && rect5.isVisible() && rect8.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle2.isVisible() && circle5.isVisible() && circle8.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 6.
        if (rect3.isVisible() && rect6.isVisible() && rect9.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle3.isVisible() && circle6.isVisible() && circle9.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 7.
        if (rect1.isVisible() && rect5.isVisible() && rect9.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle1.isVisible() && circle5.isVisible() && circle9.isVisible()) 
        {
            winner = "OOO";
        }

        // Case 8.
        if (rect3.isVisible() && rect5.isVisible() && rect7.isVisible()) 
        {
            winner = "SSS";
        }
        if (circle3.isVisible() && circle5.isVisible() && circle7.isVisible()) 
        {
            winner = "OOO";
        }

        // Player 1 is winner.
        if (winner.equals("SSS")) 
        {
            setDisableButtons(true);
            applyRectTransitions();
            System.out.println("Player 1 wins!");
        }

        // Player 2 is winner.
        if (winner.equals("OOO")) 
        {
            setDisableButtons(true);
            applyCircleTransitions();
            System.out.println("Player 2 wins!");
        }
    }

    /**
     * applyCircleTransitions - Applies circle transitions to all circle objects that are on the board.
     */
    public void applyCircleTransitions() 
    {
        circleTransitions(circle1);
        circleTransitions(circle2);
        circleTransitions(circle3);
        circleTransitions(circle4);
        circleTransitions(circle5);
        circleTransitions(circle6);
        circleTransitions(circle7);
        circleTransitions(circle8);
        circleTransitions(circle9);

    }

    /**
     * circleTransitions - contains the fade and scale transitions
     * in a parallel transition to be called at the same time on an object.
     * @param circle 
     */
    public void circleTransitions(Circle circle) 
    {
        final Duration SEC_2 = Duration.seconds(2);

        FadeTransition ft = new FadeTransition(SEC_2);
        ft.setFromValue(1.0);
        ft.setToValue(0.0);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);

        ScaleTransition st = new ScaleTransition(SEC_2);
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setCycleCount(4);
        st.setAutoReverse(true);

        ParallelTransition pt = new ParallelTransition(circle, ft, st);
        pt.play();
    }

    /**
     * applyRectTransitions - apply rectangle transitions to all rectangle objects that are on the board.
     */
    public void applyRectTransitions() 
    {
        rectTransitions(rect1);
        rectTransitions(rect2);
        rectTransitions(rect3);
        rectTransitions(rect4);
        rectTransitions(rect5);
        rectTransitions(rect6);
        rectTransitions(rect7);
        rectTransitions(rect8);
        rectTransitions(rect9);

    }

    /**
     * rectTransitions - Applies scale and rotate transitions in a parallel transition to be used on a rectangle object.
     * @param rect 
     */
    public void rectTransitions(Rectangle rect) 
    {
        final Duration SEC_2 = Duration.seconds(2);

        ScaleTransition st = new ScaleTransition(SEC_2);
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setCycleCount(4);
        st.setAutoReverse(true);

        RotateTransition rt = new RotateTransition(SEC_2);
        rt.setByAngle(180f);
        rt.setCycleCount(4);
        rt.setAutoReverse(true);
        
        ParallelTransition pt = new ParallelTransition(rect, rt, st);
        pt.play();
    }

    /**
     * setDisableButtons - Will be used to disable all the buttons once a player
     * wins, in order to avoid the next player placing another shape down.
     */
    public void setDisableButtons(boolean onOff) 
    {
        button1.setDisable(onOff);
        button2.setDisable(onOff);
        button3.setDisable(onOff);
        button4.setDisable(onOff);
        button5.setDisable(onOff);
        button6.setDisable(onOff);
        button7.setDisable(onOff);
        button8.setDisable(onOff);
        button9.setDisable(onOff);
    }

    /**
     * setVisibleCircles - method that controls the visible property of the
     * circles.
     */
    public void setVisibleCircles(boolean onOff) 
    {
        circle1.setVisible(onOff);
        circle2.setVisible(onOff);
        circle3.setVisible(onOff);
        circle4.setVisible(onOff);
        circle5.setVisible(onOff);
        circle6.setVisible(onOff);
        circle7.setVisible(onOff);
        circle8.setVisible(onOff);
        circle9.setVisible(onOff);
    }

    /**
     * setVisibleRectangles - method that controls the visible property of the
     * rectangles.
     */
    public void setVisibleRectangles(boolean onOff) 
    {
        rect1.setVisible(onOff);
        rect2.setVisible(onOff);
        rect3.setVisible(onOff);
        rect4.setVisible(onOff);
        rect5.setVisible(onOff);
        rect6.setVisible(onOff);
        rect7.setVisible(onOff);
        rect8.setVisible(onOff);
        rect9.setVisible(onOff);
    }
} // End class.
