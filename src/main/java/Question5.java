package src.main.java;

public class Question5 {
    public static int[] vectorAdd(int x,int y,int dx, int dy) {
        x=x+dx;
        y=y+dy;
        int [] results = {x,y};
        return results;
    }
public static void main(String[] args) {
int a=2;
int b=3;
int[] results = vectorAdd(a,b,1,1);
a = results[0];
b = results[1];
System.out.println(a+" "+b);
}
}
