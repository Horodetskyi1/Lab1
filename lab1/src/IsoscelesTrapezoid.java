public class IsoscelesTrapezoid {
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height) {
        if (baseA <= 0 || baseB <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основи та висота повинні бути більшими за 0");
        }
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double getMidline() {
        return (baseA + baseB) / 2.0;
    }

    public double getArea() {
        return getMidline() * height;
    }

    public double getLeg() {
        double diff = Math.abs(baseA - baseB) / 2.0;
        return Math.sqrt(Math.pow(height, 2) + Math.pow(diff, 2));
    }

    public double getPerimeter() {
        return baseA + baseB + 2 * getLeg();
    }

    public double getDiagonal() {
        double sumHalf = (baseA + baseB) / 2.0;
        return Math.sqrt(Math.pow(height, 2) + Math.pow(sumHalf, 2));
    }
}