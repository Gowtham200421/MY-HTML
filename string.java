import java.util.*;
class main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)
    }
}
int n=sc.nextInt();
    sc.nextLine();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextLine();
    }
    //System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
    for(String i: arr){
        System.out.print(i+" ");
    }