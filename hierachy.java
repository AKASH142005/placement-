class Shape{
    public void area(){
      System.out.println("");
    }
}
class rectangle extends Shape{
private double length;
private double breadth;
public rectangle(double length,double breadth){
  this.length= length;
  this.breadth=breadth;
}
public void area(){
  double area= length*breadth;
  System.out.println("Area of rectangle:"+area);
}
}
class triangle extends Shape{
    private double heigth;
    private double breadth;
    public triangle(double heigth,double breadth){
        this.heigth=heigth;
        this.breadth=breadth;
    }
    public void area(){
       double area=(0.5)*heigth*breadth;
       System.out.println("area of triangle:"+area);
    }  
}
class Square extends Shape{
    private double length;
    public Square(double length){
        this.length=length;
    }
    public void area(){
       double area=length*length;
       System.out.println("area of sqaure:"+area);
    }  
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void area(){
       double area=radius*radius;
       System.out.println("area of circle:"+area);
    }  
}
public class hierachy{
public static void main(String []args)
{
rectangle obj=new rectangle(2.3,22.2);
obj.area();
triangle obj1=new triangle(4,5);
obj1.area();
Square obj2=new Square(4);
obj2.area();

Circle obj3=new Circle(4);
obj3.area();
}}

