public class main {
    public static void main(String[] args) {
       LinkendStack<String>pila=new LinkendStack<>();

       pila.Push("Elemento 1");
       pila.Push("Elemento 2");
       pila.Push("Elemento 3");
       pila.Push("Elemento 4");

       System.out.println("El elemento top de la pila es : "+pila.Top());
       System.out.println("El elemento eliminado es : "+pila.Pop());
       System.out.println(pila.Top());
    }
    
}


