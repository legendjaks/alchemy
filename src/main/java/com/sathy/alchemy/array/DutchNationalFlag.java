package com.sathy.alchemy.array;

public class DutchNationalFlag {

  public void solve(int[] data){
    int lo = 0;
    int mid = 0;
    int hi = data.length - 1;
    
    while(mid<=hi){
      switch(data[mid]){
      case 0:
        swap(data, lo++,mid++);
        break;
      case 1:
        mid++;
        break;
      case 2:
        swap(data, mid, hi--);
        break;
      }
    }
  }
  
  private void swap(int[] data, int i, int j){
    int temp = data[i];
    data[i]=data[j];
    data[j]=temp;
  }
  
  public static void main(String[] args) {
    int[] data = {2,1,2,0,1,2,1,1,1,0,2};
    
    DutchNationalFlag dnf = new DutchNationalFlag();
    dnf.solve(data);
    
    for(int d:data)
      System.out.print(d + " ");
  }
}
