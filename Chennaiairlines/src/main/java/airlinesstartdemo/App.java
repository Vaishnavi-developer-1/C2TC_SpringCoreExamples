package airlinesstartdemo;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
    	
    	 Chennai_flight obj = (Chennai_flight)context.getBean("welcome");
         
     
         System.out.println(obj.getMessage());
    	
    }
}
