public class Parallelepiped implements Formulas{
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
    private double heidth;
    private double lenght;
    private double width;

    public Parallelepiped(double heidth, double lenght, double width) {
       if (heidth<0 || lenght<0 || width<0 ){
           throw new MyException("Can't give a negative numbers!!!");
       } else if (heidth>20|| lenght>20||width>20) {
           throw new MyException("Can't give more than 20!!!");
       }
        this.heidth = heidth;
        this.lenght = lenght;
        this.width = width;
    }

    public double getHeidth() {
        return heidth;
    }

    public void setHeidth(double heidth) {
        this.heidth = heidth;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "heidth=" + heidth +
                ", lenght=" + lenght +
                ", width=" + width +
                '}';
    }

    @Override
    public double area() {

        return 2*(heidth*lenght+(lenght*width+(heidth*width)));
    }

    @Override
    public double value() {
        return (heidth*lenght*width);
    }
}
