class ListNode:

    def __init__(self, item):
        self.val = item
        self.next = None

    # Method to print list
    def print_list(self):
        node = self
        while node is not None:
            print node.val
            node = node.next

    # Method to reverse the list
    def reverse_list(self):
        node = self
        prev_node = None
        head = None
        while node is not None:
            temp_node = node
            if node.next is None:
                head = node
            node = node.next
            temp_node.next = prev_node
            prev_node = temp_node
        return head



testHead = ListNode(3)
node1 = ListNode(2)
testHead.next = node1

node2 = ListNode(1)
node1.next = node2
testHead.print_list()
testTail = testHead.reverse_list()
print "Result...."
testTail.print_list()
