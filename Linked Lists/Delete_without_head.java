class Solution
{
    void deleteNode(Node del)
    {
        // Your code here
        Node delete = del.next;
        del.data = delete.data;
        del.next = delete.next;
    }
}
