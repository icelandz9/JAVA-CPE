public class Exercise6_04 {
  public static void main(String[] agrs) {
    
    int nAr[] = {1, 2, 3, 4, 5, 6};
    double dAr[] = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
    System.out.println("The average value as integer is "+average(nAr));
    System.out.println("The average value as integer is "+average(dAr));
  }
  
  public static int average(int[] array) {
    int Sum=0,average=6;
    for (int i=0;i<array.length;i++) {
      Sum += array[i];
    }
    average = Sum/average;
    return average;
  }
  public static double average(double[] array) {
    double Sum=0,average=6;
    for (int i=0;i<array.length;i++) {
      Sum += array[i];
    }
    average = Sum/average;
    return average;
    
  }
} 