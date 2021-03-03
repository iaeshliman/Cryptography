
public class Vigenere
{
	private static final int SIZE = 26;
	private static char[][] table = initializeTable();
	
	// Initializes the table of characters
	private static char[][] initializeTable()
	{
		table = new char[SIZE][SIZE];
		for(char i=0; i<SIZE; i++) { for(char j=0; j<SIZE; j++) { table[i][j] = loopChar((char)('A'+i+j)); } }
		return table;
	}
	
	// Ensures that if the character goes past Z it loops back around to A
	private static char loopChar(char c)
	{
		if(c>'Z') return (char)(c%'Z'+'A'-1);
		return c;
	}
	
	// Prints the contents of the table
	public static void printTable()
	{
		String result = "";
		for(char[] outer : table)
		{
			for(char inner : outer) result += inner + ", ";
			result += "\n";
		}
		System.out.println(result);
	}
}
