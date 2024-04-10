public class ArrSearch {
    static  int accessElement(int arr[],int n, int element){
        for(int i=0; i<n; i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n= arr.length;
        int element=50;

        int position=accessElement(arr, n, element);

        if(position==-1)
            System.out.println("element not found!");
        else
            System.out.println("element found in position "+(position+1));
    }
}
