package perdiguero;


import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class PM67FirstFX extends Application {

    // Variables to store input box contents
    private String state = "";
    private String license = "";

    public void start(Stage stage) {
    	
    	// Create PM67LPDB object
    	final PM67LPDB lpdb = new PM67LPDB("LicensePlates.txt");
		// Load data from file
		lpdb.getPlates();

        // ArrayList to store license plates
        ArrayList<PM67Store> LicenseList = new ArrayList<>();

        stage.setTitle("PM67 | Register your car:");
        System.getProperty("java.version");
        System.getProperty("javafx.version");

        // Top portion, created two labels with each text field and two buttons

        HBox topHBox = new HBox(10);
        topHBox.setPadding(new Insets(5));

        Label stateLabel = new Label("State:");
        TextField stateTextField = new TextField();

        Label licenseLabel = new Label("License:");
        TextField licenseTextField = new TextField();

        Button registerButton = new Button("Register");
        Button printButton = new Button("Print List");
        
        // Create the "Save" button
        Button saveButton = new Button("Save");

        
        // Bottom portion, created a TextArea

        TextArea printArea = new TextArea();
        printArea.setEditable(false);

        BorderPane root = new BorderPane();
        root.setTop(topHBox);
        root.setCenter(printArea);

        // Event handling for Save button
        saveButton.setOnAction(e -> {
            lpdb.savePlates();
            printArea.appendText("Data saved successfully!\n");
        });

        // Event handling for Register button
        registerButton.setOnAction(e -> {
            String inputState = stateTextField.getText().toUpperCase();
            String inputLicense = licenseTextField.getText().toUpperCase();

            // Validate state
            boolean validState = inputState.equals("MISSOURI") || inputState.equals("MO") || inputState.equals("KANSAS") || inputState.equals("KS");

            // Validate license plate
            boolean validLicense = false;
            if (inputState.equals("MISSOURI") || inputState.equals("MO")) {
            	validLicense = inputLicense.matches("[A-Z]{1}\\s*[A-Z]{1}\\s*[0-9]{1}\\s*[A-Z]{1}\\s*[0-9]{1}\\s*[A-Z]{1}");
            } else if (inputState.equals("KANSAS") || inputState.equals("KS")) {
            	validLicense = inputLicense.matches("[A-Z]{1}\\s*[A-Z]{1}\\s*[A-Z]{1}\\s*[0-9]{1}\\s*[0-9]{1}\\s*[0-9]{1}\\s*");
            }

            if (validState && validLicense) {

                // Check for duplicate license plates
                boolean duplicate = false;
                for (PM67Store info : LicenseList) {
                    if (info.getLicense().equals(inputLicense)) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    state = inputState;
                    license = inputLicense;
                    // Add data to ArrayList
                    LicenseList.add(new PM67Store(state, license));
                    // Add data to LPDB object
                    PM67Store newPlate = new PM67Store(state, license);
                    lpdb.addPlate(newPlate);
                    
                    printArea.appendText("Data was valid. Registered!\n");
                    // Clear text fields
                    stateTextField.clear();
                    licenseTextField.clear();
                } else {
                    printArea.appendText("Error: License plate already registered.\n");
                }
            } else {
                if (!validState) {
                    printArea.appendText("Error: Invalid state. Please enter either Missouri (MO) or Kansas (KS).\n");
                }
                if (!validLicense) {
                    printArea.appendText("Error: Invalid license plate format.\n");
                }
            }
        });

        // Event handling for Print List button
        printButton.setOnAction(e -> {
            for (PM67Store info : LicenseList) {
                printArea.appendText("State: " + info.getState() + "\nLicense: " + info.getLicense() + "\n\n");
            }
        });

        topHBox.getChildren().addAll(stateLabel, stateTextField, licenseLabel, licenseTextField, registerButton, printButton, saveButton);

        Scene scene = new Scene(new StackPane(root), 640, 480);
        stage.setScene(scene);

        stage.show();
    } // end start()

    public static void main(String[] args) {
        launch(args);  // Run this Application.
        
    }

} // end class FirstFX


/* Reflection HW07:
 * (a) What’s the hardest part of this assignment for you? Please explain.
 * The hardest part of this assignment was the writing the code for the event handling and checking if
 * it was duplicated. The syntax was new for me and you had to take a lot of things into account
 * (b) Identify at least one thing that you like or dislike about GUI programs. Provide a brief explanation.
 * I like how GUI programs allow you to actually see what your program generates and it lets you interact with it.
 * However, the downloading process was not easy and I am not sure of how it will work with other devices.
*/


/* Reflection HW08:
 * (a) What’s the hardest part of this assignment for you? Please explain.
 * I think the hardest part was working with the exceptions and the try/catch. It was something new to me and
 * I had to really understand what was doing before trying to code it so it took me a bit, but I can now say
 * that I understand them and I can work with them.
 * (b) Identify at least one thing that you like or dislike about exception handling. Provide a brief explanation
 * One thing I like about exception handling is its capacity to keep error-handling code apart from regular 
 * program using try-catch blocks to isolate it, helping to keep the program's logic organized.
 */


