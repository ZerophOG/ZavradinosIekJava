
public class School {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.setFirstName("Konstantinos1");
		t1.setLaststName("Zavradinos");
		t1.setAMKA("00000000001");
		t1.setSubject("Mathimatika");
		t1.printInfo();
		
		Teacher t2 = new Teacher();
		t2.setFirstName("Konstantinos2");
		t2.setLaststName("Zavradinos");
		t2.setAMKA("00000000002");
		t2.setSubject("Mathimatika");
		t2.printInfo();
		
		Teacher t3 = new Teacher();
		t3.setFirstName("Konstantinos3");
		t3.setLaststName("Zavradinos");
		t3.setAMKA("00000000003");
		t3.setSubject("Mathimatika");
		t3.printInfo();
		
		Teacher t4 = new Teacher();
		t4.setFirstName("Konstantinos4");
		t4.setLaststName("Zavradinos");
		t4.setAMKA("00000000004");
		t4.setSubject("Mathimatika");
		t4.printInfo();
		
		Teacher t5 = new Teacher();
		t5.setFirstName("Konstantinos5");
		t5.setLaststName("Zavradinos");
		t5.setAMKA("00000000005");
		t5.setSubject("Mathimatika");
		t5.printInfo();
		
		Classroom c1 = new Classroom();
		c1.setClassCode("E1");
		c1.setClassDesc("Ergastirio I");
		c1.printInfo();
		
		Classroom c2 = new Classroom();
		c2.setClassCode("E2");
		c2.setClassDesc("Ergastirio II");
		c2.printInfo();

		Classroom c3 = new Classroom();
		c3.setClassCode("E3");
		c3.setClassDesc("Ergastirio III");
		c3.printInfo();
		
		Classroom c4 = new Classroom();
		c4.setClassCode("E4");
		c4.setClassDesc("Ergastirio IV");
		c4.printInfo();
		
		Classroom c5 = new Classroom();
		c5.setClassCode("E5");
		c5.setClassDesc("Ergastirio V");
		c5.printInfo();
		
		Subject s1 = new Subject();
		s1.setSubDesc("Algorithms and data structures III");
		s1.setSubCode("M1");
		s1.setClassroom("E4");
		s1.printInfo();
		
		Subject s2 = new Subject();
		s2.setSubDesc("Computer architecture and organization II");
		s2.setSubCode("M2");
		s2.setClassroom("E2");
		s2.printInfo();
		
		Subject s3 = new Subject();
		s3.setSubDesc("Programming languages and software engineering II");
		s3.setSubCode("M3");
		s3.setClassroom("E3");
		s3.printInfo();
		
		Subject s4 = new Subject();
		s4.setSubDesc("Operating systems and networking II");
		s4.setSubCode("M4");
		s4.setClassroom("E1");
		s4.printInfo();
		
		Subject s5 = new Subject();
		s5.setSubDesc("Programming languages and software engineering III");
		s5.setSubCode("M5");
		s5.setClassroom("E3");
		s5.printInfo();
		
	
		Student m1 = new Student();
		m1.setFirstName("Dimitris1");
		m1.setLaststName("Zavradinos");
		m1.setAMM("0000001");
		m1.setSubject("Algorithms and data structures");
		m1.setSubject("Computer architecture and organization");
		m1.setSubject("Programming languages and software engineering");
		m1.setSubject("Operating systems and networking");
		m1.setSubject("Artificial intelligence and machine learning");
		m1.printInfo();
		
		Student m2 = new Student();
		m2.setFirstName("Dimitris2");
		m2.setLaststName("Zavradinos");
		m2.setAMM("0000002");
		m2.setSubject("Algorithms and data structures");
		m2.setSubject("Computer architecture and organization");
		m2.setSubject("Programming languages and software engineering");
		m2.setSubject("Operating systems and networking");
		m2.setSubject("Artificial intelligence and machine learning");
		m2.printInfo();
		
