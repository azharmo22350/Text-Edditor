package lk.ijse.dep11;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainFormController {
    public AnchorPane root;
    public MenuItem newFile;
    public MenuItem exit;
    public MenuItem userGuide;
    public MenuItem aboutUs;

    public void newFileOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane mainRoot = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene = new Scene(mainRoot);

        Stage stage = new Stage();
        stage.initOwner(root.getScene().getWindow());
        stage.setScene(mainScene);
        stage.setTitle("New White Board Text Editor");
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.show();

        FadeTransition fade = new FadeTransition(Duration.millis(750), mainRoot);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.playFromStart();

    }

    public void exitOnAction(ActionEvent actionEvent) {

    }

    public void userGuideOnAction(ActionEvent actionEvent) throws Exception {
        AnchorPane userGuideRoot = FXMLLoader.load(getClass().getResource("/view/UserGuide.fxml"));
        Scene scene = new Scene(userGuideRoot);

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());

        stage.setScene(scene);
        stage.setTitle("User Guide");
        stage.show();
    }

    public void aboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane aboutUsRoot = FXMLLoader.load(getClass().getResource("/view/AboutUs.fxml"));
        Scene scene = new Scene(aboutUsRoot);

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());

        stage.setScene(scene);
        stage.setTitle("About");
        stage.show();
    }
}
