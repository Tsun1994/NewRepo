package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    void sendMsg(){
        textArea.appendText("You: " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
        Random random = new Random();
        int rand = random.nextInt(8);
        switch (rand){
            case 1: textArea.appendText("Igor: ага, я тоже это видел" + "\n");
            case 2: textArea.appendText("Lena: а что я тут пишу" + "\n");
            case 3: textArea.appendText("Rosa: дайте две" + "\n");
            case 4: textArea.appendText("Masha: пески времени не забыты" + "\n");
            case 5: textArea.appendText("Bilan: невозможное возможно" + "\n");
            case 6: textArea.appendText("Troll: кто вы такие? я вас не звал" + "\n");
            case 7: textArea.appendText("Dog: гав гав гав" + "\n");
        }
    }
    @FXML
    void sendMsgIgor (){
        textArea.appendText("Igor: Привет, я Игорь" + "\n");
    }
    @FXML
    void sendMsgLena (){
        textArea.appendText("Lena: Привет, я Лена" + "\n");
    }
    @FXML
    void sendMsgRosa (){
        textArea.appendText("Rosa: Привет, я Роза, работаю в банке" + "\n");
    }
    @FXML
    void sendMsgMasha (){
        textArea.appendText("Masha: Я Мария, приятно познакомиться" + "\n");
    }
    @FXML
    void sendMsgBilan (){
        textArea.appendText("Bilan: Я до сих пор мечтаю об олимпийском" + "\n");
    }
    @FXML
    void sendMsgTroll (){
        textArea.appendText("Troll: Жирный жирный жирный, как поезд пассажирный" + "\n");
    }
    @FXML
    void sendMsgDog (){
        textArea.appendText("Dog: *радостный приветливый лай*" + "\n");
    }
}
