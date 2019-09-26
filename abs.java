import java.util.*;
abstract class shape
{
    int a;
    int b;
    shape()
    {
    }
    abstract void printarea();
}

class rectangle extends shape
{
    rectangle()
    {
    }
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
    void printarea()
    {
        System.out.println("Area of rectangle is:"+(a*b));
    }
}

 class triangle extends shape
{
    triangle()
    {
    }
    void getdata(int x,int y)
    {
        a=x;
        b=y;
    }
    void printarea()
    {
        double area=0.5*a*b;
         System.out.println("Area of triangle is:"+area);
    }
} 

 class circle extends shape
{
    circle()
    {
    }
    void getdata(int x)
    {
        a=x;
    }
    void printarea()
    {
        double area=3.14*a*a;
         System.out.println("Area of circle is:"+area);
    }
}

class shapemain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("ENTER YOUR CHOICE\n1.Rectangle\n2.Triangle\n3.circle");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter length and breath");
                int l=sc.nextInt();
                int b=sc.nextInt();
                rectangle ob1 = new rectangle();
                ob1.getdata(l,b);
                ob1.printarea();
                break;
                
            case 2:
              System.out.println("Enter base and heigth");
                int b1=sc.nextInt();
                int h=sc.nextInt();
                triangle t=new triangle();
                t.getdata(b1,h);
                t.printarea();
                break;
            case 3:
              System.out.println("Enter radius of the circle"); 
              int r1=sc.nextInt();
              	circle c=new circle();
                c.getdata(r1);
                c.printarea();
                break;
                default: System.out.println("WRONG CHIOICE");
         }
    }
}
                
