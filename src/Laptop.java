public class Laptop extends Computer {
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)
    private boolean trackPadCalibrated;

    public Laptop(int screenSize, int memory) {
        this.screenSize = screenSize;
        this.memory = memory;
        trackPadCalibrated = false; // default value
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }

    public void calibrateTrackpad() {
        if (!trackPadCalibrated) {
            trackPadCalibrated = true;
            System.out.println("Calibration complete!");
        } else {
            System.out.println("No need to calibrate");
        }
    }
}