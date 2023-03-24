public class GamingDesktop extends Desktop {
    private String grapCard;
    public GamingDesktop(int screenSize, int memory, int monitorIncluded, String grapCard) {
        super(screenSize, memory, true);
        this.grapCard = grapCard;
    }
    public void updateDrivers() {
        System.out.println("Drivers updated!");
    }
}