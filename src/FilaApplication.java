import domain.Carro;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class FilaApplication {
    public static void main(String[] args) {
        //FILA - FIFO (First in first out)
        //AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue

        Queue<String> fgts = new ArrayBlockingQueue<>(5);

        fgts.offer("Valdir");
        fgts.add("Alexandre");
        fgts.offer("Pablo");
        fgts.offer("Pablo");

        //fgts.poll();
        System.out.println(fgts.remove());

        System.out.println(fgts.peek());
        //System.out.println(fgts.element());

        //FILAS COM MANIPULACAO NAS DUAS PONTAS (INICIO E FIM)
        ArrayDeque<String> abc = new ArrayDeque<>();

        abc.addFirst("abc");
        abc.addLast("xxx");

        //Carro[] frota = new Carro[5];

        //System.out.println(Arrays.stream(frota).filter(x -> x.getModelo() == "asbc")
        //                        .collect(Collectors.toList()));
        System.out.println(fgts.stream().filter(x -> x == "Pablo")
                        .collect(Collectors.toList()));

        //System.out.println(fgts.peek());
    }

}
