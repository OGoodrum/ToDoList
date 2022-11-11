import java.util.Scanner;

class ExitException extends Exception{}

public class ToDoList{


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList<String> toDo = new LinkedList<String>();
        System.out.println("\nWelcome to the TO DO list :)\n");

        System.out.println("To add tasks to your list type 'add' when asked for a command then hit enter and type the name of your task");
        System.out.println("To remove from your list write 'remove' then hit enter and write the name of your task");
        System.out.println("To exit to do list type 'exit' when asked for a command\n");
        
        while(true){

            System.out.println("command:");
            String command = input.nextLine();
            try{
                commands(command, input, toDo);
            } catch (ExitException e){
                break;
            }

            System.out.println(toDo);
            
        }

        System.out.println(toDo);
        input.close();
        
    }

    public static void commands(String command, Scanner input, LinkedList<String> toDo) throws ExitException{
        if(command.equals("add")){ // what to do if command is add
            System.out.println("task: ");
            String task = input.nextLine(); // input name of task
        
            toDo.addBack(task);
        } else if(command.equals("remove")){ // what to do if command is remove
           
            if(toDo.isEmpty()){
                System.out.println("\nCannot remove list is empty. Try another command.\n\ncommand:");
                command = input.nextLine();
                commands(command, input, toDo);
            } else {
                System.out.println("task: ");
                String task = input.nextLine();

                toDo.removeItem(task);
            }
            
        } else if(command.equals("exit")){ // what to do if command is exit
            
            throw new ExitException(); // throw exception to be caught in main
        } else { // what to do if the command is unrecognized
            
            System.out.println("\n" + command + " is an unrecognized command\nPlease try command again\n\ncommand:");
            command = input.nextLine(); //input a command again
            commands(command, input, toDo);
        }
    }

    

}
