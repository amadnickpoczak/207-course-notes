public class Rectangle {
    private double width;
    private double height;

    /**
     * Initialize the rectangle.
     *
     * @param w width
     * @param h height
     */
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    /**
     * Calculate the rectangle's area.
     *
     * @return the area
     */
    public double area() {
        return width * height;
    }

    /**
     * Scales the rectangle.
     *
     * @param factor the factor to scale by
     */
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    /**
     * Get whether this rectangle is larger than another.
     *
     * @param other the other rectangle
     * @return whether this rectangle is larger than another
     */
    public boolean isLargerThan(Rectangle other) {
        if (area() > other.area()) {
            return true;
        } else {
            return false;
        }
    }
}
