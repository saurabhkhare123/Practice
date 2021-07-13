class MergeSort {
    public static void main(String args[]){
        int arr[] = {34,2,23,434,2332,11,3,4,1};
        int merged[] = mergeSort(arr,0,arr.length-1);
        for(int i : merged){
            System.out.println(i);
        }
    }
    public static int[] mergeSort(int[] arr,int start, int end)
    {
        if (start == end) {
            int[] br = new int[1];
            br[0] = arr[start];

            return br;
        }
        int mid = (start+end)/2;
        int[] left= mergeSort(arr,start,mid);
        int[] right = mergeSort(arr,mid+1,end);
        int[] merged =  mergeTwoSortedArray(left, right);
        return merged;
    }

    public static int[] mergeTwoSortedArray( int[] left, int[] right){
        int[] sorted = new int[left.length + right.length];
        int i=0,j=0,k=0;
        while(i< right.length && j< left.length){
            if(right[i] < left[j]){
                sorted[k]= right[i];
                k++;
                i++;
            }else{
                sorted[k] = left[j];
                k++;
                j++;
            }
        }
        if(j == left.length){
            while(i<right.length){
                sorted[k] = right[i];
                k++;
                i++;
            }
        }
        if(i == right.length){
            while(j<left.length){
                sorted[k] = left[j];
                k++;
                j++;
            }
        }
        return sorted;
    }

}