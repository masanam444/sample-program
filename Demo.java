import java.io.DataInputStream;
class Demo
{
public static void main(String[] args)
{
	System.out.println("WELCOME");
	DataInputStream inp=new DataInputStream(System.in);
	int a=Intger.parseInt(inp.readLine());
	System.out.println("Given number is :"+a);
	
	
}

