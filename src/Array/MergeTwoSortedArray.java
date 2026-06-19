package Array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int []a = {1,4,6,8,9,15};
        int []b = {2,5,7,10,12,18,20};

        int []c = new int[a.length+b.length];
        for(int ele : c){
            System.out.print(ele + "  ");
        }
        System.out.println();
        merge(c,a,b);
        for(int ele : c){
            System.out.print("Merge an Arrays : " + ele + " ");
        }
    }

    private static void merge(int[] c, int[] a, int[] b) {
        int i=0,j=0,k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<b[j]){
//                c[k] = a[i];
//                i++;
//                k++;
//            }else{   //a[i]>b[j]
//                c[k] = b[j];
//                j++;
//                k++;
//            }
//        }
//        while(i<a.length){
//            c[k] = a[i];
//            i++;
//            k++;
//        }
//        while(j<b.length){
//            c[k] = b[j];
//            j++;
//            k++;
//        }

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else{   //a[i]>b[j]
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];

        }
    }
}
