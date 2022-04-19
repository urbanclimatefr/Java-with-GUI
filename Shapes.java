
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Shapes extends Application {

	@Override
	public void start(Stage stage) {

		// create a text field for text input
		TextField ShapeField = new TextField();
		ShapeField.setMaxWidth(300);

		// add a label for users
		Label ShapeLabel = new Label("Enter a shape (semi-circle, rectangle, or pentagon):");
		ShapeLabel.setTextFill(Color.BLACK);
		ShapeLabel.setFont(Font.font("Verdana", 25));

		// add a button to input shape
		Button ShapeButton = new Button();
		ShapeButton.setText("Draw the shape");

		// create a VBox to contain components
		VBox root = new VBox(30);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(ShapeLabel, ShapeField, ShapeButton);

		// create a scene and add it to stage
		Scene scene = new Scene(root, 700, 700);
		stage.setScene(scene);
		stage.setTitle("Shapes");
		stage.show();
		
		ShapeButton.setOnAction(e -> {
			/* validate input and draw shape
			draw circle*/
			if (ShapeField.getText().equals("semi-circle")) {

				Arc arc = new Arc(250, 300, 70, 70, 0, -180);
				arc.setFill(Color.BLACK);
				arc.setType(ArcType.OPEN);
			      
				// show semi-circle
				root.getChildren().add(arc);

				// delete the text field and button
				root.getChildren().removeAll(ShapeLabel, ShapeField, ShapeButton);

				/* inform user to enter a colour
				add a label for users*/
				Label ColorLabel = new Label("Enter a colour (orange, blue or grey):");
				ColorLabel.setTextFill(Color.BLUE);
				ColorLabel.setFont(Font.font("Verdana", 25));

				// create a text field for text input
				TextField ColorField = new TextField();
				ColorField.setMaxWidth(300);

				// add a button to input shape
				Button ColorButton = new Button();
				ColorButton.setText("Change Colour");

				root.getChildren().addAll(ColorLabel, ColorField, ColorButton);

				// colour shape
				ColorButton.setOnAction(e1 -> {
					if (ColorField.getText().equals("orange")) {
						arc.setFill(Color.ORANGE);
					} else if (ColorField.getText().equals("blue")) {
						arc.setFill(Color.BLUE);
					} else if (ColorField.getText().equals("grey")) {
						arc.setFill(Color.GREY);
					} else {
						Alert ErrorAlert = new Alert(AlertType.ERROR);
						ErrorAlert.setHeaderText("Invalid colour.");
						ErrorAlert.setContentText("Please input orange, blue or grey.");
						ErrorAlert.showAndWait();
					}
				});
				// draw rectangle
			} else if (ShapeField.getText().equals("rectangle")) {

				Rectangle rectangle = new Rectangle(400, 200);
				rectangle.setX(125.0f);
				rectangle.setY(125.0f);

				// show rectangle
				root.getChildren().add(rectangle);

				// delete the text field and button
				root.getChildren().removeAll(ShapeLabel, ShapeField, ShapeButton);

				/* inform user to enter a colour
				add a label for users*/
				Label ColorLabel = new Label("Enter a colour (orange, blue or grey):");
				ColorLabel.setTextFill(Color.BLUE);
				ColorLabel.setFont(Font.font("Verdana", 25));

				// create a text field for text input
				TextField ColorField = new TextField();
				ColorField.setMaxWidth(300);

				// add a button to input shape
				Button ColorButton = new Button();
				ColorButton.setText("Change Colour");

				root.getChildren().addAll(ColorLabel, ColorField, ColorButton);

				// colour shape
				ColorButton.setOnAction(e1 -> {
					if (ColorField.getText().equals("orange")) {
						rectangle.setFill(Color.ORANGE);
					} else if (ColorField.getText().equals("blue")) {
						rectangle.setFill(Color.BLUE);
					} else if (ColorField.getText().equals("grey")) {
						rectangle.setFill(Color.GREY);
					} else {
						Alert ErrorAlert = new Alert(AlertType.ERROR);
						ErrorAlert.setHeaderText("Invalid colour.");
						ErrorAlert.setContentText("Please input orange, blue or grey.");
						ErrorAlert.showAndWait();
					}
				});
			} else if (ShapeField.getText().equals("pentagon")) {
				Polygon pentagon = new Polygon();
				pentagon.getPoints().addAll(new Double[] {70.0, 140.0, 
						70.0, 80.0, 
						120.0, 40.0, 
						160.0, 80.0,
						160.0, 140.0});

				// show pentagon
				root.getChildren().add(pentagon);

				// delete the text field and button
				root.getChildren().removeAll(ShapeLabel, ShapeField, ShapeButton);

				/* inform user to enter a colour
				add a label for users*/
				Label ColorLabel = new Label("Enter a colour (orange, blue or grey):");
				ColorLabel.setTextFill(Color.BLUE);
				ColorLabel.setFont(Font.font("Verdana", 25));

				// create a text field for text input
				TextField ColorField = new TextField();
				ColorField.setMaxWidth(300);

				// add a button to input shape
				Button ColorButton = new Button();
				ColorButton.setText("Change Colour");

				root.getChildren().addAll(ColorLabel, ColorField, ColorButton);

				// colour shape
				ColorButton.setOnAction(e1 -> {
					if (ColorField.getText().equals("orange")) {
						pentagon.setFill(Color.ORANGE);
					} else if (ColorField.getText().equals("blue")) {
						pentagon.setFill(Color.BLUE);
					} else if (ColorField.getText().equals("grey")) {
						pentagon.setFill(Color.GREY);
					} else {
						Alert ErrorAlert = new Alert(AlertType.ERROR);
						ErrorAlert.setHeaderText("Invalid colour.");
						ErrorAlert.setContentText("Please input orange, blue or grey.");
						ErrorAlert.showAndWait();
					}
				});
			} else {
				Alert ErrorAlert = new Alert(AlertType.ERROR);
				ErrorAlert.setHeaderText("Invalid shape.");
				ErrorAlert.setContentText("Please input semi-circle, rectangle, or pentagon");
				ErrorAlert.showAndWait();
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
