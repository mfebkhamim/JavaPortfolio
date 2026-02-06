public class Student{
	
	//Ini adalah Attributes 
	public String nama;
	public String nrp;
	public String departemen;
	public String kampus;
	public int umur;
	public int angkatan;
	
	//Ini Constructor
	public Student(){
		this.umur = -1;
		this.angkatan = -1;
	}
	
	//Ini adalah Setter
	public Student nama(String nama){
		this.nama = nama;
		return this;
	}
	public Student nrp(String nrp) {
		this.nrp = nrp;
		return this;
	}
	public Student departemen(String departemen){
		this.departemen = departemen;
		return this;
	}
	public Student kampus(String kampus){
		this.kampus = kampus;
		return this;
	}
	public Student umur(int umur){
		this.umur = umur;
		return this;
	}
	public Student angkatan(int angkatan){
		this.angkatan = angkatan;
		return this;
	}
	
	//Ini adalah member method
	public Student clone(){
		Student MahasiswaClone = new Student();
		MahasiswaClone.nama = this.nama;
		MahasiswaClone.nrp = this.nrp;
		MahasiswaClone.departemen = this.departemen;
		MahasiswaClone.kampus = this.kampus;
		MahasiswaClone.umur = this.umur;
		MahasiswaClone.angkatan = this.angkatan;
		return MahasiswaClone;
	}
	public String toString(){
		return this.nama + " adalah mahasiswa " + this.departemen + " dari kampus " + this.kampus + 
								" angkatan " + this.angkatan + " yang berumur " + this.umur + ".";
	}
}