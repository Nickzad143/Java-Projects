class Truck extends Vehicle {
    private int cargocap; 

    Truck(int p, int f, int m, int c) {
        super(p, f, m); 
        cargocap = c;
    }
    int getCargoCap() { return cargocap; }
    void setCargoCap(int c) { cargocap = c; }
}
