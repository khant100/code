package LLD;


// Single responsibilityper class

class Marker{
int price;
}

class Invoid{
    private Marker marker;
    private int quentity;

    public Invoid(Marker marker , int quentity){
        this.marker=marker;
        this.quentity=quentity;
    }

    public int total(){
        return marker.price* quentity;
    }

    public void InvoiceDao(){

    }

    public void InvoicePrint(){

    }

}

// conver it to single responsibility

public class SingleResponsibility {
    class Invoice {
        private Marker marker;
        private int quentity;

        public Invoice(Marker marker , int quentity){
            this.marker=marker;
            this.quentity=quentity;
        }

        public int total(){
            return marker.price* quentity;
        }
    }

    class InvoideDao{
        Invoice invoice;
        public InvoideDao(Invoice invoice){
            this.invoice=invoice;
        }

        public void InvoiceDao(){

        }
    }

    class InvoicePrint{
        Invoice invoice;

        InvoicePrint(Invoice invoice){
            this.invoice=invoice;
        }

        public void InvoicePrint(){

        }
    }
}
