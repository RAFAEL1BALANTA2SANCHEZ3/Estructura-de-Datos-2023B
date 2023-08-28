public class ListNode<T> {

     /* atributos de un nodo */
     //T data;
     //ListNode next;
     
     T data;
     ListNode next, prev; 
    

     /* métodos de un nodo */
     public ListNode(T data) {
          this.data = data;
          //next y prev apuntan a null
          next = null;
          prev = null;
     }

     /* métodos get/set (consulta, modificación) */

     public T getData() {
          return data;
     }

     public void setData(T data) {
          this.data = data;
     }

     public ListNode getNext() {
          return next;
     }

     public void setNext(ListNode next) {
          this.next = next;
     }
     
     public ListNode getPrev() {
         return prev;
    }

    public void setPrev(ListNode prev) {
         this.prev = prev;
    }
     
}
