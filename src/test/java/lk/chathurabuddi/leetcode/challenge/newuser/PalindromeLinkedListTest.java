package lk.chathurabuddi.leetcode.challenge.newuser;

import junit.framework.TestCase;
import lk.chathurabuddi.leetcode.util.romantointeger.ListNode;

/*
 * 234. Palindrome Linked List
 *
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 *
 * Constraints:
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 *
 * Follow up: Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedListTest extends TestCase {
    private static PalindromeLinkedList palindromeLinkedList;

    public void setUp() throws Exception {
        super.setUp();
        palindromeLinkedList = new PalindromeLinkedList();
    }

    public void testIsPalindrome() {
        assertTrue(palindromeLinkedList.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));
        assertFalse(palindromeLinkedList.isPalindrome(new ListNode(1, new ListNode(2))));
    }
}
