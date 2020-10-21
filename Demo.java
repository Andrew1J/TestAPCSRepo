public class Demo{
    public static void main(String args[]){
        int[] a = {1};
        int[] b = {1,2};
        int[] c = {1,2,3};
        int[] d = {1,2,3,4};
        int[] e = {1,2,3,4,5};
        int[][] test = new int[5][];
        test[0] = a;
        test[1] = b;
        test[2] = c;
        test[3] = d;
        test[4] = e;
        System.out.println(arrToString(a));
        System.out.println();
        System.out.println(arrDeepToString(test).replace("}, ","},\n "));
        System.out.println();
        System.out.println(arrDeepToString(create2dArray(4,4,4)).replace("}, ","},\n "));
        System.out.println();
        System.out.println(arrDeepToString(create2dArrayRandomized(4,10,100)).replace("}, ","},\n "));
    }
    public static int[][] create2dArray(int rows, int cols, int maxValue){
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = (int)Math.floor(Math.random()*(maxValue+1));
            }
        }
        return arr;
    }
    public static int[][] create2dArrayRandomized(int rows,int cols,int maxValue){
        int[][] arr = new int[rows][];
        for(int i=0;i<rows;i++){
            int temp = (int)Math.floor(Math.random()*(cols+1));
            arr[i] = new int[temp];
            for(int j=0;j<temp;j++){
                arr[i][j] = (int)Math.floor(Math.random()*(maxValue+1));
            }
        }
        return arr;
    }
    public static void printLoop(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static String arrToString(int[] arr){
        String string = "{";
        for(int i=0;i<arr.length-1;i++){
            string += arr[i];
            string += ", ";
        }
        if(arr.length>=1){
            string += arr[arr.length-1];
        }
        string += "}";
        return string;
    }
    public static String arrDeepToString(int[][] arr){
        String string = "{";
        for(int i=0;i<arr.length;i++){
            string += arrToString(arr[i]);
            if(i!=arr.length-1){
                string += ", ";
            }
        }
        string += "}";
        return string;
    }
}
