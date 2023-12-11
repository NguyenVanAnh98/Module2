package BThienthi20songuyento;

public class BT_hienthi20songuyento {
    public static void main(String[] args) {
        //Sử dụng While:
//        int count = 0;
//        int number = 2;
//
//        System.out.println("20 số nguyên tố đầu tiên là:");
//
//        while (count < 20) {
//            if (isPrime(number)) {
//                System.out.print(number + " ");
//                count++;
//            }
//            number++;
//        }
//    }
//
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//
//        int divisor = 2;
//        while (divisor <= Math.sqrt(num)) {
//            if (num % divisor == 0) {
//                return false;
//            }
//            divisor++;
//        }
//
//        return true;

        //Sử dụng For:
        int count = 0;

        System.out.println("20 số nguyên tố đầu tiên là:");

        for (int number = 2; count < 20; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}