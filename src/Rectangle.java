public class Rectangle {
    // 1. Khai báo 2 thuộc tính private (đảm bảo tính đóng gói)
    private double width;
    private double height;

    // Constructor để thiết lập giá trị ban đầu khi tạo đối tượng
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 2. Phương thức trả về giá trị: Tính diện tích
    public double getArea() {
        return width * height;
    }

    // 3. Phương thức trả về giá trị: Tính chu vi
    public double getPerimeter() {
        return (width + height) * 2;
    }

    // 4. Phương thức không trả về giá trị (void): In thông tin
    public void printInfo() {
        System.out.println("\n--- THÔNG TIN HÌNH CHỮ NHẬT ---");
        System.out.println("Chiều rộng (width): " + width);
        System.out.println("Chiều cao (height): " + height);
        // Gọi trực tiếp các phương thức getArea() và getPerimeter() bên trong class
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println("-------------------------------");
    }
}
