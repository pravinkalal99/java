
class A
{
	void display()
{
System.out.println("first method:");
}
void display(int x)
{
System.out.println("second method :"+n);
}
void display(int x,int y)
{
System.out.println("third...."+(x+y));
}
double display(double x, double y)
{
return x+y;
}
}
class B 
{
public static void main(String[]args)
{
A. display();
A.display(10);
A.display(10,20);
A.display(20.0,28.0);
}
}