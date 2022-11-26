package comareTest;

class Student2 implements Comparable<Student2> {
	 
	int age;			// 나이
	int classNumber;	// 학급
	
	Student2(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
	
	@Override
	public int compareTo(Student2 o) {
 
		/*
		 * 만약 자신의 age가 o의 age보다 크다면 양수가 반환 될 것이고,
		 * 같다면 0을, 작다면 음수를 반환할 것이다.
		 */
		return this.age - o.age;
	}
}