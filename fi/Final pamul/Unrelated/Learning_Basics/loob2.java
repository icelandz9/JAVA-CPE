class loob2{
  public static void main(String[] args){
    System.out.println("Mile  Kilo");
    for(int i=1;i<=10;i++){
      double km = i/0.621;
      System.out.println(i+" = "+km);
    }
    for(int j=20;j<=65;j+=15){
      double mi = j*0.621;
      System.out.println(+j+" = "+mi);
    }
  }
}
