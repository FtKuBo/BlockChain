import java.util.*;

public class BlockChain {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] transaction = { "ronaldo sent 10 bitcoins to messi", "messi sent 3 bitcoin to neymar" };
        Block Block1 = new Block(0, transaction);
        String[] transaction2 = { "peirera sent 100 solana to adesanya" };
        Block Block2 = new Block(Block1.getHashBlock(), transaction2);
        System.out.println("Hash of Block1: " + Block1.getHashBlock());
        System.out.println("Hash of Block2: " + Block2.getHashBlock());

    }
}