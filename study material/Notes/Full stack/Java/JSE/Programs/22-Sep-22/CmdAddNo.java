"class CmdAddNos {
    public static void main(String[] args) {
        int n=args.length;
        if(n<2){
            System.out.println("Please input atleast 2 nos");
            System.exit(0);
        }
        int sum=0;
        for(String x:args){
            sum=sum+Integer.parseInt(x);
        }
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+(float)sum/n);
    }
}
