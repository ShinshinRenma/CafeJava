public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 3.0;
        double cappuchinoPrice = 4.0;
        double lattePrice = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // Cindhuri orders a coffe, generic interaction before payment
        System.out.println(generalGreeting + customer1); 
        if(isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }

    	// Sam orders a cappuchino, pays upon receipt
        System.out.println(generalGreeting + customer2); 
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuchinoPrice);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy orders two lattes
        System.out.println(generalGreeting + customer3); 
        System.out.println(displayTotalMessage + lattePrice * 2);
        if(isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }

        // Noah pays for a drip coffee, but realizes he wanted a latte instead
        System.out.println(generalGreeting + customer4); 
        System.out.println(displayTotalMessage + (lattePrice - dripPrice));
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
    }
}
