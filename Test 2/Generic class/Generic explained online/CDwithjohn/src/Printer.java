public class Printer <T> {
 T thingtoPrint;

 public Printer(T thingToPrint){
  this.thingtoPrint = thingToPrint;
 }
 
 public void print(){
  System.out.println(thingtoPrint);
 }
}
