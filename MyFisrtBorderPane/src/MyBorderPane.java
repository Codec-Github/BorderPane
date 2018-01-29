
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MyBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane borderpane = new BorderPane();

		borderpane.setTop(showRegion("Top","#008999ff"));
		borderpane.setLeft(showRegion("Left","#910f66"));
		borderpane.setCenter(showRegion("Center","#90ee90ff"));
		borderpane.setRight(showRegion("Right","#b22222ff"));
		borderpane.setBottom(showRegion("Bottom","#30126d"));

		//borderpane.setTop(new Button("top button"));
		//borderpane.setLeft(new Button("left button"));
		//borderpane.setCenter(new Button("center button"));
		//borderpane.setRight(new Button("Right button"));
		//borderpane.setBottom(new Button("bottom button"));

		Scene scene = new Scene(borderpane,400,400);
		primaryStage.setTitle("Border Layout Example");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public Node showRegion(String myText, String bgColor){

		StackPane pane = new StackPane();
		pane.setStyle("-fx-background-color:"+bgColor);
		pane.setAlignment(Pos.CENTER);

		Button btn = new Button(myText);
		btn.setAlignment(Pos.CENTER);

		pane.getChildren().add(btn);
		return pane;

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
