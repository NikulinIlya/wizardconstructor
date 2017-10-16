package ru.windowsconstructor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import ru.windowsconstructor.constructprocess.controller.StartLayoutController;

import java.util.List;

public class main extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;

    public main() {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Добро пожаловать!");
        initStartLayout();
    }

    public void initStartLayout() throws Exception {
        String fxmlFile = "/view/fxml/StartLayout.fxml";
        FXMLLoader loader = new FXMLLoader();
        rootLayout = loader.load(getClass().getResourceAsStream(fxmlFile));

        StartLayoutController controller = loader.getController();

        primaryStage.setScene(new Scene(rootLayout));
        primaryStage.show();

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
