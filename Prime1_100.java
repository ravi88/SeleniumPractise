package practise_java;

public class Prime1_100 
{
public static void main(String[] args) {
    for(int i=2;i<100;i++)
    {
        int count=1;
        for(int j=2;j<i;j++)
        {
            if(i%j ==0)
            {
                count--;
                break;
            }
         }
       if(count==1){
            System.out.println(i);

        }
    }

}}
