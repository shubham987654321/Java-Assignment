package PriorityQueueConcept;

import java.util.ArrayList;

public class CustomPriorityQueue {


    public static class PriorityQueue {
        private ArrayList<Integer> data;

        public PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(int num) {
            this.data.add(num);
            upHeapify(this.data);
        }

        /*
          parnent index = pi
          left child  = 2*pi+1
          right child = 2*pi+2

          so parent index  will be in case of add
          li = 2*pi+1
          pi = li-1/2
         */
        private void upHeapify(ArrayList<Integer> data) {
            int li = data.size() - 1;
            int pi = (li - 1) / 2;
            while (data.get(pi) > data.get(li) && li >= 1) {
                int leftdata = data.get(li);
                data.set(li, data.get(pi));
                data.set(pi, leftdata);
                li = pi;
                pi = (li - 1) / 2;
            }

        }

        public int remove() {

            int v = this.data.get(0);
            this.data.set(0, this.data.get(this.data.size() - 1));

            this.data.remove(this.data.size() - 1);
            downHeapify(this.data);

            return v;

        }

        /*
         parnent index = pi
         left child  = 2*pi+1
         right child = 2*pi+2

         so parent index  will be in case of add
         li = 2*pi+1
         pi = li-1/2
        */
        private void downHeapify(ArrayList<Integer> data) {
            int pi = 0;
            int li = 2 * pi + 1;
            int ri = 2 * pi + 2;
            int leftvalue = Integer.MAX_VALUE;
            if (li < data.size()) {
                leftvalue = this.data.get(li);
            }
            int rightvalue = Integer.MAX_VALUE;
            if (ri < data.size()) {
                rightvalue = this.data.get(ri);
            }

            int parnetvalue = this.data.get(0);

            while ((parnetvalue > leftvalue || parnetvalue > rightvalue) && (li < data.size() || ri < data.size())) {
                int v = 0;
                int updateParent = 0;
                if (leftvalue <= rightvalue && li < data.size()) {
                    v = this.data.get(li);
                    this.data.set(li, this.data.get(pi));
                    updateParent = li;
                } else if (ri < data.size()) {
                    v = this.data.get(ri);
                    this.data.set(li, this.data.get(ri));
                    updateParent = ri;
                }
                this.data.set(pi, v);
                pi = updateParent;
                li = 2 * pi + 1;
                ri = 2 * pi + 2;
                if (li < data.size()) {
                    leftvalue = this.data.get(li);
                }
                if (ri < data.size()) {
                    rightvalue = this.data.get(ri);
                }
                parnetvalue = this.data.get(pi);
            }

        }

        public int size() {
            return this.data.size();

        }

        public int peek() {
            return this.data.get(0);
        }
    }


    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq.peek());
        System.out.println(pq.data);

        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.data);

        pq.add(12);
        System.out.println(pq.peek());
        System.out.println(pq.data);

    }


}
