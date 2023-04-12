package ExcelUtils;

public class DemoExcel {
	
	public static void main (String[] args) {
		
		ExcelIO reader = new ExcelIO ("src\\main\\java\\ExcelUtils\\ValidLogin.xlsx");
	    String sheetName = "Sheet1";
	    
	 String data = reader.getCellData(sheetName, 1, 2);
	 System.out.println (data);
	 
	 
	 

	}
		
	}

	