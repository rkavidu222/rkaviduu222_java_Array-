public class ArrayDeleteElement {
    static  int accessElement(int arr[],int n, int element){
        for(int i=0; i<n; i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    static int removeElement(int arr[], int n, int element){
        int pos=accessElement(arr, n, element);
        if (pos==-1){
            System.out.println("Element not found!");
            return -1;
        }
        else{
            int i;
            for (i=pos; i<n-1; i++ ){
                arr[i]=arr[i+1];
            }
            return n-1;
        }
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n= arr.length;
        int element =30;

        System.out.println("Before removing:-");
        for (int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        n=removeElement(arr,n,element);
        System.out.println("After remove:-");
        for (int i=0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
