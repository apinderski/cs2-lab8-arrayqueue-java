package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

    private final int capacity;

    private int size;

    private int front;

    private int rear;

    private final E[] data;

    // TODO why do we need an explicit constructor?

    @SuppressWarnings("unchecked")
    public FixedArrayQueue(final int capacity) {
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = capacity - 1;
    }

    @Override
    public boolean offer(final E obj) {
        /**if (capacity > size) {
         size++;
         data[size - 1] = obj;
         return true;
         }
         return false;
         // TODO
         //return false;
         }
         */
        if (capacity > size) {
            if (rear == capacity - 1) {
                rear = 0;
            } else
                rear += 1;

            data[rear] = obj;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public E peek() {
        if (size > 0) {
            return data[front];
        }
        return null;
        // TODO
    }

    @Override
    public E poll() {
        if (size > 0) {
            if (front == capacity - 1) {
                front = 0;
                size--;
                return data[capacity - 1];
            } else {
                front++;
                size--;
                return data[front - 1];
            }
        }
        return null;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<E> asList() {
        // TODO implement using an ArrayList preallocated with the right size
        List<E> list = new ArrayList<>();
        if (data[front] == null) {
          return list;
        }

        for (int f = front; f < rear || f > rear || f == rear; f++) {
            if (f < rear) {
                list.add(data[f]);
            }
            if (f > rear) {
                list.add(data[f]);
                if (f == capacity - 1) {
                    f = -1;
                }
            }
            if (f == rear) {
                list.add(data[f]);
                break;
            }
        }

        return list;
    }

}

