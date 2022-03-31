package Exception_Handling;
import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class notDeliverException extends Exception
{
    public notDeliverException(String errorMessage)
    {
        super(errorMessage);
    }
}

public class SwiggyDelivery {
    public static void isDeliveryPossible(String zipCode) throws notDeliverException {

        String zip_code = "[1-9]{1}[0-9]{5}$";
        Pattern p = Pattern.compile(zip_code);
        Matcher m = p.matcher(zipCode);

        if (m.matches()) {
            System.out.println("Delivery Available in your area!");
        } else {
            throw new notDeliverException("Cannot Deliver to your area !!!");
        }
    }
    public static void main(String[] args) {
        String zipCode;
        System.out.println("Enter the zip code: ");
        Scanner s = new Scanner(System.in);
        zipCode = s.nextLine();
        try {
            isDeliveryPossible(zipCode);
        } catch (notDeliverException e) {
            System.out.println(e);
        }
    }
}
