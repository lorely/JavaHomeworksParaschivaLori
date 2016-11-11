/*
 *November homework
 */
package javahomeworksparaschivalori;

/**
 *
 * @author lori
 */
import java.util.Scanner;

public class JavaHomeworksParaschivaLori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name");
        String input = scanner.nextLine();
        System.out.println("input = " + input);
        
        
        
        int number, payment, average ;//declares ints
        String name = "Popescu" ;// declares string
        int employee = Integer.valueOf(10);//wrapper ; example of initialisation
        int basicSalary = Integer.valueOf(3000);//wrapper; example of initialisation
        payment = employee * basicSalary ;
        average = payment / employee ;
        System.out.println("Monthly payment = " + payment);
        System.out.println ("Employee basic salary = " + basicSalary);
        
        number = (employee == 10)? 20 : 30 ;
        System.out.println("employee number = " + number );
        boolean result = name instanceof String ;
        System.out.println(result);
        if (( basicSalary <= 3000) && (employee >=10)) {
        System.out.println(payment);
        }
        
        
        }
           
    }