


abstract class Book{
	 String title;
	
			
	abstract void setTitle(String s); 
	
	String getTitle() {
	    return title;
	}
	
	public void getTitle(String s) {
	    title = s;
	}
}


class MyBook extends Book
{
	public void setTitle(String s) {
	
	title= s;
}
}