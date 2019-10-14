import java.util.*;
public class Tes12 
{
    public static void main(String[] args) 
    {
        // Implement DFA ending with abb
        String state_now="q0";
        System.out.println("Enter the string");
        Scanner sc= new Scanner(System.in);
        String string= sc.nextLine();

        HashMap a = new HashMap();
        HashMap b = new HashMap();
        a.put("q0","q1");
        a.put("q1","q1");
        a.put("q2","q1");
        a.put("q3","q1");
        
        b.put("q0","q0");
        b.put("q1","q2");
        b.put("q2","q3");
        b.put("q3","q0");
        System.out.print("\nstart:q0");
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)=='a')
                {
                  state_now=(String)a.get(state_now);
                }
            else if(string.charAt(i)=='b')
                {
                    state_now=(String)b.get(state_now);
                }
            System.out.print("-->"+state_now); 
        }
        if(state_now.equals("q3"))
        {
            System.out.println("\nThis string is accepted in DFA");
        }
        else
        {
            System.out.println("\nThis string is not accepted in DFA");
        }
    }
}
