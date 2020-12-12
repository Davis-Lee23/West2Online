public class IngredientSortOutException extends RuntimeException{
    public IngredientSortOutException(){
    }
    public  IngredientSortOutException(String error){
        super(error);
    }
}
