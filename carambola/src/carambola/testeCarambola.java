package carambola;

	public class testeCarambola {

		public static void main(String[] args) {
			
			List<int> x = new List<int>() {1,2,3,4,5};
	        List<int> y = new List<int>() {10,20,30};
	        
	        x.InsertRange(2,y);
	        x.Sort();
	        x.RemoveRange(6,2);
	  Console.WriteLine(string.Join(",", x));
	  Console.ReadKey();

		}
		

}
