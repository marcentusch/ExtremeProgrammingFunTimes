import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Flemmer on 13-09-2016.
 */
public class CrosswordGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ArrayList<String> treOrd = new ArrayList<>();

        treOrd.add("a");
        treOrd.add("b");
        treOrd.add("c");


    ObservableList<String> listOfWords = FXCollections.observableArrayList(treOrd);
    TableView<String> tableView = new TableView<>();
    //tableView.itemsProperty().setValue(listOfWords);
    tableView.setItems(listOfWords);




        TableColumn column = new TableColumn("Words");
        //column.setCellValueFactory(new PropertyValueFactory<>());
        column.setCellFactory(TextFieldTableCell.forTableColumn());



        tableView.getColumns().addAll(column);
        tableView.setEditable(false);



        GridPane pane = new GridPane();
        pane.getChildren().add(tableView);


        Scene crosswordScene = new Scene(pane,240,240);

        Stage pStage = new Stage();
        pStage.setScene(crosswordScene);
        pStage.setTitle("Crossword puzzle");
        pStage.setHeight(600);
        pStage.setWidth(600);
        pStage.show();

    }
}
