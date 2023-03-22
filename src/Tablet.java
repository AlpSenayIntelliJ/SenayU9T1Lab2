public class Tablet extends Computer {
    private int screenSize; // in inches
    private int memory; // in gigabytes (GB)
    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded) {
        this.screenSize = screenSize;
        this.memory = memory;
        this.stylusIncluded = stylusIncluded;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }
}
