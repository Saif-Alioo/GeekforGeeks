class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
         Stack<Integer> st = new Stack<>();
        for(int i = 0;i<k;i++) 
        st.push(q.poll());
        while(!st.isEmpty())
        q.add(st.pop());
        for(int i = 0;i<q.size()-k;i++) 
        q.add(q.poll());
        return q;
    }
}
