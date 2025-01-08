import java.util.List;

public class ParkingLot {
    List<Floor> floors;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;

    ParkingLot(List<Floor> floors, List<EntryGate> entryGates, List<ExitGate> exitGates) {
        this.floors = floors;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
    }
}
