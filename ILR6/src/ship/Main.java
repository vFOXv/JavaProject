package ship;

public class Main {
    public static void main(String[] args) {
        Boat raft = new Raft("Raft", "Potemkin", 200, "yellow");
        Boat ship = new Ship("Ship", "Bustrui", 5000, "green");
        Boat array[] = {new Raft("Raft", "Potemkin", 200, "yellow"),
                new Ship("Ship", "Bustrui", 5000, "green")};
        System.out.println("Its array ===>");
        for (Boat boatTMP : array) {
            boatTMP.outputObject();
            boatTMP.outputName();
            boatTMP.outputWeight();
            boatTMP.outputColour();
            System.out.println(" ");
        }
        System.out.println("Its look on child over parent ===>");
        raft.outputObject();
        raft.outputName();
        raft.outputWeight();
        raft.outputColour();
    }
}
