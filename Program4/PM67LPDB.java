package perdiguero;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PM67LPDB {

    private ArrayList<PM67Store> plates;
    private String filename;

    public PM67LPDB(String filename) {
    	// opens the specified data file, reads state and number, creates LicensePlate objects and populates the ArrayList, then closes the file
        this.filename = filename;
        plates = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    plates.add(new PM67Store(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
        	System.err.println("Error: Unable to load data from file.");
            e.printStackTrace();
            System.exit(1);
        }
    }
    

    public ArrayList<PM67Store> getPlates() {
        // returns a copy of the ArrayList 
        return new ArrayList<>(plates);
    }

    public boolean addPlate(PM67Store onePlate) {
    	// adds one LicensePlate to the ArrayList, at the end
        return plates.add(onePlate);
    }

    public void savePlates() {
    	// writes the data in the entire ArrayList back to the original file.
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (PM67Store plate : plates) {
                writer.println(plate.getState() + "," + plate.getLicense());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}