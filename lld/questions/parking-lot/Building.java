import java.util.List;

public class Building {
    List<Floor> floors;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;

    Building(List<Floor> floors, List<EntryGate> entryGates, List<ExitGate> exitGates) {
        this.floors = floors;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
    }
}
