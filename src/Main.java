import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Параллелепипедтин площадь жана объёмун эсептеген бир программа жазабыз.
//        Фигуранын параметрлерин(длина, ширина, высота) берип жатканда туура эмес маалымат
//        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//                Мумкун болгон каталар:
//        1) берилген маалымат терс сан болсо
//        2) берилген маалымат сан эмес тамга болсо
//        3) берилген сандар 20 дан чон болсо
//
//
//                - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//        -Формулалар Parallelepiped классында жазылуусу керек
        try {
        Scanner scanner =new Scanner(System.in);
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            System.out.print("Wight: ");
            double wight = scanner.nextDouble();
            Parallelepiped parallelepiped=new Parallelepiped(height,length,wight);
            System.out.println(parallelepiped);
            System.out.println(parallelepiped.area());
            System.out.println(parallelepiped.value());
        }catch (InputMismatchException e){
            System.out.println("no letters allowed!!!");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}