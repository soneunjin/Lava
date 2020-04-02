package day18;


public class Stud implements Comparable{
	private String name;
	private int no;
	private int ban;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	public Stud() {}
	public Stud(String name, int no, int ban, int kor, int eng, int math) {
		this.name=name;
		this.no=no;
		this.ban=ban;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		setTotal();
		setAvg();
	
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = kor + eng + math;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total / 3;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	@Override
	public int compareTo(Object o) {
		Stud s = (Stud) o;
		
		int result = this.getName().compareTo(s.getName()); 
		return result;
		
	}

}
