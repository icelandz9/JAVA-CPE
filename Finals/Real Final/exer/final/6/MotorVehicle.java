public class MotorVehicle{
  protected String model;
  protected String make;
  protected int year;
  protected int seat;
  
  public MotorVehicle(String model, String make, int year, int seat){
    this.model = model;
    this.make = make;
    this.year = year;
    this.seat = seat;
  }
  public String getModel(){
    return this.model;
  }
  public String getMake(){
    return this.make;
  }
  public int getYear(){
    return this.year;
  }
  public int getSeat(){
    return this.seat;
  }
}