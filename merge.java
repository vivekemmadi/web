package udemy;

public class merge {
    public static void main(String args[]){
        byte a = 9,b=12;
        byte c =0;
        c = (byte)(a|c);
        b = (byte)(b<<4);
        c = (byte)(b|c);
        System.out.println(c&0b00001111);
        System.out.println((c&0b11110000)>>4);
        System.out.println("sum of"+a+"and"+b+"is"+(a+b));
    }
}
