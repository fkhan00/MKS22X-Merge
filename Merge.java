import java.util.ArrayList;
import java.util.Arrays;
public class Merge{
  public static void merge(int[] data){
  mergesort(data, 0, data.length -1);}

  private static void mergesort(int[] data, int lo, int hi){
    if(hi - lo > 1){
      mergesort(data, (lo + hi) / 2, hi);
      mergesort(data, lo, (lo + hi) / 2);}
    System.out.println(Arrays.toString(data));
    merge(data, lo, hi);}

  public static void merge(int[] data, int lo, int hi){
    ArrayList<Integer> dummy = new ArrayList<Integer>();
    ArrayList<Integer> dummy2 = new ArrayList<Integer>();
    for(int i = lo + 1; i <= hi; i++){
      dummy.add(i - lo - 1,data[i]);}
    for(int i = 0; i <= lo; i++){
      dummy2.add(i, data[i]);}
    int index = 0;
    for(int i = 0; i < dummy.size(); i++){
      if(dummy.get(index) > dummy2.get(i)){
        while(index < dummy.size() && dummy2.get(i) > dummy.get(index)){
          index ++;}
        if(index == dummy.size()){
          while(i < dummy.size()){
            dummy2.add(dummy.get(i));
            i ++;}
          break;}
        dummy2.add(i + 1, dummy.get(index));
        i ++;}
      else{
        dummy2.add(i, dummy.get(index));}
      index++;}
    for(int i = 0; i < dummy2.size(); i++){
      data[i] = dummy2.get(i);
    }}
  }
