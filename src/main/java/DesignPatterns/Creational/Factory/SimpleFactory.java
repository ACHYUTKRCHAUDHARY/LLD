package DesignPatterns.Creational.Factory;

interface Burger {
    void prepare();
}

class BasicBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}

class StandardBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("Preparing Standard Burger with bun, patty, cheese, and lettuce!");
    }
}

class PremiumBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("Preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

// Burger factory

class BurgerFactory{
    public Burger createBurger(String type){
        if(type.equals("BasicBurger")){
            return new BasicBurger();
        }
        else if(type.equals("StandardBurger")){
            return new StandardBurger();
        }
        else if(type.equals("PremiumBurger")){
            return new PremiumBurger();
        }
        else{
            System.out.println("Invalid burger type");
            return null;
        }
    }
}

public class SimpleFactory {
    static void main() {
        String type="BasicBurger";
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger burger =  burgerFactory.createBurger(type);

        if(burger!=null){
            burger.prepare();
        }

    }
}
