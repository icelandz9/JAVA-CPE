public class OffRoad extends Car{

  private String engineType;
  
  public OffRoad(String model,String make,int year,int seat,int door){
   super(model, make, year, seat,door);
  }
  
  
  public String toString(){
  return getMake()+", "+getModel()+", seating: "+getSeat()+","+getDoor()+" door." ;
  }

  
}