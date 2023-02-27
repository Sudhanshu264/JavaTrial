public class forEachArray {
    public static void main(String[] args) {
        int nums[][] = {
            {1,3,5,7},
            {2,4,6,8},
            {1,2,3,4}
        };
        for(int a[]: nums)
        {
            for(int b :a)
            {
                System.out.print(b);
            }
            System.out.println(" ");
        }

    }
}
