public class Demo{
    public static void printLoop(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        if(args.length==0){
            printLoop(5);
        } else {
            printLoop(Integer.parseInt(args[0]));
        }
    }
}
