
public class Average {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double ave = 0;
        if(args.length!=0) {
            int[] num = new int[args.length];
            for(int i =0; i < args.length; i++) {
                num[i] = Integer.parseInt(args[i]);
                ave += num[i];
            } 
                ave = ave/args.length;
                
            System.out.println("The average is: " +  ave);
        }else {
            System.out.println("No arguments");
        }
    }

}
