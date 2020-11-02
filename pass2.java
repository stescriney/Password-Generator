public class pass2{
	
	
	
	private String fName;
	private String sName;
	private String login;
	
	
	public void setFName(String fName){
		this.fName = fName;
	}
	
	
	public void setSName(String sName){
		this.sName = sName;
	}
	
	
	
	public String getLogin(){
		return login;
	}
	
	
	public pass2(){
		
	}
	
	
	
	public void genLog(){
		
		StringBuffer buff = new StringBuffer();
		
		int len = fName.length();
		
		for(int i =0;i<len;i++){
			
			char n = fName.charAt(i);
			
			switch (n){
				
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					buff.append(n);
					break;
				default:
					buff.append("");
					break;
				
				
				}//close switch

			}//close for loop
		
		
		login = (sName + fName);
		login = buff.toString();
		
		
		}//close method
	}