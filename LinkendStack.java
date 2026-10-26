public class LinkendStack<Z> implements interfas<Z>{
    private  nodo<Z> top; 
    public LinkendStack(){
        this.top=null;
    }

    @Override
    public void Push(Z item) {
        nodo<Z> nuevo=new nodo<>(item);
      if (isEmpty()) {
        top=nuevo;
      }else{
        nuevo.setNext(top);
        top=nuevo;
      }
    }

    @Override
    public Z Top() {
        if (isEmpty()) {
            return null;
        }
        return top.getInfo();
    }

    @Override
    public Z Pop() {
        if (isEmpty()) {
            return null;
        }else{
            Z aux=top.getInfo();
            top=top.getNext();
            return aux;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
}