import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	Usuario us = new Usuario();

	Endereco end = new Endereco();
	end.setLogadouro("Casa do Sol");
	
	us.setEndereco(end);


	System.out.println(
			us.getEndereco()
			.   getLogadouro()
		);
	
	}
}
/*

		// Creating a HashSet
        Set<String> daysOfWeek = new HashSet<>();

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
	
	*/

