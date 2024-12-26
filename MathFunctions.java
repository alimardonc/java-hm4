public class MathFunctions {
    static double pi, e;

    public MathFunctions(double pi, double e) {
        this.pi = pi;
        this.e = e;
    }

    public void CalculateUchburchak(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Uchburchakning yuzi " + s);
    }

    public void CalculateDoira(int r) {
        double s = pi * r * r;
        System.out.println("Doiraning yuzi " + s);
    }

    public void CalculatePow(int a) {
        System.out.println("e^a " + Math.pow(e, a));
    }
}
