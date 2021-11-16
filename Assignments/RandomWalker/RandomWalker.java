public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        System.out.println("(" + x + "," + y + ")");
        for(int i=0; i<n; i++) {
            int rand = (int)(Math.random()*(3+1));
            if(rand==0){
                x++;
            }
            if(rand==1){
                y++;
            }
            if(rand==2){
                y--;
            }
            if(rand==3){
                x--;
            }
            System.out.println("(" + x + "," + y + ")");
        }
        double distance = x*x + y*y;
        System.out.println("Squared distance = " + distance);
    }
}
