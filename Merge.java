import java.util.ArrayList;
import java.util.Arrays;
public class Merge{
  public static void mergesort(int[] data){
    ArrayList<Integer> bat = new ArrayList<Integer>(data.length);
    for(int i = 0; i < data.length; i++){
      bat.add(data[i]);}
    mergesort(bat, 0, data.length -1);
    for(int i = 0; i < data.length; i++){
      data[i] = bat.get(i);}}

  private static void mergesort(ArrayList<Integer> data, int lo, int hi){
    if(hi > lo){
      mergesort(data, lo, (lo + hi) / 2);
      mergesort(data, (lo + hi) / 2 + 1, hi);
      merge(data, lo, hi);}}

  private static void merge(ArrayList<Integer> data, int lo, int hi){
    ArrayList<Integer> dummy = new ArrayList<Integer>();
    ArrayList<Integer> dummy2 = new ArrayList<Integer>();
    for(int i = lo; i <= (lo + hi) / 2; i++){
      dummy.add(data.get(i));}
    for(int i = (lo + hi) / 2 + 1; i <= hi; i++){
      dummy2.add(data.get(i));}
    int index = lo;
    int k = 0;
    int l = 0;
    while(k < dummy.size() && l < dummy2.size()){
      if(dummy.get(k) <= dummy2.get(l)){
        data.set(index, dummy.get(k));
        index ++;
        k++;}
      else{
        data.set(index,dummy2.get(l));
        index ++;
        l++;}}
    while(k < dummy.size()){
      data.set(index, dummy.get(k));
      index ++;
      k++;}
    while(l < dummy2.size()){
      data.set(index, dummy2.get(l));
      index ++;
      l++;}}}
