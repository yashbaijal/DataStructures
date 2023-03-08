class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str = "{name = rahul,email = rahul@knf.co.in,gender = male}";
		
		str=str.substring(1,str.length()-1);
		
		String [] keyValue=str.split(",");
		
		Map<String,String> map=new HashMap<String,String>();
		
		for(String pair:keyValue)
		{
		    String [] e=pair.split("=");
		    map.put(e[0].trim(),e[1].trim());
		}
		
		System.out.println(map);
	}
}
