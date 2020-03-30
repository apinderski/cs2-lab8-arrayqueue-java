#Lab 8 Answers and Reflection
##Austin Pinderski

Class FixedArrayQueue requires an explicit constructor because when creating an object of that type, one must provide a capacity. The capacity variable is what makes each 
FixedArrayQueue object unique. For example, if a programmer needed two queues, one with capacity 3 and the other with capacity 4, they could not do this without
an explicit constructor denoting capacity.
If one tries to offer an already filled queue, the program will not let them, as queues have fixed capacities. In the case of this program, the offer method will
return false because there is no room for the offered object. 
When one tries to poll from an empty FixedArrayQueue, null is returned. This is because there is no object in the front of the queue to be taken. 
offer(final E obj)
time complexity = O(1)
space complexity = O(1)
peek()
time complexity = O(1)
space complexity = O(1)
poll()
time complexity = O(1)
space complexity = O(1)
isEmpty()
time complexity = O(1)
space complexity = O(1)
size()
time complexity = O(1)
space complexity = O(1)
asList()
time complexity = O(1)
space complexity =  O(n)


