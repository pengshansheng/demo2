package 栈;


public class testMath {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(3);
	    String str = "12<a[b{c}]>";
	    char[] cha = str.toCharArray();
	    for(char c : cha){
	        switch (c) {
	        case '{':
	        case '[':
	        case '<':
	            stack.push(c);
	            break;
	        case '}':
	        case ']':
	        case '>':
	            if(!stack.isEmpty()){
	                char ch = stack.pop().toString().toCharArray()[0];
	                if(c=='}' && ch != '{'
	                    || c==']' && ch != '['
	                    || c==')' && ch != '('){
	                    System.out.println("Error:"+ch+"-"+c);
	                }
	            }
	            break;
	        default:
	            break;
	        }
	    }
	}
    
}
