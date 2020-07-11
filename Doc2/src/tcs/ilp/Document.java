package tcs.ilp;

public class Document 
{
	private int id;
	private String title;
	private String folderName;
	private int pages;
	
	Document(int id, String title, String folderName, int pages)
	{
		this.id= id;
		this.title= title;
		this.folderName= folderName;
		this.pages=pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
