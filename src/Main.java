import java.util.ArrayList;

public class Main {

	/** 
	  Hash = digital signature 
	  Each block will have:
	  		List of transactions
	  		Previous Hash
	  
	 **/
	
	public static ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String[] args){
		
		String[] genesisTransactions = {"jhon sent 200 dollars to sherly", "greg sent 40 dollars to mark"};
		Block genesisBlock = new Block(0, genesisTransactions);
		blockchain.add(genesisBlock);
		
		String[] block2Transactios = {"ram sent 6772 dollars to drake", "flora sent 4000 dollars to redmond"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactios);
		blockchain.add(block2);
		
		String[] block3Transactios = {"drew sent 5233 dollars to blake", "zinta sent 782382 dollars to dominic"};
		Block block3 = new Block(block2.getBlockHash(), block3Transactios);
		blockchain.add(block3);
		
		String[] block4Transactios = {"andrew sent 5233 dollars to mark", "claire sent 782382 dollars to john"};
		Block block4 = new Block(block3.getBlockHash(), block4Transactios);
		blockchain.add(block4);
		
		System.out.println("nodes in BlockChain network:");
		System.out.println(blockchain);
		
		System.out.println("Hash of genesis/Block 1:");
		System.out.println(genesisBlock.getBlockHash());
		System.out.println("Hash of Block 2:");
		System.out.println(block2.getBlockHash());
		System.out.println("Hash of Block 3:");
		System.out.println(block3.getBlockHash());
		System.out.println("Hash of Block 4:");
		System.out.println(block4.getBlockHash());
		
	}
}
