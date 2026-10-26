
    public class nodo<Z> {
    private  Z info;
    private nodo<Z> next;

    public nodo(Z info) {
        this.info = info;
        this.next = null;
    }

    public Z getInfo() {
        return info;
    }

    public void setInfo(Z info) {
        this.info = info;
    }

    public nodo<Z> getNext() {
        return next;
    }

    public void setNext(nodo<Z> next) {
        this.next = next;
    }

    
}

