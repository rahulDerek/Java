package collections;

interface I1{
	public void searchByKeyword(String keyWord);
	public void checkNumberofResult();
	public void checkNumberofPages();
	
	
}
public class CheckInterface implements I1 {
	

	
	@Override
	public void searchByKeyword(String keyWord) {
		System.out.println("implementation for searhcing by keyword -" + keyWord);
	}


	@Override
	public void checkNumberofResult() {
		System.out.println("implementation for checkNumberofResult");
	}


	@Override
	public void checkNumberofPages() {
		System.out.println("implementation for checkNumberofPages");
	}
   
	public static void main(String[] args) {
		
		CheckInterface c1 =new CheckInterface();
		
		c1.searchByKeyword("bell");
		c1.checkNumberofPages();
		c1.checkNumberofResult();
		
	}


	

	
	

}
