package lk.iit.ict2webapplicationtry;

import lk.iit.stubs.Exception_Exception;
import lk.iit.stubs.ICT2WebService;
import lk.iit.stubs.ICT2WebServiceService;

public class ICT2Client {
    public static void main(String[] args) {
        
        ICT2Client client = new ICT2Client();
        client.execute();
    }

    public void execute() {
        Double a = 6.0;
        Double b = 3.0;

        ICT2WebService server = new ICT2WebServiceService().getICT2WebServicePort();
        System.out.println("[CLIENT] - About to the the Connection. Calling the isConnection Method.");
        Integer result = server.isConnected();
        System.out.println("[CLIENT] - isConnected returned " + result + ".");

        if (result != null && result == 0) {
            try {
                System.out.println("[CLIENT] - Attempting to call safeDivide Method.");
                //Question 4
                Double result1 = server.safeDivide(a, b);
                System.out.println("[CLIENT] - Divide Returned: " + result1);

                //Question 3

                System.out.println("[CLIENT] - Attempting to call divide Method.");
                Double result2 = server.divide(a, b);
                System.out.println("[CLIENT] - Divide Returned: " + result2);

                System.out.println("[CLIENT] - Attempting to call addDoubleOnServer Method.");

                //Question 5 a

                server.addDoubleOnServer(a);
                server.addDoubleOnServer(b);
                System.out.println("[CLIENT] - addDoubleOnServer Returned " );

                //Question 6 b

                System.out.println("[CLIENT] - Attempting to call getLargestDoubleOnServer Method.");
                Double newResult = server.getLargestDoubleOnServer();
                System.out.println("[CLIENT] - Divide Returned: " + newResult);



            } catch (Exception_Exception e) {
                System.out.println("[CLIENT] - Server ERROR raised: " + e.toString());
            }
            System.out.println("[CLIENT] Testing Successfully Completed.");

        }else {
            System.out.println("[CLIENT] Testing Failed.");
        }
    }
}
