// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // cau1:
        String hoten = "Nguyễn Thị Thu Uyên";
        System.out.println("Họ tên: " + hoten);

        String ngaysinh = "07/12/1998";
        System.out.println("Ngày tháng năm sinh: " + ngaysinh);

        String nganhhoc = "Công nghệ Thực phẩm";
        System.out.println("Chuyên ngành học: " + nganhhoc);

        String muctieu = "Em muốn thông qua khóa học Java để biết mình có theo được auto test không. Để nâng cao trình độ thì nên học auto test.";
        System.out.println("Mục tiêu/ lý do học auto test: " + muctieu);
        }
    }

    class Cau2 {
    public static void main(String[] args) {
        //cau 2
        Scanner scanner = new Scanner (System.in);
        int N;
        do {
            System.out.println("Nhập số N (2<=N<=20): ");
            N = scanner.nextInt();
        } while (N <2 || N >20);

        System.out.println("Bảng cửu chương cho số " + N + " là: ");
        for (int i=1; i<=10; i++) {
            int kq = N*i;
            System.out.println(N + "x" + i + "=" + kq);
           }
    }}

class Cau5 {
    public static void main(String[] args) {
        //GPT Bac 2 ax^2+bx+c=0
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a==0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất: " + x); }
            }
        else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double y = b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x1 = x2 = " + y); }
            else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiệm của phương trình là x1 = " + x1 + " và x2 = " + x2);
            }
        }
            }
        }

class Cau3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // K cần khai báo nhập số lượng phần tử: for (i=0; i<mangN.length; i++);

        // Nhập số lượng phần tử của mảng số N
        System.out.println("Nhập số lượng phần tử của mảng N: ");
        int n = scanner.nextInt();

        // Khai báo mảng
        int[] mangN = new int[n];

        // Nhập các phần tử của mảng từ người dùng
        for (int i=0;i<n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            mangN[i] = scanner.nextInt();}

        // Danh sách các số chẵn trong mảng
        System.out.println("Danh sách các số chẵn trong mảng: ");
        for (int j=0;j<n; j++) {
            if(mangN[j] % 2==0) {
                System.out.println(mangN[j]);}}

        //Danh sách các số lẻ trong mảng
            System.out.println("Danh sách các số lẻ trong mảng: ");
            for (int k=0;k<n; k++) {
                if (mangN[k] % 2 != 0) {
                    System.out.println(mangN[k]);
                }
            }}}

class Cau4 {
    public static void main(String[] args) {
        // Khai báo mảng arr
        int[] arr = {2,7,6,8,9,21,34,56,32,12,37};
        //1. Tìm phần tử max, in ra
        int max = arr[0];
        int vitri = 0;
        for (int u=1; u < arr.length; u++){
            if (arr[u] > max) {
                max = arr[u];
                vitri = u;
            }
        }

        // Hiển thị số lớn nhất và vị trí của nó
        System.out.println("Số lớn nhất trong mảng là: " + max);
        System.out.println("Vị trí của số lớn nhất trong mảng là: " + vitri);

        //2. Tính tổng số đầu tiên và cuối cùng
        int a= arr[0];
int b=arr[arr.length -1];
      int x=a+b;
        System.out.println("Tổng đầu cuối: " + x);
//3. Tính tổng các số chẵn trong mảng
int tongsochan =0;
        for (int m =0; m<arr.length; m++) {
if (arr[m]%2==0) {
tongsochan +=arr[m];}}
            System.out.println("Tổng số chẵn trong mảng: " + tongsochan);}
}