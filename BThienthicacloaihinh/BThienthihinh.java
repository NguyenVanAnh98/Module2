package BThienthicacloaihinh;

public class BThienthihinh {
    public static void main(String[] args) {

 //In hình chữ nhật
//        int width = 7;  // Chiều rộng của hình chữ nhật
//        int height = 3;  // Chiều cao của hình chữ nhật
//
//        for (int i = 0; i < height; i++) {  // Vòng lặp ngoài để in từng hàng
//            for (int j = 0; j < width; j++) {  // Vòng lặp trong để in từng ký tự trong hàng
//                System.out.print("*");
//            }
//            System.out.println();  // Xuống dòng sau khi in xong một hàng
//        }


//In hình tam giac vuông
//        int size = 5;  // Kích thước cạnh hình tam giác vuông
//
//        for (int i = size; i >= 1; i--) {  // Vòng lặp để in từng hàng, giảm dần từ size đến 1
//            for (int j = 1; j <= i; j++) {  // Vòng lặp để in các ký tự "*"
//                System.out.print("* ");
//            }
//            System.out.println();  // Xuống dòng sau khi in xong một hàng
//        }
//
 //In hình tam giác cân
        int size = 5;  // Kích thước tam giác

        for (int i = 1; i <= size; i++) {  // Vòng lặp để in từng hàng
            // In khoảng trắng
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // In các ký tự "*"
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();  // Xuống dòng sau khi in xong một hàng
        }
    }
}


