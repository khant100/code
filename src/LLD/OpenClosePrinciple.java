package LLD;


// suppose we wanted to add new functionality to class to add to file
class InvoideDao{
    SingleResponsibility.Invoice invoice;
    public InvoideDao(SingleResponsibility.Invoice invoice){
        this.invoice=invoice;
    }

    public void saveToDB(){

    }public void saveToFileSystem(){

    }


}

// insted of modifing class lets extend it
public class OpenClosePrinciple {

    interface invoice{
        public void save(Invoid invoid);
    }

    class Databae implements  invoice{


        @Override
        public void save(Invoid invoid) {
            // dave to Databse
        }
    }

    class fileSystem implements  invoice{


        @Override
        public void save(Invoid invoid) {
            // dave to File
        }
    }

}
