class Rac
{
int l,b;
int Area;
Rac(int x, int y);
{
l= x;
b=y;
}
int area()
{
return l*b;
}
}
class Area
{
public static void mian(String[]args)
{
Rac m = new Rac(5,10);
int n =m.Area();
system.out.println("Area of ....."+n);
}
}
.   C