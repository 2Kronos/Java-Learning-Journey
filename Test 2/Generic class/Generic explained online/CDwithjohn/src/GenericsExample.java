

public class GenericsExample {
 public static void main(String[] args) {
   Printer <Integer> printer = new Printer<>(23); // does not work with int or double use the wrapper classes

   Printer <Double> doublePrint = new Printer<>(33.5);
   doublePrint.print();

  

   printer.print();
 }
}