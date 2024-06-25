import java.util.Scanner;

class shape {
    double dimension;
    shape(double dimension){
        this.dimension=dimension;
    }
}
class circles extends shape{
    double area;
    double circumference;
    circles(double dimension) {
        super(dimension);
    }

    void area(){
        area = 3.14*dimension*dimension;
        System.out.println("Area of the circle is :"+area);
    }
    void circumference(){
         circumference= 2*3.14*dimension;
         System.out.println("Circumference of the circle is :"+circumference);
    }
}
class square extends shape{
    double area,perimeter,length;
    square(double dimension){
        super (dimension);
    }
    void area(){
        area=(dimension*dimension);
        System.out.println("Area of the square is:"+area);
    }
    void perimeter(){
        length= 4*dimension;
        System.out.println("length of the square is: "+length);
    }
}
public void main(String[] args){
    double dimension;
    System.out.println("Enter the dimension:");
    Scanner sc= new Scanner(System.in);
    dimension= sc.nextDouble();
    square a = new square(dimension);
    a.perimeter();
   a.area();
   circles b=new circles(dimension);
   b.area();
   b.circumference();
}