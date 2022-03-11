



public class InsertIntoVector {
	static String [] neww = {"apple", "car", "dog", ""};
	
	public static void main(String args []) {
		start(neww, "bannana");
	}
	public static void start(String [] words, String word) {
		int ins = -1;
		String [] hm = words;
		for(int i = 0; i < words.length; i++) {
			if(words[i].compareTo(word) > 0) {
				ins = i;
				break;
			}
		}
		if(ins == -1){
			words[words.length - 1] = word;
			for(int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
			return;
		}

		for(int i = words.length -1; i > ins; i--) {
			words[i] = hm[i - 1];
		}
		words[ins] = word;
		//System.out.println(ins);
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		
		
	}
	

}
