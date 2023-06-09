package P01_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double calculateSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.length * this.width + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.length * this.height + 2 * this.height * this.width;
    }

    public double calculateVolume() {
        return this.length * this.height * this.width;
    }

    private boolean isGreaterThanZero(double number) {
        return number > 0;
    }

    public void setLength(double length) {
        if (!isGreaterThanZero(length)) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (!isGreaterThanZero(width)) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (!isGreaterThanZero(height)) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
}
