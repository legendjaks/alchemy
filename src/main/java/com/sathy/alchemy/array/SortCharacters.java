package com.sathy.alchemy.array;

public class SortCharacters {

  public void solve(char[] data){
    int lo = 0;
    int mid = 0;
    int hi = data.length - 1;
    
    while(mid<=hi){
      switch(type(data[mid])){
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
  
  private int type(char c){
    if(c ==' ')
      return 1;
    
    if(c>='a' && c<='z')
      return 0;
    
    return 2;
  }
  
  private void swap(char[] data, int i, int j){
    char temp = data[i];
    data[i]=data[j];
    data[j]=temp;
  }
  
  public static void main(String[] args) {
    char[] data = "Ba CDeF Gh iJ".toCharArray();
    
    SortCharacters dnf = new SortCharacters();
    dnf.solve(data);
    
    for(char d:data)
      System.out.print(d);
  }
}
