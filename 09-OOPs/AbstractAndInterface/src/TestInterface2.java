interface Bank1 {
    float rateOfInterest();
}

class SBI1 implements Bank1 {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB1 implements Bank1 {
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Bank1 b = new SBI1();
        System.out.println("ROI: " + b.rateOfInterest());
    }
}
