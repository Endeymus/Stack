import java.util.Scanner;
public class StackTest {
    public static void fill(Stack stack){
        Scanner in = new Scanner(System.in);
        for (int i=0; i<5; i++)
        {
            System.out.println("Введите текст: ");
            String s = in.nextLine();
            stack.push(s + i);
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
        {
            LinkedStack stack = new LinkedStack();
            fill(stack);
            dump(stack);
        }
        {
            ArrayStack stack = new ArrayStack();
            fill(stack);
            dump(stack);
        }
    }
}
