public class Premium extends BurgerDecorator
{
    BurgerDecorator burgerDecorator;
    String[] premiumtoppings = new String[15];
    public Premium(BurgerDecorator burgerDecorator,String[] premiumtoppings){
       this.burgerDecorator=burgerDecorator;
       this.premiumtoppings=premiumtoppings;
    }
    
    public void printDescription(){
        String desc="";
         burgerDecorator.printDescription();
        for(int i=0;i<premiumtoppings.length;i++)
        {
            desc=desc + premiumtoppings[i];
            if(i!=premiumtoppings.length-1)
            desc=desc+" + ";
        }
        System.out.println("  -"+desc);
    }
    
    public double cost(){
        if(premiumtoppings.length>0){
            return (1.50*premiumtoppings.length)+burgerDecorator.cost();
        }
        else
            return 0+ burgerDecorator.cost();
    }
}
