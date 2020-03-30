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
    this.rear = capacity - 2;
  }

  @Override
  public boolean offer(final E obj) {
    if (capacity > size) {
      size++;
      data[size - 1] = obj;
      return true;
    }
    return false;
    // TODO
    //return false;
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
      size--;
      E j = data[front];
      for (int i = 1; i < data.length; i++) {
        data[i - 1] = data[i];
      }
      return j;
    }
    // TODO
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
    if (size > 0) {
      return Arrays.asList(data);
    }
    return Arrays.asList();
  }
}
