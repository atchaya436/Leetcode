class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
    int n2 = arr2.length;
    int[] ans = new int[n1+n2];
    int i=0;
    int j=0;
    int k=0;
    while(i<n1 && j<n2){

        if(arr1[i] <= arr2[j]){

            ans[k++] = arr1[i++];
        }
        else{

            ans[k++] = arr2[j++];
        }
    }
    while(i<n1){

        ans[k++] = arr1[i++];
    }
    while(j<n2){

        ans[k++] = arr2[j++];
    }
    int totalLength = ans.length;
        int mid = totalLength / 2;
        if (totalLength % 2 == 0) {
            return (ans[mid - 1] + ans[mid]) / 2.0;
        } else {
            return ans[mid]; 
        }
    }
}