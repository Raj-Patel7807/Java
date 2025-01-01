public class sortingAlgo {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int minIdx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i=1; i<n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void printArr(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 4, 7};

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);

        printArr(arr);
    }    
}
