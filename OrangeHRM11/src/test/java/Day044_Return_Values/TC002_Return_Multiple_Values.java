package Day044_Return_Values;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TC002_Return_Multiple_Values {
	
	@Test
	public void Test1()throws Exception
	{
	    List<String> Page_li = new ArrayList<String>();
	    
	    Page_li=Page1();
	    
	    System.out.println(Arrays.toString(Page_li.toArray()));
	    
	    System.out.println("________________________");
	    
	    printList(Page_li);
	    
	   System.out.println("***********");
	    
	   printList1(Page_li);
	    
	}
	
	
	
	public List<String> Page1()    {
		
	    List<String> Page_list1 = new ArrayList<String>();
	    Page_list1.add("Order");
	    Page_list1.add("11");
	    Page_list1.add("Indian777");
	    
	    return(Page_list1);
	   
	   }
	
	
		public void printList(List<String> list){
			    for(String elem : list){
			        System.out.println(elem+"  ");
			    }
			}
		
		public  void printList1(List<String> list)
		{
		    for (int i=0; i<list.size(); i++)
		        System.out.println(list.get(i));
		}
		
		
		
		
		
		

}
