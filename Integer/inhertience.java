 class Shape{
      public void area(){
        System.out.println("Area of riangle");
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
    System.out.println("Area of rectangle"+area);
  }
}
public class inheritance{
public static void main(String []args)
{
rectangle obj=new rectangle(2.3,22.2);
obj.area();
}
}
