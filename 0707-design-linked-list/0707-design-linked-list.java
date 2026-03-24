class MyLinkedList {
    class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val=val;
            prev=null;
            next=null;
        }
    }
    Node head,tail;
    int cnt;
    public MyLinkedList() {
        head=tail=null;
        cnt=0;
    }
    public int get(int index) {
        if(index<0||index>=cnt){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=tail=nn;
        }else{
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
        cnt+=1;
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=tail=nn;
        }else{
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
        cnt+=1;
    }
    
    public void addAtIndex(int index, int val) {
        Node nn=new Node(val);
        if(index<0||index>cnt){
            return;
        }
        if(index==0){
            addAtHead(val);
        }
        else if(index==cnt){
            addAtTail(val);
        }else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            nn.prev=temp;
            nn.next=temp.next;
            temp.next=nn;
            nn.next.prev=nn;
            cnt+=1;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=cnt){
            return;
        }
        if(index==0){
            head=head.next;
            if(head==null){
                tail=null;
            }
            cnt-=1;
        }
        else if(index==cnt-1){
            tail=tail.prev;
            tail.next=null;
            cnt-=1;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
            cnt-=1;
            if(temp.next==null){
                tail=null;
            }
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */