package lesson20.task2;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception {

        Transaction transaction1 = new Transaction(1, "Lviv", 50, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction2 = new Transaction(2, "Kiev", 100, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction3 = new Transaction(3, "Tokio", 10, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction4 = new Transaction(4, "New Yourk", 5, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction5 = new Transaction(5, "Kharkiv", 6, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction6 = new Transaction(6, "Lviv", 23, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction7 = new Transaction(7, "Kyiv", 90, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction8 = new Transaction(8, "Lviv", 34, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction9 = new Transaction(9, "Odesa", 4, "qwe", TransactionType.INCOME, new Date());
        Transaction transaction10 = new Transaction(10, "Lviv", 12, "qwe", TransactionType.INCOME, new Date());



        Controller controller = new Controller();
        Utils utils = new Utils();

        TransactionDAO transactionDAO = new TransactionDAO();
       System.out.println(controller.save(transaction2));        // заповнюю масив
      //  transactionDAO.save(transaction9);
     //   transactionDAO.save(transaction3);
      //  transactionDAO.save(transaction4);
      //  transactionDAO.save(transaction5);
       // transactionDAO.save(transaction6);
      //  transactionDAO.save(transaction7);

                                         // перевірка коли всі параметри одного об"єкта дорівнюють другому

       // System.out.println(Arrays.toString(controller.transactionList()));


      //  System.out.println(controller.saveTransaction(transaction9));          // перевірено з усіма ексепшинами


      //  System.out.println(Arrays.toString(controller.transactionList()));  // виводить масив всіх транзакцій , на разі одної


        System.out.println(Arrays.toString(controller.transactionList("Kiev")));  // виводимо масив міст (фільтр)


       // System.out.println(Arrays.toString(controller.transactionList(100)));    // виводимо по фільтру масив відповідних сум.
       // System.out.println(Arrays.toString(utils.getCities()));
//


    }



}
