import java.util.Stack;

public class StackExample {
 public static void main(String[] args) {

  Stack <String> stack = new Stack<String>();
  stack.push("Minecraft");
  stack.push("Roblox");
  stack.push("Asphalt");
  stack.push("Borderlands");

  // stack.pop(); //remove only the most top 

  //String myFaveGame = stack.pop(); //assigned it
  //System.out.println(myFaveGame);

  //System.out.println(stack.peek());
  //System.out.println(stack.search("Roblox")); //if not found return -1
 for (int i = 0; i<10; i++){
   stack.push("GAT");
 }
 System.out.println(stack);
 }

}
