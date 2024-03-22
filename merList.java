// public class merList {

//     public class ListNode {
//         int val;
//         ListNode next;

//         ListNode() {
//         }

//         ListNode(int val) {
//             this.val = val;
//         }

//         ListNode(int val, ListNode next) {
//             this.val = val;
//             this.next = next;
//         }
//     }

//     public static void main(String[] args) {

//         ListNode list4 = new ListNode(1);
//         list4 = new ListNode(2);
//         list4 = new ListNode(4);

//         ListNode list2 = new ListNode(1);
//         list2 = new ListNode(3);
//         list2= new ListNode(4);

//         ListNode head = new ListNode(0);
//         ListNode l3 = head;
//         int l1, l2;

//         while(list4 != null || list2 != null){
//             if(list4 != null && list2 != null){
//                 l1 = list4.val;
//                 l2 = list2.val;

//                 if(l1 <= l2){
//                     l3.next = new ListNode(list4.val);
//                     l3 = l3.next;
//                 }else{
//                     l3.next = new ListNode(list2.val);
//                     l3 = l3.next;
//                 }

//                 list4 = list4.next;
//                 list2 = list2.next;
//             }
//         }

//         if(list4 != null){
//             l3.next = new ListNode(list4.val);
//             l3 = l3.next;
//         }

//         if(list2 != null){
//             l3.next = new ListNode(list2.val);
//             l3 = l3.next;
//         }

//     }

// }
