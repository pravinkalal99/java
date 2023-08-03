class Box{
int w=5;
int l=10;
int k=15;
int vol;
void display(){
vol = l*b*h;
system.out.println("volume of box"+vol);
}
}
class Box2{
public static void main(String[]args){
Box b=new Box();
b.display();
}
}