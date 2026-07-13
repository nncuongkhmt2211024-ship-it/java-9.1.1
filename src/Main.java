import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double w = scanner.nextDouble();

        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double h = scanner.nextDouble();

        // 5. Tạo 1 object Rectangle và truyền giá trị qua constructor
        Rectangle myRectangle = new Rectangle(w, h);

        // 6. Gọi phương thức in kết quả ra màn hình
        myRectangle.printInfo();



        scanner.close();
    }
}