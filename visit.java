package Week2.Day2;

import java.util.Date;

public class visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public visit( Date date , Customer customer){
        this.customer= new Customer(customer.getName());
        this.date=date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return productExpense+serviceExpense;
    }

}//end
