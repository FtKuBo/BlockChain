import java.util.Arrays;

public class Block {

    private int previousHash;
    private String[] transaction;

    private int HashBlock;

    public Block(int previousHash, String[] transaction) {
        this.transaction = transaction;
        this.previousHash = previousHash;

        Object[] content = { Arrays.hashCode(transaction), previousHash };
        this.HashBlock = Arrays.hashCode(content);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transaction;
    }

    public int getHashBlock() {
        return HashBlock;
    }

}
