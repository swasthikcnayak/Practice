abstract class Vehicle {
    int registrationNumber;
    int vehicleType;
    Vehicle(int rno, int vt){
        this.registrationNumber = rno;
        this.vehicleType = vt;
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(int rno){
        super(rno, 0);
    }
}


class FourWheeler extends Vehicle {
    FourWheeler(int rno){
        super(rno, 1);
    }
}

