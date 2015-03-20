public class Toppings extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] toppings = new String[15];
    public Toppings(BurgerDecorator burgerDecorator, String[] toppings){
       this.burgerDecorator=burgerDecorator;
       this.toppings=toppings;
    }
    public double cost(){
        if(toppings.length>4){
            return (0.75*(toppings.length-4))+burgerDecorator.cost();
        }
        else
         return 0+burgerDecorator.cost();
    }
    public void printDescription(){
       String desc ="";
       burgerDecorator.printDescription();
       for(int i=0;i<toppings.length;i++){
          
            desc =desc + toppings[i];
             if(i!=toppings.length-1){
               desc =desc + " + ";
            }
        }
       System.out.println("  -"+desc);
    }
}
