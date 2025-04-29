public class Screen {
    
    //method to show message to user
    public static void ShowMessage(String msg){
        System.out.println(msg);
    }

    //get a value by user insert, with type validation
    public static double InsertDouble(String msg){
        boolean error=false;
        double value = 0;
        do{
            System.out.println(msg);
            try{
                value=Double.parseDouble(System.console().readLine());
                error=false;
            }catch(Exception e)
            {
                System.out.println("Error! type invalid");
                error=true;
            }
        }while(error==true);
        return value;
    }

    //get a value by user insert, with type validation
    public static String InsertMesage(String msg){
        boolean error=false;
        String readLine = "";
        do{
            System.out.println(msg);
            try{
                readLine=System.console().readLine();
                error=false;
            }catch(Exception e)
            {
                System.out.println("Error! type invalid");
                error=true;
            }
        }while(error==true);
        return readLine;
    }

    //Validation for only accept + or -
    public static Boolean OperationValidation(String operator){
        if(operator.equals("+") || operator.equals("-")){
            return true;
        }else{
            return false;
        }
    }

}