		Student m3 = new Student();
		m3.setFirstName("Dimitris3");
		m3.setLaststName("Zavradinos");
		m3.setAMM("0000003");
		m3.setSubject("Algorithms and data structures");
		m3.setSubject("Computer architecture and organization");
		m3.setSubject("Programming languages and software engineering");
		m3.setSubject("Operating systems and networking");
		m3.setSubject("Artificial intelligence and machine learning");
		m3.printInfo();
		
		Student m4 = new Student();
		m4.setFirstName("Dimitris4");
		m4.setLaststName("Zavradinos");
		m4.setAMM("0000004");
		m4.setSubject("Algorithms and data structures");
		m4.setSubject("Computer architecture and organization");
		m4.setSubject("Programming languages and software engineering");
		m4.setSubject("Operating systems and networking");
		m4.setSubject("Artificial intelligence and machine learning");
		m4.printInfo();
		
		Student m5 = new Student();
		m5.setFirstName("Dimitris5");
		m5.setLaststName("Zavradinos");
		m5.setAMM("0000005");
		m5.setSubject("Algorithms and data structures");
		m5.setSubject("Computer architecture and organization");
		m5.setSubject("Programming languages and software engineering");
		m5.setSubject("Operating systems and networking");
		m5.setSubject("Artificial intelligence and machine learning");
		m5.printInfo();
		
		Student m6 = new Student();
		m6.setFirstName("Dimitris6");
		m6.setLaststName("Zavradinos");
		m6.setAMM("0000006");
		m6.setSubject("Algorithms and data structures");
		m6.setSubject("Computer architecture and organization");
		m6.setSubject("Programming languages and software engineering");
		m6.setSubject("Operating systems and networking");
		m6.setSubject("Artificial intelligence and machine learning");
		m6.printInfo();
		
		Student m7 = new Student();
		m7.setFirstName("Dimitris7");
		m7.setLaststName("Zavradinos");
		m7.setAMM("0000007");
		m7.setSubject("Algorithms and data structures");
		m7.setSubject("Computer architecture and organization");
		m7.setSubject("Programming languages and software engineering");
		m7.setSubject("Operating systems and networking");
		m7.setSubject("Artificial intelligence and machine learning");
		m7.printInfo();
		
		Student m8 = new Student();
		m8.setFirstName("Dimitris8");
		m8.setLaststName("Zavradinos");
		m8.setAMM("0000008");
		m8.setSubject("Algorithms and data structures");
		m8.setSubject("Computer architecture and organization");
		m8.setSubject("Programming languages and software engineering");
		m8.setSubject("Operating systems and networking");
		m8.setSubject("Artificial intelligence and machine learning");
		m8.printInfo();
		
		Student m9 = new Student();
		m9.setFirstName("Dimitris9");
		m9.setLaststName("Zavradinos");
		m9.setAMM("0000009");
		m9.setSubject("Algorithms and data structures");
		m9.setSubject("Computer architecture and organization");
		m9.setSubject("Programming languages and software engineering");
		m9.setSubject("Operating systems and networking");
		m9.setSubject("Artificial intelligence and machine learning");
		m9.printInfo();
		
		Student m10 = new Student();
		m10.setFirstName("Dimitris10");
		m10.setLaststName("Zavradinos");
		m10.setAMM("0000010");
		m10.setSubject("Algorithms and data structures");
		m10.setSubject("Computer architecture and organization");
		m10.setSubject("Programming languages and software engineering");
		m10.setSubject("Operating systems and networking");
		m10.setSubject("Artificial intelligence and machine learning");
		m10.printInfo();
		
		Student m11 = new Student();
		m11.setFirstName("Dimitris11");
		m11.setLaststName("Zavradinos");
		m11.setAMM("0000011");
		m11.setSubject("Algorithms and data structures");
		m11.setSubject("Computer architecture and organization");
		m11.setSubject("Programming languages and software engineering");
		m11.setSubject("Operating systems and networking");
		m11.setSubject("Artificial intelligence and machine learning");
		m11.printInfo();
		
