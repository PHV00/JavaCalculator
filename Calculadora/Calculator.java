public class Calculator{

    //Main Function, this can be run
    public static void main(String args[]){

        String operator = "";
        
        //validation to only continue if operator is correct
        do{
            operator = Screen.InsertMesage("Insert a correct operator ( + - ) :");
        }while(Screen.OperationValidation(operator)==false);


        double value1 = Screen.InsertDouble("Insert first value:");
        double value2 = Screen.InsertDouble("Insert secound value:");

        double result = 0;

        //select for execute a operatoration
        switch (operator) {
            case "+":    
                result = Operations.sum(value1, value2);
                break;
            
            case "-":
                result = Operations.substract(value1, value2);
                break;
        
            default:
                break;
        }

        Screen.ShowMessage("Result of operation: "+result);

    }
}