import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CountWords
{
    public static void main(String[] args) throws
    IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string :");
        String str=br.readLine();
        int count=0;
        if(str.length()==0)
        {
            System.out.println("no.of words in given text :"+count);
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if (str.charAt(i)==' ') 
                {
                   count++; 
                }
            }
        }
        System.out.println("no. of words in given text:"+(count+1));
    }
}