		Student m12 = new Student();
		m12.setFirstName("Dimitris12");
		m12.setLaststName("Zavradinos");
		m12.setAMM("0000012");
		m12.setSubject("Algorithms and data structures");
		m12.setSubject("Computer architecture and organization");
		m12.setSubject("Programming languages and software engineering");
		m12.setSubject("Operating systems and networking");
		m12.setSubject("Artificial intelligence and machine learning");
		m12.printInfo();
		
		Student m13 = new Student();
		m13.setFirstName("Dimitris13");
		m13.setLaststName("Zavradinos");
		m13.setAMM("0000013");
		m13.setSubject("Algorithms and data structures");
		m13.setSubject("Computer architecture and organization");
		m13.setSubject("Programming languages and software engineering");
		m13.setSubject("Operating systems and networking");
		m13.setSubject("Artificial intelligence and machine learning");
		m13.printInfo();
		
		Student m14 = new Student();
		m14.setFirstName("Dimitris14");
		m14.setLaststName("Zavradinos");
		m14.setAMM("0000014");
		m14.setSubject("Algorithms and data structures");
		m14.setSubject("Computer architecture and organization");
		m14.setSubject("Programming languages and software engineering");
		m14.setSubject("Operating systems and networking");
		m14.setSubject("Artificial intelligence and machine learning");
		m14.printInfo();
		
		Student m15 = new Student();
		m15.setFirstName("Dimitris15");
		m15.setLaststName("Zavradinos");
		m15.setAMM("0000015");
		m15.setSubject("Algorithms and data structures");
		m15.setSubject("Computer architecture and organization");
		m15.setSubject("Programming languages and software engineering");
		m15.setSubject("Operating systems and networking");
		m15.setSubject("Artificial intelligence and machine learning");
		m15.printInfo();
		
		Student m16 = new Student();
		m16.setFirstName("Dimitris16");
		m16.setLaststName("Zavradinos");
		m16.setAMM("0000016");
		m16.setSubject("Algorithms and data structures");
		m16.setSubject("Computer architecture and organization");
		m16.setSubject("Programming languages and software engineering");
		m16.setSubject("Operating systems and networking");
		m16.setSubject("Artificial intelligence and machine learning");
		m16.printInfo();
		
		Student m17 = new Student();
		m17.setFirstName("Dimitris17");
		m17.setLaststName("Zavradinos");
		m17.setAMM("0000017");
		m17.setSubject("Algorithms and data structures");
		m17.setSubject("Computer architecture and organization");
		m17.setSubject("Programming languages and software engineering");
		m17.setSubject("Operating systems and networking");
		m17.setSubject("Artificial intelligence and machine learning");
		m17.printInfo();
		
		Student m18 = new Student();
		m18.setFirstName("Dimitris19");
		m18.setLaststName("Zavradinos");
		m18.setAMM("0000018");
		m18.setSubject("Algorithms and data structures");
		m18.setSubject("Computer architecture and organization");
		m18.setSubject("Programming languages and software engineering");
		m18.setSubject("Operating systems and networking");
		m18.setSubject("Artificial intelligence and machine learning");
		m18.printInfo();
		
		Student m19 = new Student();
		m19.setFirstName("Dimitris19");
		m19.setLaststName("Zavradinos");
		m19.setAMM("0000019");
		m19.setSubject("Algorithms and data structures");
		m19.setSubject("Computer architecture and organization");
		m19.setSubject("Programming languages and software engineering");
		m19.setSubject("Operating systems and networking");
		m19.setSubject("Artificial intelligence and machine learning");
		m19.printInfo();
		
		Student m20 = new Student();
		m20.setFirstName("Dimitris20");
		m20.setLaststName("Zavradinos");
		m20.setAMM("0000020");
		m20.setSubject("Algorithms and data structures");
		m20.setSubject("Computer architecture and organization");
		m20.setSubject("Programming languages and software engineering");
		m20.setSubject("Operating systems and networking");
		m20.setSubject("Artificial intelligence and machine learning");
		m20.printInfo();
		

	}

}
