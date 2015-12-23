import java.util.StringTokenizer;


public class TestSplitting {
	
	public String splitAccording(String str){
	
		
		StringBuffer sb=new StringBuffer();
		int strLength=str.length();int start=0;
		if(strLength>25){
			for(int i=0;i<=Math.ceil(str.length()/25);i++){
				if(start+25>strLength){
					sb.append(str.substring(start, strLength));
				}
				else {
					sb.append(str.substring(start, start+25));
					}
			sb.append(System.getProperty("line.separator"));
			start=start+25;
			}
		}
		return sb.toString();
	}
	
	
public String splitAccordingMethod(String str){
	
		
		StringBuffer sb=new StringBuffer();
		  StringTokenizer st = new StringTokenizer(str);String token;int numberOfTOkens=0;
		  while (st.hasMoreTokens()) {
			  token=st.nextToken();numberOfTOkens++;
			  if(numberOfTOkens%6==0) sb.append(System.getProperty("line.separator"));
			  sb.append(token);sb.append(" ");
		       //  System.out.println(st.nextToken());
		     }
		return sb.toString();
	}
	
	
	public static void main(String[] args){
		TestSplitting ts=new TestSplitting();
	System.out.println(	ts.splitAccordingMethod("Issue CQ00492822 Open SAS: DiskQual: Dual Port hangs on 4 Samsung Drive during Persistent Bad Cable Test (F/W: CQPF & CQSF)"));
	}

}
