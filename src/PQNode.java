import java.util.*;

class PQNode<T> implements Comparable<PQNode<T>> {
  public final int weight;
  public final T data;

  PQNode( int weight, T data ) {
    this.weight = weight;
    this.data = data;
  }

  @Override
  public int compareTo( PQNode<T> node ) {
    /* Min priority queue node */
    if( weight < node.weight ) {
      /* a smaller weight has a greater priority */
      return 1;
    }
    else if( weight > node.weight ) {
      /* a larger weight has a less priority */
      return -1;
    }
    else {
      /* equals returns 0 */
      return 0;
    }
  }

  @Override
  public boolean equals( Object o ) {
    if( o == this ) {
      return true;
    }

    if( !(o instanceof PQNode<?>) ) {
      return false;
    }

    PQNode<?> pq_node = (PQNode<?>) o;

    if( data.equals(pq_node.data) && weight == pq_node.weight ) {
      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return "{" + data + ", " + weight + "}";
  }

  public T getData() {
    return data;
  }

  public int getWeight() {
    return weight;
  }
}