/**
 * 
 * Adapter pattern is used to make two interfaces compatible without changing
 * the source code.
 * 
 * If there are 2 versions of an interface: Old and New and client only known
 * new, we can support old
 * by using an Adapter which has the old and implements new Interface
 */

// latest supported print interface
interface IPrinter {
    void print();
}

interface ILegacyPrinter {
    void printDocument();
}

class LegacyPrinter implements ILegacyPrinter {
    public void printDocument() {
        // print logic
    }
}   


class PrinterImpl implements IPrinter {
    public void print() {
        // print logic
    }
}   

class PrinterAdapter implements IPrinter {
    ILegacyPrinter printer;

    PrinterAdapter(ILegacyPrinter printer) {
        this.printer = printer;
    }

    public void print() {
        this.printer.printDocument();
    }
}


class Main{
    public static void main(String[] args){
        PrinterAdapter printerAdapter = new PrinterAdapter(new LegacyPrinter());
        printerAdapter.print();

        IPrinter newPrinter = new PrinterImpl();
        newPrinter.print();

        // only have to be concerned and knows about the latest interface
    }
}