class Avg{
public static void main(String[] args){
int a[]={31,28,31,30,10};
int sum=0;
float avg1=0;

for(int i=0; i<a.length; i++){
sum=sum+a[i];
}
avg1=(float)(sum/a.length);

System.out.println("average"+avg1);
}
}