public class FindDuplicate {
   public static void main(String args[]) {
      int i=0;
      int j=0;
      int a[]=new int[args.length];
      for(i=0;i<args.length;i++) {
         a[i]=Integer.parseInt(args[i]);
      }
      boolean answer=false;
      for(i=0;i<args.length;i++) {
          for(j=i+1;j<args.length;j++) {
               if(a[i]==a[j]){ 
                   answer=true;
               }
          }
      }
      System.out.println(answer);
   }
}
