import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Demo {

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try
		{
			fis = new FileInputStream("c:\\users\\BSrivathsa\\Desktop\\w.text");
			ois = new ObjectInputStream(fis);
			Employee e = (Employee)ois.readObject();
			System.out.println(e.getEmpid()+" "+e.getEname());
			System.out.println(e.getSalary()+" "+e.getDob());
			ois.close();
			fis.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

		
	}

}









//Employee e1 = new Employee(101,"Vijay",25000,LocalDate.of(2000,10,30));
//ObjectOutputStream oos = null;
//FileOutputStream fos = null;
//try
//{
//	 fos = new FileOutputStream("c:\\users\\BSrivathsa\\Desktop\\w.text");
//	 oos = new ObjectOutputStream(fos);
//	 oos.writeObject(e1);
//	 oos.close();
//	 fos.close();
//	 
// }