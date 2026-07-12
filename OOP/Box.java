public class Box {

    double width;
    double height;
    double depth;

    // Parameterized Constructor
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Box box = new Box(5, 4, 3);

        System.out.println("Width : " + box.width);
        System.out.println("Height: " + box.height);
        System.out.println("Depth : " + box.depth);
        System.out.println("Volume: " + box.volume());
    }
}