package p1;
class Info
    {
        protected void show()
        {
            System.out.println("fiiiii");
        }
    }
package p2 import p1.Info;
class B1 extend Info
    {
        public static void main(String[]args)
        {
            B1.a = new B1();
            a.show();
        }
    }