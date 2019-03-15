import java.util.ArrayList;
public class Merge{
  public static void merge(int[] data){
  mergesort(data, 0, data.length -1);}

  private static void mergesort(int[] data, int lo, int hi){
    if(hi > lo){
      mergesort(data, (lo + hi) / 2, hi);
      mergesort(data, lo, (lo + hi) / 2);}
    merge(data, lo, hi);}

  private static void merge(int[] data, int lo, int hi){

    ArrayList<Integer> dummy = new ArrayList<Integer>();
    ArrayList<Integer> dummy2 = new ArrayList<Integer>();
    for(int i = lo; i <= hi; i++){
      dummy.add(data[i]);}
    for(int i = hi; i < data.length; i++){
      dummy2.add(data[i]);}
    int counter = 0;
    while(dummy2.size() != 0){
      if(dummy.size() == counter){
        dummy.add(dummy.remove(0));
      }
      else if(dummy.get(counter) > dummy2.get(0)){
        dummy.add(counter, dummy2.get(0));
        dummy2.remove(0);}
      else{
        dummy.add(counter + 1, dummy2.get(0));
        dummy2.remove(1);}}
    for(int i = lo; i <= hi; i++){
      data[i] = dummy.get(i);}
    }
}
