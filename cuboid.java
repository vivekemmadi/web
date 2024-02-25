package udemy;

import java.util.Scanner;

public class cuboid {
    public static void main(String args[]){
        int l,b,h;
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length,breadth , height");
        l = sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        x=2*(1*h);
        y=2*(l*b);
        z=2*(b*h);
        int area =(x+y+z);
        System.out.println(area);
        int v=l*b*h;
        System.out.println(v);
    }
    
}
