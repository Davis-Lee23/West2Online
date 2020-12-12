public class OverdraftBalanceException extends  RuntimeException{
    public OverdraftBalanceException(){
    }
    public OverdraftBalanceException(String error){
        super(error);
    }
}
