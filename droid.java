public class Droid {

  // state of an object
  int batteryLevel;
  String name;
  
  public String toString() {
    return "Hello, my name is " + name + ".";
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel -10;
  }

  public Droid(String droidName) {
    // constructor
    name = droidName;
    batteryLevel = 100;
  }
  
 
public static void main(String[] args) {
  // creates a new Calculator object
    Droid Codey = new Droid("Codey"); 
    System.out.println(Codey);
    System.out.println("The battery level is " + Codey.batteryLevel);
    Codey.performTask("Throwing bricks.");
    System.out.println("Now the battery level is " + Codey.batteryLevel);
  }
  
}
