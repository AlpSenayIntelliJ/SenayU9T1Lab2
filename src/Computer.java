public class Computer {
    private int screenSize;
    private int memory;

    public Computer(int screenSize, int memory) {
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }

    public void printInfo() {
        System.out.println("Screen size: " + screenSize);
        System.out.println("Memory: " + memory);
    }
}