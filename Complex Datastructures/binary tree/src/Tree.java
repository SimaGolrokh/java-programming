public class Tree <T extends Comparable<T>> {
    private T value;
    private Tree<T> left;
    private Tree<T> right;

    public Tree(T value) {
        this.value = value;
    }
    public void add (T toAdd){
        if (this.value.compareTo(toAdd) < 0){
            if (this.left == null){
                this.left = new Tree<T>(toAdd);
            }else{
                this.left.add(toAdd);
            }

        }else {
            if (this.right == null){
                this.right = new Tree<T>(toAdd);
            }else{
                this.right.add(toAdd);
            }
        }
    }
    public static void main (String [] args){
        
    }
}
