public class ArrayUpdate {

    static  void updateElement(int arr[], int n, int x, int pos){
        for(int i=n-1; i >= pos; i--){
            arr[i+1]=arr[i];
            arr[pos]=x;
        }
    }

    public static void main(String[] args) {

        int arr[]=new int[10];
        arr[0]=3;
        arr[1]=6;
        arr[2]=12;
        arr[3]=15;
        arr[4]=18;
        arr[5]=21;

        int n=6;
        int x=9;
        int pos=2;

        System.out.println("Before insert:-");
        for (int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        updateElement(arr, n, x, pos);
        n=n+1;

        System.out.println("\nAftre insert:-");
        for (int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
