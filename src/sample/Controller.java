package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.event.ActionEvent;

public class Controller {

    public ImageView picture;

    public void load(javafx.event.ActionEvent actionEvent) {
        Image image = new Image("\\resource\\big_1.jpg");
        picture.setImage(image);
    }
}
