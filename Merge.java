public class Merge{
    public static void merge(int ary[], int lo, int hi){
        int[] shorts  = new int [(lo + hi) / 2 - lo + 1];
        int[] tall = new int [hi - (lo + hi) / 2];
        for (int i=0; i< shorts.length; ++i)
            shorts[i] = ary[lo + i];
        for (int j=0; j< tall.length; ++j)
            tall[j] = ary[(lo + hi) / 2 + 1+ j];
        int i = 0, j = 0;
        int k = lo;
        while (i < shorts.length && j < tall.length)
        {
            if (shorts[i] <= tall[j]){
                ary[k++] = shorts[i++];}
            else{
                ary[k ++] = tall[j++];}}
        while (i < shorts.length){
            ary[k ++] = shorts[i++];}
        while (j < tall.length){
            ary[k ++] = tall[j++];}}

    public static void mergesort(int arr[], int lo, int hi){
        if (hi > lo){
            mergesort(arr, lo, (lo + hi) / 2);
            mergesort(arr , (lo + hi) / 2 +1, hi);
            merge(arr, lo, hi);}}

    public static void mergesort(int[] ary){
      mergesort(ary, 0, ary.length - 1);}

    private static void insertionSort(int[] ary, int lo, int hi){
       int c = 0;
       int place = 0;
       for(int i = lo; i <= hi; i++){
         place = ary[i];
         c = i - 1;
         while(c >= 0 && place <= ary[c]){
           ary[c + 1] = ary[c];
           c--;}
         ary[c + 1] = place;}}
}
