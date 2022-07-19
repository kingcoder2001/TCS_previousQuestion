/* 
Our hoary culture had several great persons since time immemorial and king vikramaditya’s nava ratnas (nine gems) belongs to this ilk. They are named in the following shloka:


Among these, Varahamihira was an astrologer of eminence and his book Brihat Jataak is recokened as the ultimate authority in astrology.

He was once talking with Amarasimha,another gem among the nava ratnas and the author of Sanskrit thesaurus, Amarakosha.

Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per following scheme.

Scheme
He first turns and travels 10 units of distance
His second turn is upward for 20 units
Third turn is to the left for 30 units
Fourth turn is the downward for 40 units
Fifth turn is to the right(again) for 50 units
… And thus he travels, every time increasing the travel distance by 10 units.
*/
//--------------------------------Use switch cases insead of if else as switch take lesss time-----------------------------------
import java.util.Scanner;
public class DistanceCordinate
{
	public static void main(String[] args) {
		int x=0,y=0;
		int count=10,step=1;
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		//int i=1;
		while(n-->0)
		{
		    if(step==1)
		    {
		        x+=count;
		    }
		  
		    if(step==2)
		    {
		        y+=count;
		    }
		    if(step==3)
		    {
		        x-=count;
		    }
		    if(step==4)
		    {
		        y-=count;
		    }
		    if(step==5)
		    {
		        x+=count;
		    }
		    
		   // i++;
		    count+=10;
		    step++;
		    
		    if(step==5)
		    {
		        step=1;
		    }

		}
		System.out.println(x+" "+y);
	}
}
