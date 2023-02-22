public class Ternary1 {
    public static void main(String[] args) {
        int a=30,b=20,c=40;
        int res=(a<b)?a:b;
        System.out.println(res);
        String result=(a<b)?"a is less": "b is less";
        System.out.println(result);

        int num=(a>b)?(a<c ?a:b): (b<c ? b:c);
        System.out.println(num);
    }
    
}
