class Box
{
int l,b,h;
int vol;
Box(int x,int y, int z)
{
l=x;
b=y;
h=z;
}
int volume()
{
return l*b*h;
}
}
class Call{
public static void main(String[]args)
{
Box m = new Box(5,10,15);
int n= m.volume();
System.out.println("volume is "+n);
}
}
