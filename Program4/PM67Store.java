package perdiguero;


// New class to store state and license plate
public class PM67Store {
	// State and plate number
	private String state;
    private String license;

    // Constructor
    public PM67Store(String state, String license) {
        this.state = state;
        this.license = license;
    }
    
    // Accessor for state
    public String getState() {
        return state;
    }

    // Mutator for state
    public void setState(String state) {
        this.state = state;
    }

    // Accessor for license
    public String getLicense() {
        return license;
    }

    // Mutator for license
    public void setLicense(String license) {
        this.license = license;
    }
}
