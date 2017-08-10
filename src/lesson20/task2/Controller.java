package lesson20.task2;


public class Controller {


    // bad way
    private TransactionDAO transactionDAO = new TransactionDAO();


    public Transaction save(Transaction transaction) throws Exception {
        return transactionDAO.save(transaction);

    }


    public Transaction[] transactionList() throws Exception {
        if (transactionDAO.transactionList() == null)
            throw new InternalServerException("invalid value");
        return transactionDAO.transactionList();
    }


    public Transaction[] transactionList(String city) throws Exception {
        if (transactionDAO.transactionList() == null)
            throw new InternalServerException("invalid value");

        return transactionDAO.transactionList(city);

    }

    public Transaction[] transactionList(int amount) throws Exception {
        if (transactionDAO.transactionList() == null)
            throw new InternalServerException("invalid value");

        return transactionDAO.transactionList(amount);
    }


}
