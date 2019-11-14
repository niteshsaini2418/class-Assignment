import java.util.*;
class Que3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        System.out.println("Enter value of K");
        int k=sc.nextInt();
        int array[]=new int [size];
        System.out.println("Enter elements of Array");
        for(int i=0;i<size;i++)
        array[i]=sc.nextInt();

        int count=0;

        size=size-k+1;
        count=(size*(size+1))/2;
        System.out.println("Output");
        System.out.print(count);
    }
}