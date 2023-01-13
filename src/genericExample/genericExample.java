package genericExample;

interface Plant {}
class Flower implements Plant{}
class Rose extends Flower implements Plant{}
class RosePasta{}

class Basket<T extends Flower & Plant> {
    private T item;



    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}

class Main {
    public static void main(String[] args) {

        Basket<Flower> flowerBasket = new Basket<>();
        Basket<Rose> roseBasket = new Basket<>();
//        Basket<RosePasta> rosePastaBasket = new Basket<>();


    }

    public <T1> void getPrint(T1 item) {
        System.out.println(item.equals("Object"));
    }
}


