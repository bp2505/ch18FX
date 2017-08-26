package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea txtarea;
    @FXML
    TextField txtfield;
    public void pressed(ActionEvent actionEvent) {
        String input = txtfield.getText();
        reverseDisplay(input);
        txtarea.setText(text);
    }
    static String text="";
    static int x = 0;
    static void reverseDisplay(String value){
        x++;
        if (x == value.length())
            text = text.concat(String.valueOf(value.charAt(0)));
        else {
            text = text.concat(String.valueOf(value.charAt(value.length() - x)));
            reverseDisplay(value);
        }
    }
}
