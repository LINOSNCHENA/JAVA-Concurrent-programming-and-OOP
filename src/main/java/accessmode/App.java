package accessmode;
import muntu1.*;
public final class App {private App() {} // Locks it

 public static void main(String[] args) {
        System.out.println("Hello Nikolas! - When was you born?");
      Foo1 bar = new Bar2();
       System.out.println(bar.doSomething());         // 2009
       System.out.println(bar.doSomethingElse());     // 2019        

Addition obj = new Addition();
/* It will throw error because we are trying to access
 * the default method in another package
 */
obj.addTwoNumbers(10, 21);

    }

    //end 
}
