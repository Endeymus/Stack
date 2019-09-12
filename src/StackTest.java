import java.util.Scanner;
public class StackTest {
    public static void fill(Stack stack){
        Scanner in = new Scanner(System.in);
        for (int i=0; i<5; i++)
        {
            System.out.println("Введите текст: ");
            String s = in.nextLine();
            stack.push(s);
        }
    }

    public static void dump(Stack stack){
        System.out.println(stack.size() );
        while (stack.size() != 0)
        {
            System.out.println(stack.peek() + " " + stack.pop());
        }
    }
    
    public static void main(String[] args)
    {
        /*{
            LinkedStack stack = new LinkedStack();
            fill(stack);
            dump(stack);
        }*/
        {
            ArrayStack stack = new ArrayStack();
            fill(stack);
            stack.OutA();
           System.out.println(stack.size());
           /*stack.ensureCapacity(stack.size()+1);
            System.out.println(stack.size());*/
            //dump(stack);
            stack.PutIn(2, 99);
            stack.OutA();
        }

    }
}
