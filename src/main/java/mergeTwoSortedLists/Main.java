package mergeTwoSortedLists;

import java.util.LinkedList;

public class Main {
    /*
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.

    Example 1:
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    Example 2:
    Input: list1 = [], list2 = []
    Output: []

    Example 3:
    Input: list1 = [], list2 = [0]
    Output: [0]
    */
   /* public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listaFinal = new ListNode();
        return listaFinal;
    }*/

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Nodo ficticio para simplificar el inicio
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Comparar mientras ambas listas tengan elementos
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // engancho nodo de list1
                list1 = list1.next;   // avanzo en list1
            } else {
                current.next = list2; // engancho nodo de list2
                list2 = list2.next;   // avanzo en list2
            }
            current = current.next; // avanzo en la lista resultante
        }

        // Si queda alguna lista sin terminar, engancharla
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // la lista empieza en dummy.next
    }

    // Función auxiliar para imprimir una lista enlazada
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main main = new Main();
        // Crear listas de ejemplo
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Fusionar
        ListNode merged = main.mergeTwoLists(list1, list2);

        // Imprimir resultado
        printList(merged);
    }
}