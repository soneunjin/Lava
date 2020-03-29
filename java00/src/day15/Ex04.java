package day15;
/*
  	String 클래스는 고정 길이로 되어있기 때문에
  	 한 번 작성한 문자열 뒤에 문자열을 추가하게 되면
  	  새로운 문자열을 작성하게 됩니다.
	StringBuilder 클래스는 가변길이의 문자열을 사용하는 클래스로
	 문자를 추가해도 새로운 오브젝트를 작성하지 않고 
	 문자열을 추가합니다.
 */
public class Ex04 {
	// StringBuilder
	public static void main(String[] args) {
		resultCheck("Sam", 89);
	    resultCheck("Jeny", 45);
	    resultCheck("Tom", 67);
	    resultCheck("Yon", 92);
	}
	private static void resultCheck(String name, int tokuten){

	    StringBuilder sb = new StringBuilder();
	    sb.append(name);
	    sb.append("의 성정은");
	    sb.append(tokuten);
	    sb.append("점 입니다.결과는");

	    if (tokuten > 75){
	      sb.append("합격");
	    }else{
	      sb.append("불합격");
	    }

	    sb.append("입니다.");
	    System.out.println(new String(sb));
}
}
