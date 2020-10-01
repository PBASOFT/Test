


public class StringUtility {


    public String reverseString(String inputString) {

//        String result;

        String checkedInputString = checkInputString(inputString);
        if(checkedInputString.equalsIgnoreCase(inputString)) {
            StringBuilder output = new StringBuilder(inputString);
            return output.reverse().toString();
        }
        return checkedInputString;





//        if (inputString.isEmpty()) {
//            result = "String is empty";
//        }else if (!inputString.matches("[A-Za-z]+"))
//            result = "String must contain letters only";
//        else {
//            StringBuilder output = new StringBuilder(inputString);
//            result = output.reverse().toString();
//        }
//        return result;
    }

    public String capitalizeString(String inputString) {

//        if (inputString.isEmpty())
//            return "String is empty";
        String checkedString = checkInputString(inputString);
        if(checkedString.equalsIgnoreCase(inputString))
            return inputString.toUpperCase();

        return checkedString;

    }

    public String lowercaseString(String inputString) {
        String checkedString = checkInputString(inputString);
        if(checkedString.equalsIgnoreCase(inputString))
            return inputString.toLowerCase();
        return checkedString;
    }


    private String checkInputString(String inputString){
        if (inputString.isEmpty())
            return "String is empty";


        else if(!inputString.matches("[A-Za-z]+"))
            return "String must contain letters only";

        return inputString;
    }


}