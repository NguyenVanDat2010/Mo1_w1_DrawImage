import java.util.Scanner;
public class DrawImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:\n" + "Draw the triangle(1)\n" + "Draw the square(2)\n" + "Draw the rectangle(3)\n" + "Exit(0)\n" + "Enter your choice: ");
        int i =scanner.nextInt();
        while (i>3||i<0){
            System.out.println("Vui lòng nhập lại số thứ tự bạn chọn: ");
            i =scanner.nextInt();
        }
        switch (i){
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******\n"+"*****\n"+"****\n"+"***\n"+"**\n"+"*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("******\n"+"******\n"+"******\n"+"******\n"+"******\n"+"******");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("******\n"+"******\n"+"******");
                break;
            default:
                break;
        }
    }
}