public class Desktop extends Computer {
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)
    private boolean monitorIncluded;

    public Desktop(int screenSize, int memory, boolean monitorIncluded) {
        this.screenSize = screenSize;
        this.memory = memory;
        this.monitorIncluded = monitorIncluded;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }

    public void replaceTowerCasing() {
        System.out.println("Replaced tower case!");
    }
}