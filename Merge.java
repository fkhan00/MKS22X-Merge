import java.util.ArrayList;
import java.util.Arrays;
public class Merge{
  public static void mergesort(int[] data){
    mergesort(data, 0, data.length -1);}

  private static void mergesort(int[] data, int lo, int hi){
    if(hi > lo){
      mergesort(data, lo, (lo + hi) / 2);
      mergesort(data, (lo + hi) / 2 + 1, hi);
      merge(data, lo, hi);}}

  private static void merge(int[] data, int lo, int hi){
    ArrayList<Integer> dummy = new ArrayList<Integer>((lo + hi) / 2 - lo + 1);
    ArrayList<Integer> dummy2 = new ArrayList<Integer>(hi - (lo + hi) / 2 + 1);
    for(int i = lo; i <= (lo + hi) / 2;){
      dummy.add(data[i++]);}
    for(int i = (lo + hi) / 2 + 1; i <= hi;){
      dummy2.add(data[i++]);}
    int k = 0;
    int l = 0;
    while(k < dummy.size() && l < dummy2.size()){
      if(dummy.get(k) <= dummy2.get(l)){
        data[k + l + lo] = dummy.get(k++);}
      else{
        data[k + l + lo] = dummy2.get(l++);}}
    while(k < dummy.size()){
      data[k + l + lo] = dummy.get(k++);}
    while(l < dummy2.size()){
      data[k + l + lo] = dummy2.get(l++);}}}
