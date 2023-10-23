package Homework2;

public class FixedAmountAccount extends AbstractAccount implements Account{
    public FixedAmountAccount(double balance){
        super(balance);
        }
    
    @Override
        public void doTake (double cash){
            cash = 0;
        }

    @Override
        public void doPut (double cash){
            cash = 0;
        }    

    @Override
        public void take () {
                
        }
    @Override
        public void put () {
            
        }
    @Override    
        public double getAmount() {
            return this.balance;
        }
    
    }

