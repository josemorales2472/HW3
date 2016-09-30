/**
 * Created by Danny on 9/29/2016.
 */
public class GenericBag<E, T, Z> {

    //Fields
    E item1;
    T item2;
    Z item3;

    //Constructor
    public GenericBag(E item1, T item2, Z item3){
        this.item1= item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    //getters and setters
    public E getItem1(){return item1;}
    public void setItem1 (E item1) {this.item1= item1;}

    public T getItem2() {
        return item2;
    }
    public Z getItem3(){
        return item3;
    }
    public void setItem2 (T item2){this.item2= item2;}
    public void setItem3(Z item3){this.item3=item3;}

    public String toString(){return "("+item1+", "+item2+", "+item3+")";}
}
