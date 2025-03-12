
interface Printer {
    void print();
}
interface Scanner {
    void print(); 
}


class Device implements Printer, Scanner {
    
    @Override
    public void print() {
        System.out.println("Printing from Device.");
    }
    
    
    public void printerFunction() {
        Printer p = this; 
        p.print(); 
    }

    public void scannerFunction() {
        Scanner s = this; 
        s.print(); 
    }
}


public class Main4 {
    public static void main(String[] args) {
        Device myDevice = new Device(); 

        
        myDevice.print(); 

        
        myDevice.printerFunction(); 

        
        myDevice.scannerFunction(); 
    }
}