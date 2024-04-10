public class ArrayInsertElement {
    static int addElement(int arr[], int element, int n, int volume){
        if(n>=volume){
            return n;
        }
        else{
            arr[n]=element;
            return (n+1);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[20];
        arr[0]=2;
        arr[1]=4;
        arr[2]=6;
        arr[3]=8;
        arr[4]=10;
        arr[5]=12;
        arr[6]=14;
        arr[7]=16;
        int volume=20;
        int n=7;
        int element=18;
        System.out.println("Before insertion:-");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        n=addElement(arr,element,n,volume);
        System.out.println("\nAfter insertion:-");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
